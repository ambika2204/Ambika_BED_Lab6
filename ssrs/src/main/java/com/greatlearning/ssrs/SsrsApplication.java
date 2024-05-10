package com.greatlearning.ssrs;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class SsrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsrsApplication.class, args);
    }

}
