package com.gome.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author LiTao
 * @Date 2016-11-25
 * @Email litao28@gome.com.cn
 * @Desc
 */

@RestController
public class DiscoveryService {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("discovery")
    public String discoveryService(){
        StringBuilder stringBuilder = new StringBuilder();
        List<String> serviceIds = discoveryClient.getServices();
        if (!CollectionUtils.isEmpty(serviceIds)){
            for (String str : serviceIds){
                System.out.println("servicesId:"+ str);
                List<ServiceInstance> serviceInstances = discoveryClient.getInstances(str);
                if (!CollectionUtils.isEmpty(serviceInstances)){
                    for (ServiceInstance instance : serviceInstances){
                        stringBuilder.append("["+instance.getServiceId()+" host="+instance.getHost()+" port="+instance.getPort()+" uri="+instance.getUri()+"]");
                    }
                }else {
                    stringBuilder.append("no service");
                }
            }
        }
        return stringBuilder.toString();
    }
}
