package com.querobin.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("REST API's RESTFul do 0 à AWS c. Spring Boot 3 Java e Docker")
                        .version("v1")
                        .termsOfService("Some description about your API")
                        .license(
                                new License()
                                        .name("Apache 2.0")
                                        .url("https://www.apache.org/licenses/LICENSE-2.0.txt")
                        )
                );
    }

}
