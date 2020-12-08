package com.xlccc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Linker
 * @date 2020/12/8 16:26
 * @description：客户端client->请求server，获取不到server数据后返回预先设定好的断路值
 */
@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class CircuitBreakClientApplication {
    @Autowired
    private BookService bookService;

    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }

    @RequestMapping("/to-read")
    public String toRead() {
        return bookService.readingList();
    }

    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakClientApplication.class, args);
    }
}

