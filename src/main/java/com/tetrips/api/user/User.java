package com.tetrips.api.user;

import com.tetrips.api.userprojects.UserProjects;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User {
  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "EMAIL", nullable = false)
  private String EMAIL;

  @Column(name = "PASSWORD", nullable = false)
  private String password;

  @Column(name = "GENDER", nullable = true)
  private boolean gender;

  @Column(name = "BIIRTH_DATE", nullable = true)
  private String birthDate;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  private List<UserProjects> userProjects;


}