package com.ruichen.managementSystem.service;

import com.ruichen.managementSystem.pojo.entity.User;
import com.ruichen.managementSystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Resource
    private UserRepository userRepository;

    @Override
    public User insertUser(User user){
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    @Override
    public void deleteUserIn(Integer[] id){

    }

    @Override
    public User updateUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User findUserById(Long id){
        //找到则返回user,否则返回null
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAllUser(){
        return userRepository.findAll();
    }
}
