package com.controller;

import com.alibaba.fastjson.JSON;
import com.model.UserBigInfo;
import com.service.IUserService;
import com.util.PrintWriterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService iUserService;

    @RequestMapping("/select01")
    public void select01(HttpServletRequest request, HttpServletResponse response){
        List<UserBigInfo> infoList = iUserService.select01();
        String json = JSON.toJSONString(infoList);
        System.out.println(JSON.toJSONString(infoList));
        PrintWriterUtil.print(response,json);
    }
}
