package org.gonzlem.dependencyinyectionexample.controller;

import org.gonzlem.dependencyinyectionexample.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        controller.getGreeting();
    }
}