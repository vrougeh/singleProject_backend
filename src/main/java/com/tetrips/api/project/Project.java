package com.tetrips.api.project;


import com.tetrips.api.userproject.UserProject;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Project {
  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "PROJECTNAME", nullable = false)
  private String projectName;

  @Column(name = "CREATEDATE", nullable = false)
  private LocalDate createDate;

  @Column(name = "LASTEDITDATE", nullable = false)
  private LocalDateTime lastEditDate;


  @Column(name = "HOST")
  private Long host;

  @OneToMany(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  private List<UserProject> userProjects;

//  @OneToMany(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
//  private List<ProjectPlan> projectPlans;

}
