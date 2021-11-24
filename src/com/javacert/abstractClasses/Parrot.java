package com.javacert.abstractClasses;
//Automatically inherits eat and breathe from Animal class, so they don't need to be implemented here
public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Fliying from branch to branch");
    }
}
