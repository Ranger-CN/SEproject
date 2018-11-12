package com.huawei.cse;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class ProjectdemoApplication {
    public static void main(String[] args) {
         SpringApplication.run(ProjectdemoApplication.class,args);
    }
}
