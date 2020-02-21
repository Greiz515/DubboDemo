package com.example.dubboproducer.service.impl;

import com.example.dubbodemo.entity.UserInfo;
import com.example.dubbodemo.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Greiz
 * @title: UserServiceImpl
 * @ProjectName dubbodemo
 * @Description: userService的实现
 * @date 2020/2/12 11:50
 */

@Service(version= "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserInfo getUser(String id, String name){
        UserInfo user=new UserInfo();
        user.setId(id);
        user.setName(name);
        return user;

    }


}
