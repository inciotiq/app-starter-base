package com.iotiq.application.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiDocumentationConfig {

    @Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("Culturati API")
                        .description("The Culturati API is a backend application that provides access to cultural resources and information.")
                        .version("0.0.1")
                        .contact(new Contact().name("developer").email("inci@iotiq.net")) // 🙈
                );
    }
}