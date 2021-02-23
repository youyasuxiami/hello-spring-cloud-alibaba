package com.funtl.hello.spring.cloud.alibaba.rocketmq.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Description：
 *
 * @version v1.0.0
 * @author：zj
 * @date：2021­02­23 12:43
 */
@SpringBootApplication
@EnableBinding({Sink.class})
public class RocketMQComsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketMQComsumerApplication.class,args);
    }

    @StreamListener("input")
    public void receiveinput1(String msg){
        System.out.println("接收到消息:"+msg);

    }
}
