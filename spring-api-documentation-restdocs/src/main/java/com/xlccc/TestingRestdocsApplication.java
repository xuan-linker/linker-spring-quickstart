package com.xlccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingRestdocsApplication {

    /**
     * 运行测试，然后查找target/snippets。您应该找到一个名为home（标识符）的目录，其中包含Asciidoctor片段
     */
    public static void main(String[] args) {
        SpringApplication.run(TestingRestdocsApplication.class, args);
    }
}