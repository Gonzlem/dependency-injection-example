package org.gonzlem.dependencyinyectionexample.controller;

import org.gonzlem.dependencyinyectionexample.service.GreetingServiceImplTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {
    SetterInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectionController();
        controller.setGreetingService(new GreetingServiceImplTwo());
    }

    @Test
    void getGreeting() {
        controller.getGreeting();
    }
}