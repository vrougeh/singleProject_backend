//package com.tetrips.api.plan;
//
//import com.querydsl.core.annotations.QueryProjection;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//
//
//@Component
//@NoArgsConstructor
//@Data
//@Builder
//@Log4j2
//public class PlanDTO {
//  private Long id;
//  private LocalDate day;
//  private Integer count;
//  private LocalTime startTime;
//  private LocalTime endTime;
//
//  @QueryProjection
//  public PlanDTO(Long id, LocalDate day, Integer count, LocalTime startTime, LocalTime endTime) {
//    this.id = id;
//    this.day = day;
//    this.count = count;
//    this.startTime = startTime;
//    this.endTime = endTime;
//  }
//}
