package com.ruichen.managementSystem.controller;

import com.ruichen.managementSystem.pojo.entity.User;
import com.ruichen.managementSystem.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("")
    public User insert(@RequestBody @Validated User user){ //@Validated注解用于指定要验证的对象/参数，常与实体类中的@NotNUll等联用
        return userService.insertUser(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

    @DeleteMapping()
    public  void deleteIn(Integer[] ids){

    }

    @PutMapping("")
    public User update(@RequestBody @Validated User user){
        return userService.updateUser(user);
    }

    @GetMapping("/{id}")
    public User find(@PathVariable("id") Long id){
        return userService.findUserById(id);
    }

    @GetMapping("")
    public List<User> findAll(){
        return userService.findAllUser();
    }
}
