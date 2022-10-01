package com.kao.alticci;


import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@ComponentScan
@EnableSwagger2
@SpringBootApplication
public class AlticciApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlticciApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return  new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/alticci/*"))
				.apis(RequestHandlerSelectors.basePackage("com.kao.alticci"))
				.build()
				.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Alticci Sequence API", 
				"Micoservice for alticci sequence api for generating nth term", 
				"1.0",
				"https://temsofservice.org",
				new Contact("Maqhobela Kao", "","kaomaqhobela@gmail.com"), 
				"Api licence", 
				"https://opensource",
				Collections.emptyList()
			);
	}
}
