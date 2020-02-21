package com.example.dubbodemo.entity;

import java.io.Serializable;

/**
 * @author Greiz
 * @title: UserInfo
 * @ProjectName dubbodemo
 * @Description: 测试用户类
 * @date 2020/2/12 11:29
 */
public class UserInfo implements Serializable {

    private String name;

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
