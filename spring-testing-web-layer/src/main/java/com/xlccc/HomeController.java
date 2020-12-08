package com.xlccc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Linker
 * @date 2020/12/8 16:45
 * @description：
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting(){
        return "Hello, World";
    }
}
