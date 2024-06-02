//package com.tetrips.api.plan;
//
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@ApiResponses(value = {
//        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
//        @ApiResponse(responseCode = "404", description = "Customer not found")})
//@CrossOrigin(origins ="*", allowedHeaders = "*")
//@RestController
//@RequestMapping(path = "/api/plan")
//@RequiredArgsConstructor
//@Slf4j
//public class PlanController {
//  private final PlanService planService;
//
//  @GetMapping("/findall")
//  public ResponseEntity<?> getAllPlans() {
//    return ResponseEntity.ok(planService.getAllPlans());
//  }
//
//}