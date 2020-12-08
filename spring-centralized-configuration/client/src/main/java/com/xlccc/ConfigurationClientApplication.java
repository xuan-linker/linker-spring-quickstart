package com.xlccc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Linker
 * @date 2020/12/8 15:04
 * @description：调用配置中心的数据
 */
@SpringBootApplication
public class ConfigurationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationClientApplication.class, args);
    }
}

@RefreshScope
@RestController
class MessageRestController {

    @Value("${env}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}