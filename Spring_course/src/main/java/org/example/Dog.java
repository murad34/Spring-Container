package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Dog implements Pet{

    private String poroda;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public void say() {
        System.out.println("Bow - Wow");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class dog: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class dog: destroy method");
    }
}
