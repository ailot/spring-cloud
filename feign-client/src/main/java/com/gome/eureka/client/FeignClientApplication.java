package com.gome.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author LiTao
 * @Date 2016-11-24
 * @Email litao28@gome.com.cn
 * @Desc
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class FeignClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(FeignClientApplication.class);
    }
}
