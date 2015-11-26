package com.github.kastyan.personalnews.config;

import static org.springframework.context.annotation.ComponentScan.Filter;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import com.github.kastyan.personalnews.Application;

@Configuration
@ComponentScan(basePackageClasses = Application.class, excludeFilters = @Filter({Controller.class, Configuration.class}))
class ApplicationConfig {
	
/**
*make connection only once
*/
	@Bean
	public EntityManagerFactory getCurrentEMF() {
		return Persistence.createEntityManagerFactory("app");
	}
	
	
}