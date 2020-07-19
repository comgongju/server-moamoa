package com.comgongju.moamoa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	 private ApiInfo apiInfo() {

	        return new ApiInfoBuilder()
	                .title("MoaMoa Project API명세서")
	                .description("컴공주 가계부 프로젝트")
	                .build();
	    }

	    @Bean
	    public Docket userApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .groupName("유저 정보 요청")
	                .apiInfo(this.apiInfo())
	                .select()
	                .apis(RequestHandlerSelectors
	                        .basePackage("com.comgongju.moamoa.user"))
	                .paths(PathSelectors.ant("/user"))
	                .build();
	    }
	    
	    @Bean
	    public Docket spendingApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .groupName("지출 정보 요청")
	                .apiInfo(this.apiInfo())
	                .select()
	                .apis(RequestHandlerSelectors
	                        .basePackage("com.comgongju.moamoa.spending"))
	                .paths(PathSelectors.ant("/spending/*"))
	                .build();
	    }
}
