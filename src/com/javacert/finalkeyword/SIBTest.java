package com.javacert.finalkeyword;

public class SIBTest {
    public static final String owner;

    static {
        owner = "delenis";
        System.out.println("SIBTest static initialization clack called");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("Second initialization black called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
