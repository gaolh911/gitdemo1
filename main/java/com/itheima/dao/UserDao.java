package com.itheima.dao;

import com.itheima.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户的持久层
 */
public interface UserDao {
    @Select("select * from user where username=#{username} and password=#{password}")
    User findUser(@Param("username")String username,@Param("password")String password);
}
