package com.tetrips.api.userproject;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tetrips.api.project.ProjectRepository;
import com.tetrips.api.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
