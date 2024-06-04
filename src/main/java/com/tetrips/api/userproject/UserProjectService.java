package com.tetrips.api.userproject;

import com.tetrips.api.project.Project;

import java.util.List;

public interface UserProjectService {
  List<UserProject> findByUserId(Long userId);
  List<UserProject> findByProjectId(Long projectId);
  UserProject saveUserProject(UserProject userProject);
  List<UserProject> findAllProjectByUserId(Long userId);
  List<UserProject> createUserProject(Long projectIds);

  //project 생성시 자동생성, project 나가기 시 자동삭제, project 삭제시 자동삭제 -> DAO crud 실행, userid로 project 조회 생성
  //간단 기능은 DAO에서 생성하고 참조로 가져오기 repository에 참조되어있어 repository 참조 후 가져오기
}
