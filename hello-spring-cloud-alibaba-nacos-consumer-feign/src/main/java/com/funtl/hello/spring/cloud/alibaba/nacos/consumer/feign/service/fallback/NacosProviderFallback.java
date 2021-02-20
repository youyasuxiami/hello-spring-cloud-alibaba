package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.stereotype.Component;

/**
 * Author：郑锦
 * Date：2019­10­22 18:07
 * Description：<描述>
 */
@Component
public class NacosProviderFallback implements NacosProviderService {
    @Override
    public String echo(String message) {
        return "请求失败，请检查你的网络";
    }
}
