package com.thinkinginjava.part3.exercise5;

/**
 * Created by vendin on 10.10.2017.
 */
public class DogImpl implements Dog {
    private String name;
    private String says;

    public DogImpl(String name, String says) {
        this.name = name;
        this.says = says;
    }

    @Override
    public void doSay() {
        System.out.println(says);
    }

    @Override
    public String getSays() {
        return says;
    }

    @Override
    public void setSays(String says) {
        this.says = says;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
