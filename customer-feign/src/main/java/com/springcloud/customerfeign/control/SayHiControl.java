package com.springcloud.customerfeign.control;

import com.springcloud.customerfeign.inte.SayHiInterface;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiControl {
    @Autowired
    SayHiInterface sayHiInterface;
    @RequestMapping(value = "sayHi",method = RequestMethod.GET)
    public String sayHi(String name){
        return  sayHiInterface.sayHi(name);
    }
}
