package com.tetrips.api.userproject;

import com.tetrips.api.project.Project;
import com.tetrips.api.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserProject {
  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "USER_ID", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
  private User user;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PROJECT_ID", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
  private Project project;

}

