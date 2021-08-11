package com.itheima.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类
 */
@Data
public class User implements Serializable {

    private String username;//用户名，账号
    private String password;//密码


}
