package com.springcloud.eurekaribbon.control;

import com.springcloud.eurekaribbon.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiControl {
    @Autowired
    SayHiService sayHiService;
    @RequestMapping(value = "/sayHi")
    public String sayHi(String name){
        return sayHiService.sayHi(name);
    }
}
