package com.gome.eureka.client;


/**
 * @Author LiTao
 * @Date 2016-11-24
 * @Email litao28@gome.com.cn
 * @Desc
 */

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaClientApplication.class);
    }
}
