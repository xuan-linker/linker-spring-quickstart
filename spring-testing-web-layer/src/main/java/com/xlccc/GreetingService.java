package com.xlccc;

import org.springframework.stereotype.Service;

/**
 * @author Linker
 * @date 2020/12/8 19:16
 * @description：
 */
@Service
public class GreetingService {
    public String greet() {
        return "Hello,World";
    }
}
