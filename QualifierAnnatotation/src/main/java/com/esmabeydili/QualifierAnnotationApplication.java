package com.esmabeydili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class QualifierAnnotationApplication {

	public static void main(String[] args) {

		SpringApplication.run(QualifierAnnotationApplication.class, args);
	}

		@Bean("WORD")
		@Primary
		public WordFileReader getWordFileReader(){
			return new WordFileReader();
		}


}
