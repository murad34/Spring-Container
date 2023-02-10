package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = applicationContext.getBean("myPerson",Person.class);
        person.callYourPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        applicationContext.close();

    }

}
