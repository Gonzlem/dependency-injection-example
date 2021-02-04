package org.gonzlem.dependencyinyectionexample.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplTwo implements GreetingService{
    @Override
    public String greet() {
        return "Hello! I'm greeting you from the second implementation";
    }
}
