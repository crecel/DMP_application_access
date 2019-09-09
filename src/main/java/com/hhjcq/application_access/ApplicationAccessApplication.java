package com.hhjcq.application_access;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableApolloConfig({"application"})
public class ApplicationAccessApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationAccessApplication.class, args);
    }

}
