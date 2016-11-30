package com.gome.eureka.client.controller;

import com.gome.eureka.client.service.ConsumerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author LiTao
 * @Date 2016-11-24
 * @Email litao28@gome.com.cn
 * @Desc
 */
@RestController
public class HomeController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/")
    public String home(){
        return consumerService.home();
    }
}
