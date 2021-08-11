package com.itheima.controller;

import com.itheima.entity.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("findUser")
    public User findUser(@RequestBody String username, String password){
        return userService.login(username, password);
    }
}
