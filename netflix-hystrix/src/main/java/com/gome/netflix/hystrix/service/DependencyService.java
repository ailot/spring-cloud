package com.gome.netflix.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Author LiTao
 * @Date 2016-11-25
 * @Email litao28@gome.com.cn
 * @Desc
 */

@Component
public class DependencyService {

    private Random random = new Random();

    /**
     * 模拟获取用户信息
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public String mockGetUserInfo(){
        int randomInt = random.nextInt(10);
        if (randomInt<8){
            throw new RuntimeException("call dependency service failed.");
        }else {
            return "username:litao; number:"+randomInt;
        }
    }

    public String fallback(){
        return "some excepitno occur call fallback method.";
    }
}
