package com.tetrips.api.project;

import java.util.List;

public interface ProjectService {

  default Project dtoTOEntity(ProjectDTO projectDTO) {
    return Project.builder()
            .id(projectDTO.getId())
            .projectName(projectDTO.getProjectName())
            .createDate(projectDTO.getCreateDate())
            .lastEditDate(projectDTO.getLastEditDate())
            .build();
  }

  default ProjectDTO entityTODTO(Project project) {
    return ProjectDTO.builder()
            .id(project.getId())
            .projectName(project.getProjectName())
            .createDate(project.getCreateDate())
            .lastEditDate(project.getLastEditDate())
            .build();
  }

  List<ProjectDTO> getAllProjects();

  List<ProjectDTO> createProjects(List<ProjectDTO> projects);
  List<ProjectDTO> updateProjects(List<ProjectDTO> projects);
  List<ProjectDTO> deleteById(Long userId, Long projectId);
  List<ProjectDTO> deleteById(Long Id);
  List<ProjectDTO> getProjectsByUserId(Long id);
}
