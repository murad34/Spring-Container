package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = applicationContext.getBean("myPet", Dog.class);
        myDog.setPoroda("Belka");
        Dog yourDog = applicationContext.getBean("myPet", Dog.class);
        yourDog.setPoroda("Strelka");

        System.out.println(myDog.getPoroda());
        System.out.println(yourDog.getPoroda());

        System.out.println(myDog);
        System.out.println(yourDog);
        System.out.println(myDog == yourDog);

        applicationContext.close();
    }

}
