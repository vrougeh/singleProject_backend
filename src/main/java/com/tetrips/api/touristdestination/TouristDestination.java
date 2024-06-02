//package com.tetrips.api.touristdestination;
//
//import com.tetrips.api.plan.Plan;
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
//public class TouristDestination {
//  @Id
//  @Column(name = "ID", nullable = false)
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Long id;
//
//  @OneToMany(mappedBy = "touristDestination", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
//  private List<Plan> plan;
//}
