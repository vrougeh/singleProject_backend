package com.tetrips.api.project;

import com.tetrips.api.userproject.UserProjectDTO;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
@CrossOrigin(origins ="*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api/project")
@RequiredArgsConstructor
@Slf4j
public class ProjectController {
  private final ProjectService projectService;

  @GetMapping("/getAll")
  public ResponseEntity<List<ProjectDTO>> getAllProjects() {
    List<ProjectDTO> projects = projectService.getAllProjects();
    return ResponseEntity.ok(projects);
  }

//  @PostMapping("/create")
//  public List<ProjectDTO> createProjects(@RequestBody Long userId, @RequestBody List<ProjectDTO> projects) {
//    return projectService.createProjects(userId, projects);
//  }

  @PostMapping("/create")
  public List<ProjectDTO> createProjects(@RequestBody List<ProjectDTO> projects) {
    return projectService.createProjects(projects);
  }

  @PutMapping("/update")
  public ResponseEntity<List<ProjectDTO>> updateProjects(@RequestBody List<ProjectDTO> projects) {
    List<ProjectDTO> updatedProjects = projectService.updateProjects(projects);
    return ResponseEntity.ok(updatedProjects);
  }

  @DeleteMapping("/delete")
  public ResponseEntity<List<ProjectDTO>> deleteProjectById(@RequestBody UserProjectDTO request) {
//    List<ProjectDTO> projects = projectService.deleteProjectById(request.getUserId(), request.getProjectId());
    List<ProjectDTO> projects = projectService.deleteById(request.getId());
    return ResponseEntity.ok(projects);
  }

  @PostMapping("/get")
  public ResponseEntity<List<ProjectDTO>> getProjectsByUserId(@RequestBody UserProjectDTO request) {
    List<ProjectDTO> projects = projectService.getProjectsByUserId(request.getUserId());
    return ResponseEntity.ok(projects);
  }
}
