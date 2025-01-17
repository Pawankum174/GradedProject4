package com.greatlearning.employeeManagementSystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket libraryApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).groupName("Employee-API").select()
				.apis(RequestHandlerSelectors.basePackage("com.greatlearning.employeeManagementSystem.controller")).build();

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("EMP-API").description("Rest API Project")
				.contact(new Contact("Employee API", "http://employee.com", "employeeApi@gmail.com"))
				.license("Employee API").version("1.0").build();
	}

}
