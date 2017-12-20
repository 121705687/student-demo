package com.dubbo1.service;

import com.model.UserBigInfo;

import java.util.List;

public interface IUserServiceProvider {
    public String getUser();
    //获取用户信息
    List<UserBigInfo> select01();
}
