package com.xlccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Linker
 * @date 2020/12/8 15:04
 * @description：配置中心
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigurationServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigurationServerApplication.class, args);
    }
}
