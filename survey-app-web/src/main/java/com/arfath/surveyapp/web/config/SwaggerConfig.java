package com.arfath.surveyapp.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contact = new Contact("Arfath Ahmed", "", "dev.arfath@gmail.com");

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Registration")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.arfath.surveyapp.web.controller"))
                .paths(regex("/"))
                .build()
                .apiInfo(new ApiInfoBuilder()
                        .title("Registration")
                        .contact(contact)
                        .description("registration for survey app")
                        .build());
    }
}
