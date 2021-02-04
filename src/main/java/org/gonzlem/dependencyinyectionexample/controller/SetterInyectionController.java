package org.gonzlem.dependencyinyectionexample.controller;

import org.gonzlem.dependencyinyectionexample.service.GreetingService;

public class SetterInyectionController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.greet();
    }
}
