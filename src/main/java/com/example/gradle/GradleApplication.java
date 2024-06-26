package com.example.gradle;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Gradle",
				description = "homework"
		)
)
@EnableFeignClients
public class GradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleApplication.class, args);
	}

}
