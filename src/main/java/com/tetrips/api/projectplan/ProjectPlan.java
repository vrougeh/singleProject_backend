//package com.tetrips.api.projectplan;
//
//import com.tetrips.api.project.Project;
//import jakarta.persistence.*;
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Entity
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Getter
//public class ProjectPlan {
//  //project, plan manytomany 구현
//  @Id
//  @Column(name = "ID", nullable = false)
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Long id;
//
//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "PROJECT_ID", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
//  private Project project;
//
////  @ManyToOne(fetch = FetchType.LAZY)
////  @JoinColumn(name = "PLAN_ID", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
////  private Plan plan;
//
//}
