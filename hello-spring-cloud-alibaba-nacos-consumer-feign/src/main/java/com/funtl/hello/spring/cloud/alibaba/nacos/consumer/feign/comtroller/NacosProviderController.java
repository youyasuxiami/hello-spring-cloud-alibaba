package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.comtroller;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：郑锦
 * Date：2019­10­22 16:13
 * Description：<描述>
 */
@RestController
public class NacosProviderController {

    @Autowired
    private NacosProviderService nacosProviderService;

    @GetMapping(value = "/echo")
    public String echo() {
        return nacosProviderService.echo("Hi Feign");
    }
}
