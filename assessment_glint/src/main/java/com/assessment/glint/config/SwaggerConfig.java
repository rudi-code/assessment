/**
 * 
 */
package com.assessment.glint.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


/**
 * @author rudi_
 * Jun 7, 2022
 */

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("Service REST API")
	              .description("Service REST API")
	              .contact(new Contact().name("Rudi Purnomo").email("rudipurnomo.mail@gmail.com"))
//	              .version("v0.0.1")
	              .license(new License().name("Open Api Spring Documentation").url("http://springdoc.org")))
	              .externalDocs(new ExternalDocumentation());
	      }
}
