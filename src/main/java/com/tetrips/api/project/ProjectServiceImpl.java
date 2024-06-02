package com.tetrips.api.project;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tetrips.api.userproject.UserProject;
import com.tetrips.api.userproject.UserProjectRepository;
import com.tetrips.api.userproject.UserProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
  private final ProjectRepository projectRepository;
  private final UserProjectService userProjectService;
  private final JPAQueryFactory queryFactory;

  @Override
  public List<ProjectDTO> getAllProjects() {
    List<Project> projects = projectRepository.findAllProjects();
    return projects.stream()
            .map(this::entityTODTO)
            .collect(Collectors.toList());
  }

  @Override
  public List<ProjectDTO> createProjects(List<ProjectDTO> projects) {
    List<Project> project = projects.stream()
            .map(this::dtoTOEntity)
            .collect(Collectors.toList());
    projectRepository.saveAll(project);
    return project.stream()
            .map(this::entityTODTO)
            .collect(Collectors.toList());
  }

  @Override
  public List<ProjectDTO> updateProjects(List<ProjectDTO> projects) {
    List<Project> project = projects.stream()
            .map(this::dtoTOEntity)
            .collect(Collectors.toList());
    projectRepository.saveAll(project);
    return project.stream()
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
