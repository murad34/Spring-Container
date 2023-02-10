package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = applicationContext.getBean("myPet", Dog.class);
        myDog.say();

        applicationContext.close();
    }

}
