package org.gonzlem.dependencyinyectionexample.controller;

import org.gonzlem.dependencyinyectionexample.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInyectionControllerTest {

    ConstructorInyectionController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInyectionController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        controller.getGreeting();
    }
}