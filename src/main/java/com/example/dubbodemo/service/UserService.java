package com.example.dubbodemo.service;

import com.example.dubbodemo.entity.UserInfo;

/**
 * @author Greiz
 * @title: UserService
 * @ProjectName dubbodemo
 * @Description: 用户Service
 * @date 2020/2/12 11:32
 */
public interface UserService {

    /**
     *
     * @param id
     * @param name
     * @return  返回一个user
     */
    UserInfo getUser(String id, String name);

}
