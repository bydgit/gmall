package com.atguigu.gmall.order.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    UserService userService;

    @RequestMapping("/trade")
    @ResponseBody
    public List<UserAddress> trade(String userId){
        return userService.getUserAddress(userId);
    }
}
