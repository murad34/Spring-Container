package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {

        // Spring Container-in yaranmasi
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = applicationContext.getBean("myPet",Pet.class);
        pet.say();

        applicationContext.close();

    }

}
