package com.esmabeydili.LazyAnnotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class SecondService {

    private FirstService firstService;

    public SecondService(@Lazy FirstService firstService) {
        this.firstService = firstService;
        System.out.println("2");
    }
}
