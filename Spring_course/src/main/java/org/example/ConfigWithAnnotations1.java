package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Cat myCat = applicationContext.getBean("catBean",Cat.class);
        myCat.say();

        applicationContext.close();
    }

}
