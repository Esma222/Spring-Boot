package com.esmabeydili.LazyAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    private MyComponent myComponent;

    public MyController(@Lazy MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    @GetMapping("/name")
    public String getMyComponentName(){
        return this.myComponent.getName();
    }
   /* private ExampleOne exampleOne;
    private  ExampleTwo exampleTwo;
    private MyConfiguration myConfiguration;

    @Autowired
    public MyController(ExampleTwo exampleTwo) {
        this.exampleTwo = exampleTwo;
    }


    public MyController(ExampleOne exampleOne) {
        this.exampleOne = exampleOne;
    }

    public MyController(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
    }*/
}
