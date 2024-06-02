package com.tetrips.api.project;

import java.util.List;

public interface ProjectDAO {
  List<ProjectDTO> getAllProjects();
  List<Project> findAllProjects();
  //project crud
}
