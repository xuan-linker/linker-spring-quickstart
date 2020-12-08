package com.xlccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Linker
 * @date 2020/12/8 20:30
 * @description：
 */
@SpringBootApplication
public class ContractRestClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContractRestClientApplication.class, args);
    }
}

@RestController
class MessageRestController {
    private final RestTemplate restTemplate;

    MessageRestController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @RequestMapping("/message/{persionId}")
    String getMessage(@PathVariable("persionId") Long persionId) {
        Person person = this.restTemplate.getForObject("http://localhost:8100/person/{persionId}",
                Person.class, persionId);
        return "Hello " + person.getName();
    }
}
