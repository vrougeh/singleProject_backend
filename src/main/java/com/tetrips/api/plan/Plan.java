//package com.tetrips.api.plan;
//
//import com.tetrips.api.projectplan.ProjectPlan;
//import com.tetrips.api.restaurant.Restaurant;
//import com.tetrips.api.touristdestination.TouristDestination;
//import com.tetrips.api.user.User;
//import jakarta.persistence.*;
//import lombok.*;
//import org.springframework.cglib.core.Local;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Getter
//@Setter
//@Builder
//@AllArgsConstructor
//public class Plan {
//  @Id
//  @Column(name = "ID", nullable = false)
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Long id;
//
//  @Column(name = "DAY")
//  private LocalDate day;
//
//  @Column(name = "COUNT", nullable = false)
//  private Integer count; //몇번째를 나타내는 것인데 필요없을지도
//
//  @Column(name = "STARTTIME")
//  private LocalTime startTime;
//
//  @Column(name = "ENDTIME")
//  private LocalTime endTime;
//
////  @OneToMany(mappedBy = "plan", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
////  private List<ProjectPlan> projectPlans;
//
//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "RESTAURANT_ID", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
//  private Restaurant restaurant;
//
//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "TOURISTDESTINATION_ID", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
//  private TouristDestination touristDestination;
//
//
//}
