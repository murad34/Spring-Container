package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = applicationContext.getBean("myPet", Pet.class);

        Person person = new Person(pet);
        person.callYourPet();

        applicationContext.close();

    }

}
