package com.xlccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 输入的用户名ben和的密码benspassword
 */
@SpringBootApplication
public class AuthenticatingLdapApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticatingLdapApplication.class, args);
    }

}