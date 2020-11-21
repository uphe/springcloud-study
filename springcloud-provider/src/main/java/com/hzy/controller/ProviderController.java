package com.hzy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hzy
 * @Date: 2020/11/21
 */

@RestController
@RefreshScope //nacos动态刷新功能
public class ProviderController {
    @Value("${config.info}")
    private String serverPort;

    @GetMapping(value = "/info")
    public String getInfo() {
        return "hello world";
    }

    @GetMapping(value = "/config/info")
    public String getServerPort() {
        return serverPort;
    }


}
