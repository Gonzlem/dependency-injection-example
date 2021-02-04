package org.gonzlem.dependencyinyectionexample.controller;

import org.gonzlem.dependencyinyectionexample.service.GreetingService;

public class ConstructorInyectionController {
    private final GreetingService greetingService;

    public ConstructorInyectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.greet();
    }
}
