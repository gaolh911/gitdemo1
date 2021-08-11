package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User login(String username, String password) {
        return userDao.findUser(username, password);
    }
}
