package com.gome.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LiTao
 * @Date 2016-11-24
 * @Email litao28@gome.com.cn
 * @Desc
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("service - 2");
        return "hello world 7071";
    }
}
