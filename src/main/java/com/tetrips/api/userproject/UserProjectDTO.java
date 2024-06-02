package com.tetrips.api.userproject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
@Builder
@Log4j2
@AllArgsConstructor
public class UserProjectDTO {

  private Long id;
  private Long userId;
  private Long projectId;

}
