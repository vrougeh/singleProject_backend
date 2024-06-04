package com.tetrips.api.userproject;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tetrips.api.project.Project;
import com.tetrips.api.project.ProjectDTO;
import com.tetrips.api.project.ProjectRepository;
import com.tetrips.api.user.User;
import com.tetrips.api.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserProjectServiceImpl implements UserProjectService {
  private final UserProjectRepository userProjectRepository;
  private final ProjectRepository projectRepository;
  private final UserRepository userRepository;
  private final JPAQueryFactory queryFactory;

  @Override
  public List<UserProject> findByUserId(Long userId) {
    return null;
  }

  @Override
  public List<UserProject> findByProjectId(Long projectId) {
    return null;
  }

  @Override
  public UserProject saveUserProject(UserProject userProject) {
    return userProjectRepository.save(userProject);
  }

  @Override
  public List<UserProject> findAllProjectByUserId(Long userId) {
    QUserProject userProject = QUserProject.userProject;
    return queryFactory.selectFrom(userProject)
            .where(userProject.user.id.eq(userId))
            .fetch();
  }

  @Override
  public List<UserProject> createUserProject(Long projectId) {
    User user = userRepository.findById(1L)
            .orElseThrow(() -> new RuntimeException("User not found"));

    Project project = projectRepository.findById(projectId)
            .orElseThrow(() -> new RuntimeException("Project not found"));

    UserProject userProject = new UserProject();
    userProject.setUser(user);
    userProject.setProject(project);

    List<UserProject> userProjects = new ArrayList<>();
    userProjects.add(userProject);

    return userProjectRepository.saveAll(userProjects);
  }

}
