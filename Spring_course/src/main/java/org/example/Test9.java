package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test9 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat = applicationContext  .getBean("catBean",Pet.class);
//        cat.say();

        Person person = applicationContext.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        applicationContext.close();
    }

}
