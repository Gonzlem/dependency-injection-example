package org.gonzlem.dependencyinyectionexample.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("languageService")
public class GreetingServiceEN implements GreetingService{
    @Override
    public String greet() {
        return "Hello! I'm greeting you from the english implementation";
    }
}
