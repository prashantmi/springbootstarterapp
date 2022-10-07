package com.voyager.springbootstarterapp.configuration;

/**
 * @author Prashant Mishra
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerDocConfig {

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(
                RequestHandlerSelectors.basePackage("com.voyager.pilotautomationserver.controller"))
//                    .paths(PathSelectors.ant("/foos/*"))
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Pilot Automation Server").description(
                "PilotAutomationServer a spring boot project for centralized automation server, "
                        + "which will utilize other teting modules")
                .contact(new Contact("Prashant Mishra", "https://github.com/prashantmi",
                        "prashantmindia@gmail.com"))
                .version("1.0.0").build();
    }

}
