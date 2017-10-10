package com.thinkinginjava.part3.exercise5;

/**
 * Created by vendin on 10.10.2017.
 */
public class DogOutManager implements DogOut {
    @Override
    public void show(Dog dog) {
        System.out.println("Name: " + dog.getName() + " says: " + dog.getSays());
    }
}
