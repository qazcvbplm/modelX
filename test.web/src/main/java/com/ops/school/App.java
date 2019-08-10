package com.ops.school;

import ops.model.X.wx.user.EnableWxUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableWxUser
public class App {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


}
