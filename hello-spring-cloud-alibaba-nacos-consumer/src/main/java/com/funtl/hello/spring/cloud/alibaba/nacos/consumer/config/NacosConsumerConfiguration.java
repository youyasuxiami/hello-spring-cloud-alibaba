package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//相当于单体地狱中的application-context.xml配置文件
@Configuration
public class NacosConsumerConfiguration {

    //相当于<bean id="restTemplate:></bean>
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}