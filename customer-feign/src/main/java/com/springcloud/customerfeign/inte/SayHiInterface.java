package com.springcloud.customerfeign.inte;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(value = "service-hi")
public interface SayHiInterface {
    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
