package com.funtl.hello.spring.cloud.alibaba.nacos.provider.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
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

    //这个是一次性的，加载到内存，配置文件修改了，这个值还是不变
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message")String message){
        return "hello Nacos： "+message+" i am from port:"+port;
    }

    // 注入配置文件上下文。可以动态获取到配置文件修改的值
    @Autowired
    private ConfigurableApplicationContext configurableApplicationContext;

    // 从上下文中读取配置
    @GetMapping(value = "/hi")
    public String hi(){
        String property = configurableApplicationContext.getEnvironment().getProperty("user.name");
        return property;
    }
}
