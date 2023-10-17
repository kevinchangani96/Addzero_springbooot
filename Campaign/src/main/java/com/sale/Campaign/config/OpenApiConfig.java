package com.sale.Campaign.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenApi() {
        return new OpenAPI().info(
                new Info()
                        .title("Sale Campaign API Run in Swagger")
                        .version("v1")
                        .description("Sale Campaign APis")
                        .termsOfService("https://springdoc.org/")
                        .license(
                                new License()
                                        .name("OpenSource")
                                        .url("https://springdoc.org/")
                        )
        );
    }

}