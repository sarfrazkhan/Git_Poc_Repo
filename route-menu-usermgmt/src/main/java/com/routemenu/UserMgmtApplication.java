package com.routemenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/* test commit */

@SpringBootApplication
@EnableJpaAuditing
@EnableSwagger2
public class UserMgmtApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserMgmtApplication.class, args);
       

	}
}
