package com.xing_li.xing_java_spring_study;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {

    private String nickName;

    private String compnay;
    private String info;

    public String getName(){
        return nickName;
    }

    public void setName(String name){
        this.nickName = name;
    }

    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info = info;
    }



}
