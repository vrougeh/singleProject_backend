//package com.tetrips.api.plan;
//
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import lombok.RequiredArgsConstructor;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//public class PlanDAOImpl implements PlanDAO {
//  private final JPAQueryFactory factory;
//
//
//  @Override
//  public List<PlanDTO> getAllPlans() {
//    QPlan plan = QPlan.plan;
//    return factory.select(
//            new QPlanDTO(
//                    plan.id,
//                    plan.day,
//                    plan.count,
//                    plan.startTime,
//                    plan.endTime
//            )).from(plan)
//            .fetch();
//  }
//}