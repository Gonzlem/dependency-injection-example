package org.gonzlem.dependencyinyectionexample;

import org.gonzlem.dependencyinyectionexample.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class DependencyInyectionExampleApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInyectionExampleApplication.class, args);

		HomeController myController = (HomeController) ctx.getBean("homeController");

		String greeting = myController.helloWorld();

		System.out.println(greeting);
    }

}
