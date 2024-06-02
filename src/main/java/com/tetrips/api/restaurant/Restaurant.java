//package com.tetrips.api.restaurant;
//
//import com.tetrips.api.plan.Plan;
//import com.tetrips.api.projectplan.ProjectPlan;
//import jakarta.persistence.*;
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import java.util.List;
//
//@Entity
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Getter
//public class Restaurant {
//  @Id
//  @Column(name = "ID", nullable = false)
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Long id;
//
//  @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
//  private List<Plan> plan;
//}
