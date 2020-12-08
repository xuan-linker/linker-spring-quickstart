package com.xlccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Linker
 * @date 2020/12/8 16:25
 * @description：
 */
@RestController
@SpringBootApplication
public class CircuitBreakerServerApplication {

    @RequestMapping(value = "/recommended")
    public String readingList() {
        return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
    }

    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakerServerApplication.class, args);
    }
}
