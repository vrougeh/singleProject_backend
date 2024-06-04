package com.tetrips.api.project;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tetrips.api.userproject.UserProject;
import com.tetrips.api.userproject.UserProjectRepository;
import com.tetrips.api.userproject.UserProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
  private final ProjectRepository projectRepository;
  private final UserProjectService userProjectService;

  @Override
  public List<ProjectDTO> getAllProjects() {
    List<Project> projects = projectRepository.findAllProjects();
    return projects.stream()
            .map(this::entityTODTO)
            .collect(Collectors.toList());
  }

  @Override
  public List<ProjectDTO> createProjects(List<ProjectDTO> projects) {
    List<Project> projectEntities = projects.stream()
            .map(this::dtoTOEntity)
            .collect(Collectors.toList());

    List<Project> savedProjects = projectRepository.saveAll(projectEntities);

    // 첫 번째 프로젝트의 ID를 가져옴
    Long projectId = savedProjects.get(0).getId();

    // 필요시 UserProjectService 호출
     userProjectService.createUserProject(projectId);

    return savedProjects.stream()
            .map(this::entityTODTO)
            .collect(Collectors.toList());
  }

  @Override
  public List<ProjectDTO> updateProjects(List<ProjectDTO> projects) {
    List<Project> projectEntities = projects.stream()
            .map(this::dtoTOEntity)
            .toList();

    // 업데이트 전에 기존 엔티티를 가져옴
    List<Long> projectIds = projectEntities.stream().map(Project::getId).collect(Collectors.toList());
    List<Project> existingProjects = projectRepository.findAllById(projectIds);

    // 기존 엔티티와 업데이트된 엔티티를 매핑하여 연관된 엔티티 업데이트
    for (Project existingProject : existingProjects) {
      for (Project updatedProject : projectEntities) {
        if (existingProject.getId().equals(updatedProject.getId())) {
          existingProject.setProjectName(updatedProject.getProjectName());
          existingProject.setLastEditDate(updatedProject.getLastEditDate());

          // 기존 userProjects를 업데이트, null 체크 추가
          if (existingProject.getUserProjects() == null) {
            existingProject.setUserProjects(new ArrayList<>());
          }

          if (updatedProject.getUserProjects() != null) {
            existingProject.getUserProjects().clear();
            existingProject.getUserProjects().addAll(updatedProject.getUserProjects());
          }
        }
      }
    }

    projectRepository.saveAll(existingProjects);

    return existingProjects.stream()
            .map(this::entityTODTO)
            .collect(Collectors.toList());
  }

  @Override
  public List<ProjectDTO> deleteById(Long userId, Long projectId) {
    projectRepository.deleteById(projectId);
    return getProjectsByUserId(userId);
  }

  @Override

  public List<ProjectDTO> deleteById(Long Id) {
    projectRepository.deleteById(Id);
    return getProjectsByUserId(Id);
  }

  @Override
  public List<ProjectDTO> getProjectsByUserId(Long userId) {
    List<UserProject> userProjects = userProjectService.findAllProjectByUserId(userId);
    List<Project> projects = userProjects.stream()
            .map(UserProject::getProject)
            .toList();
    return projects.stream()
            .map(this::entityTODTO)
            .collect(Collectors.toList());
  }


  //crud 당담
  //project crud -> userproject crud 명령 + DAO crud 실행
}
