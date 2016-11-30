package com.gome.netflix.hystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author LiTao
 * @Date 2016-11-25
 * @Email litao28@gome.com.cn
 * @Desc
 */

@Service
public class HystrixService {

    @Autowired
    private DependencyService dependencyService;

    public String callService(){
        return dependencyService.mockGetUserInfo();
    }
}
