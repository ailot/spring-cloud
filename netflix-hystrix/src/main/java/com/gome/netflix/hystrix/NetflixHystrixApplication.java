package com.gome.netflix.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author LiTao
 * @Date 2016-11-24
 * @Email litao28@gome.com.cn
 * @Desc
 */

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class NetflixHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixHystrixApplication.class);
    }
}
