package com.tetrips.api.project;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.tetrips.api.project.QProject.project;

@RequiredArgsConstructor
public class ProjectDAOImpl implements ProjectDAO{
  private final JPAQueryFactory queryFactory;

  @Override
  public List<ProjectDTO> getAllProjects() {
    QProject project = QProject.project;
    return queryFactory.select(
            new QProjectDTO(
                    project.id,
                    project.projectName,
                    project.createDate,
                    project.lastEditDate,
                    project.host
            )).from(project).fetch();
  }

  @Override
  public List<Project> findAllProjects() {
    return queryFactory
            .selectFrom(project)
            .fetch();
  }
}
