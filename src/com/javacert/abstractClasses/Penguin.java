package com.javacert.abstractClasses;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good at that, gonna go for a swim instead");
    }
}
