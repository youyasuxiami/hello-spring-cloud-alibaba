package com.funtl.hello.spring.cloud.alibaba.nacos.provider.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：郑锦
 * Date：2019­10­22 0:21
 * Description：<描述>
 */
@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message")String message){
        return "hello Nacos： "+message+"i am from port:"+port;
    }
}
