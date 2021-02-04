package org.gonzlem.dependencyinyectionexample.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String helloWorld(){
        String phrase = "Hellows";
        return phrase;
    }
}
