package com.gome.netflix.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author LiTao
 * @Date 2016-11-24
 * @Email litao28@gome.com.cn
 * @Desc
 */

@SpringCloudApplication
@EnableZuulProxy
public class NetflixZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixZuulApplication.class);
    }
}
