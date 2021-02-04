package org.gonzlem.dependencyinyectionexample.controller;

import org.gonzlem.dependencyinyectionexample.service.GreetingServiceImplTwo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInyectionControllerTest {
    SetterInyectionController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInyectionController();
        controller.setGreetingService(new GreetingServiceImplTwo());
    }

    @Test
    void getGreeting() {
        controller.getGreeting();
    }
}