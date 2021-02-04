package org.gonzlem.dependencyinyectionexample.service;

public class GreetingServiceImplTwo implements GreetingService{
    @Override
    public String greet() {
        return "Hello! I'm greeting you from the first implementation";
    }
}
