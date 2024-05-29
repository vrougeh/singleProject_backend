package com.tetrips.api.project;

import com.tetrips.api.plan.Plan;
import com.tetrips.api.userprojects.UserProjects;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Project {
  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "PROJECTNAME", nullable = false)
  private String projectName;

  @Column(name = "CREATEDATE", nullable = false)
  private Date createDate;

  @Column(name = "LASTEDITDATE", nullable = false)
  private Date lastEditDate;

  @OneToMany(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  private List<UserProjects> userProjects;

  @OneToOne
  @JoinColumn(name = "PLAN_ID")
  private Plan plan;
}
