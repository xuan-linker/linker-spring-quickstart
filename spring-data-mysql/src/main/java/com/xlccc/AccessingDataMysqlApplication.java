package com.xlccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMysqlApplication {

  /**
   *  curl localhost:8080/demo/add -d name=Linker -d email=linker@88.com
   *  curl 'localhost:8080/demo/all'
   */
  public static void main(String[] args) {
    SpringApplication.run(AccessingDataMysqlApplication.class, args);
  }

}