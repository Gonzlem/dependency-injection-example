package org.gonzlem.dependencyinyectionexample.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("languageService")
public class GreetingServiceES implements GreetingService{
    @Override
    public String greet() {
        return "Hola! Te estoy saludando desde la implementación en español";
    }
}
