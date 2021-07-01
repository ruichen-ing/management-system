package com.ruichen.managementSystem.service;

import com.ruichen.managementSystem.pojo.entity.User;

import java.util.List;

public interface UserService {
    //定义增删改查接口
    User insertUser(User user);

    void deleteUser(Long id);

    void deleteUserIn(Integer[] id);

    User updateUser(User user);

    User findUserById(Long id);

    List<User> findAllUser();
}
