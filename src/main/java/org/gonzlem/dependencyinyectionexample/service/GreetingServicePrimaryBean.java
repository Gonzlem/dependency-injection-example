package org.gonzlem.dependencyinyectionexample.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryBean implements GreetingService{

    @Override
    public String greet() {
        return "Hello! I'm greeting you from the primary bean implementation";
    }
}
