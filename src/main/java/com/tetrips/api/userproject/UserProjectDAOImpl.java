package com.tetrips.api.userproject;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserProjectDAOImpl implements UserProjectDAO {
  private final JPAQueryFactory factory;

}
