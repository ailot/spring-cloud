package com.gome.eureka.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author LiTao
 * @Date 2016-11-30
 * @Email litao28@gome.com.cn
 * @Desc
 */

@FeignClient("eureka-client")
public interface ConsumerService {

    @RequestMapping("/")
    String home();
}
