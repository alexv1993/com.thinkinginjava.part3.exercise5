package com.thinkinginjava.part3.exercise5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vendin on 10.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        task2(context);

    }

    public static void task1(ApplicationContext context) {
        Dog Spot = (Dog) context.getBean("spot");
        Dog Scruffy = (Dog) context.getBean("scruffy");

        DogOut dogOut = (DogOut) context.getBean("dogOut");
        dogOut.show(Spot);
        dogOut.show(Scruffy);
    }

    public static void task2(ApplicationContext context) {
        Dog Spot = (Dog) context.getBean("spot");
        Dog Scruffy = (Dog) context.getBean("scruffy");
        Scruffy = Spot;

        System.out.println(Spot == Scruffy);
        System.out.println(Spot.equals(Scruffy));
    }


}
