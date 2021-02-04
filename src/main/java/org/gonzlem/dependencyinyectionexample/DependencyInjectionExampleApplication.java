package org.gonzlem.dependencyinyectionexample;

import org.gonzlem.dependencyinyectionexample.controller.ConstructorInjectionController;
import org.gonzlem.dependencyinyectionexample.controller.LanguageController;
import org.gonzlem.dependencyinyectionexample.controller.PrimaryBeanController;
import org.gonzlem.dependencyinyectionexample.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionExampleApplication.class, args);

        System.out.println("---------- Setter injected");

        SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");

        System.out.println(setterInjectionController.getGreeting());

        System.out.println("---------- Constructor injected");

        ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");

        System.out.println(constructorInjectionController.getGreeting());

        System.out.println("---------- Primary bean injected");

        PrimaryBeanController primaryController = (PrimaryBeanController) ctx.getBean("primaryBeanController");

        System.out.println(primaryController.getGreeting());

        System.out.println("---------- Profile injected");

        LanguageController languageController = (LanguageController) ctx.getBean("languageController");

        System.out.println(languageController.getGreeting());
    }
}
