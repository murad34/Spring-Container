package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Person person = applicationContext.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        applicationContext.close();
    }

}
