package com.company.ecom.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {
	private static final String GET="GET";
	private static final String POST="POST";
	private static final String  DELETE="DELETE";
	private static final String PUT="PUT";

	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registey) {
				
				registey.addMapping( "/**")
						.allowedMethods(GET,PUT,POST,DELETE)
						.allowedHeaders("*")
						.allowedOriginPatterns("*")
						.allowCredentials(true)
						;
			}
		};
		
	}

}
