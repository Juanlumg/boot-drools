package com.bankia;

import javax.sql.DataSource;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bankia.dao.ProductRepository;

@SpringBootApplication
public class SpringBootDroolsApp {

	@Autowired
    DataSource dataSource;

    @Autowired
    ProductRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDroolsApp.class, args);

	}

	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}

}
