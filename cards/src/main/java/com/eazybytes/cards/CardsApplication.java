package com.eazybytes.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Cards microservice REST API Documentation",
                description = "EazyBank Cards microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Jose Luis De Miguel",
                        email = "jldmp2001@gmail.com",
                        url = "https://github.com/JLDEMIGUEL/"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://github.com/JLDEMIGUEL/"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "EazyBank Cards microservice REST API Documentation",
                url = "https://github.com/JLDEMIGUEL/"
        )
)
public class CardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }
}
