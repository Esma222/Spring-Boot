package com.esmabeydili.ComponentScanAnnatation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(useDefaultFilters = false)
public class ComponentScanAnnatationApplication {

	@Autowired
	private MyService myService;

	public static void main(String[] args) {

		SpringApplication.run(ComponentScanAnnatationApplication.class, args);
	}

}
