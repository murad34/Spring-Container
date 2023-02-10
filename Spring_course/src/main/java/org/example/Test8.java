package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test8 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = applicationContext.getBean("personBean", Person.class);
        person.callYourPet();

        applicationContext.close();
    }

}
