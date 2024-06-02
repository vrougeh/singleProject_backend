package com.tetrips.api.project;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@NoArgsConstructor
@Data
@Builder
@Log4j2
public class ProjectDTO {

  private Long id;
  private String projectName;
  private LocalDate createDate;
  private LocalDateTime lastEditDate;
  private Long host;

  @QueryProjection
  public ProjectDTO(Long id, String projectName, LocalDate createDate, LocalDateTime lastEditDate, Long host) {
    this.id = id;
    this.projectName = projectName;
    this.createDate = createDate;
    this.lastEditDate = lastEditDate;
    this.host = host;
  }
}
