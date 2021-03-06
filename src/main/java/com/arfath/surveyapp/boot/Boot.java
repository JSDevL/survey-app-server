package com.arfath.surveyapp.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.arfath.surveyapp.data.repository"})
@ComponentScan(basePackages = {"com.arfath.surveyapp.boot", "com.arfath.surveyapp.web"})
@EntityScan("com.arfath.surveyapp.data.domain")
public class Boot {
    public static void main(String[] args) {
        SpringApplication.run(Boot.class);
    }
}
