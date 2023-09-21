package com.hello.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //HelloApplicationクラスはスプリングブートのアプリケーションだよって意味
public class HelloApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloApplication.class, args);
    }

}
