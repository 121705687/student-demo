package com.dubbo1.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo1.service.IUserServiceProvider;
import com.model.UserBigInfo;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component  //spring bean的注解
@Service    //dubbo的注解
public class UserServiceProviderImpl implements IUserServiceProvider{
    @Autowired
//    @Resource(name = "iUserService")
    IUserService iUserService;//获取底层数据

    public String getUser() {
        return "dubbo调用成功";
    }

    public List<UserBigInfo> select01() {
        return iUserService.select01();
    }
}
