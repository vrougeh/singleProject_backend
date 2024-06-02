package com.tetrips.api.userproject;

import com.tetrips.api.project.Project;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
@CrossOrigin(origins ="*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api/userproject")
@RequiredArgsConstructor
@Slf4j
public class UserProjectController {
  private final UserProjectService userProjectService;

}
