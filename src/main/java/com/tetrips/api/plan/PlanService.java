//package com.tetrips.api.plan;
//
//import java.util.List;
//
//public interface PlanService {
//
//  default Plan dtoToEntity(PlanDTO planDTO){
//    return Plan.builder()
//            .id(planDTO.getId())
//            .day(planDTO.getDay())
//            .startTime(planDTO.getStartTime())
//            .endTime(planDTO.getEndTime())
//            .build();
//  }
//
//  default PlanDTO entityToDto(Plan plan){
//    return PlanDTO.builder()
//            .id(plan.getId())
//            .day(plan.getDay())
//            .startTime(plan.getStartTime())
//            .endTime(plan.getEndTime())
//            .build();
//  }
//
//  List<PlanDTO> getAllPlans();
//}
