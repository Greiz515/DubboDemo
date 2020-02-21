package com.example.dubboconsumer.controller;

import com.example.dubbodemo.entity.UserInfo;
import com.example.dubbodemo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Greiz
 * @title: UserController
 * @ProjectName dubbodemo
 * @Description: user Controller
 * @date 2020/2/12 12:08
 */
@RestController
public class UserController {

    @Reference(version="1.0.0",url = "dubbo://127.0.0.1:12345")
    public UserService userService;

    @GetMapping("/user/getUser/{id}/{name}")
    public UserInfo getUser(@PathVariable String id, @PathVariable String name){
        return userService.getUser(id,name);
    }
}
