package com.gome.simple.controller;

import com.gome.simple.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author LiTao
 * @Date 2016-11-24
 * @Email litao28@gome.com.cn
 * @Desc
 */
@RestController
@RefreshScope
public class UserController {

    //@Autowired
    private UserService userService;

    @Value("${name: hello}")
    private String name;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello(){
        return "Hello "+name;
    }

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public List<String> getAll(){
        return userService.getAll();
    }
}
