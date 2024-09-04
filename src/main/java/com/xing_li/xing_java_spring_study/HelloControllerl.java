package com.xing_li.xing_java_spring_study;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class HelloControllerl {


    @Autowired
    private UserProperties userProperties;
    @RequestMapping(value = "/Hello", method = RequestMethod.GET)
    public String say(){
        return "I am" + userProperties.getName() + userProperties.getInfo();
    }
    
}
