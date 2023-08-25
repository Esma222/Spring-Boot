package com.esmabeydili.LazyAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class MyConfiguration {
    public MyConfiguration() {
        System.out.println("My Configuration bean initialized!");
    }

    @Bean
    @Lazy
    public ExampleOne getExampleOne(){
        return new ExampleOne();
    }

    @Bean
    public ExampleTwo getExampleTwo(){
        return new ExampleTwo();
    }
}
