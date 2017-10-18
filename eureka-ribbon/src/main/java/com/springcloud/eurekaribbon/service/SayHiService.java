package com.springcloud.eurekaribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SayHiService
{
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayHiErr")
    public String sayHi(String name){
        return restTemplate.getForObject("http://SERVICE-HI/sayHi?name="+name,String.class);
    }

    public String sayHiErr(String name){
        return name+",error";
    }
}
