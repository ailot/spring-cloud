package com.gome.admin.monitor;

import de.codecentric.boot.admin.config.EnableAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author LiTao
 * @Date 2016-11-24
 * @Email litao28@gome.com.cn
 * @Desc
 */

@SpringBootApplication
@EnableAdminServer
public class CloudMonitorApplication {

    public static void main(String[] args) {

        SpringApplication.run(CloudMonitorApplication.class);
    }
}
