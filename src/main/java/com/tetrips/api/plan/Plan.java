package com.tetrips.api.plan;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Plan {
  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "DAY")
  private Integer day;

  @Column(name = "COUNT", nullable = false)
  private Integer count;

  @Column(name = "STARTTIME")
  private Date startTime;

  @Column(name = "ENDTIME")
  private Date endTime;

//  @OneToOne(mappedBy = "plan")
//  private Project project;
}
