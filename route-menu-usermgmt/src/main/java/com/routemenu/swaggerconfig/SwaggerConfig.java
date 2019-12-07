package com.routemenu.swaggerconfig;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}
/*
 * Inside postPaths method we pass regular expression like any API hit which is coming  from /api/post.* 
 * or /api/javainuse.* Swagger will document all api's.
 */
	private Predicate<String> postPaths() {
		return or(regex("/api/posts.*"), regex("/api/javainuse.*"));
	}

	/*
	 * These all below details will be available on the Swagger UI page.
	 * Where we can hit the API.And basically swagger will help us in API documentation as well.
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("RouteMenu API")
				.description("RouteMenu API reference for developers")
				.termsOfServiceUrl("info@routemenu.com ")
				.contact("info@routemenu.com ").license("JavaInUse License")
				.licenseUrl("info@routemenu.com ").version("1.0").build();
	}

}