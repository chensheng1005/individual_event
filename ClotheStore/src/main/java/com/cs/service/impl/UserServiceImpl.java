package com.cs.service.impl;

import com.cs.entity.User;

import java.util.List;

public interface UserServiceImpl {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    User selectByPrimaryKey(Integer userId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}
