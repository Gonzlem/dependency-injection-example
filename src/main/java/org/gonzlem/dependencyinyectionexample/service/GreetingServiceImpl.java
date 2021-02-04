package org.gonzlem.dependencyinyectionexample.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String greet() {
        return "Hello! I'm greeting you from the first implementation";
    }
}
