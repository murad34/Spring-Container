package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Dog myDog = applicationContext.getBean("dog",Dog.class);
        Dog yourDog = applicationContext.getBean("dog",Dog.class);

        System.out.println(myDog==yourDog);

        applicationContext.close();
    }

}
