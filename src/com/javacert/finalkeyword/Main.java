package com.javacert.finalkeyword;

public class Main {
    public static void main(String[] args){

//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        //Can't because instanceNumber is final
//        //one.instanceNumber=4;
//        System.out.println(Math.PI);
//      //Marking your class as final will prevent it from being subclassed
//
//        int pw = 674312;
//        ExtendedPassword password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(523266);
//        password.letMeIn(9773);
//        password.letMeIn(674312);

        System.out.println("Main method called");

        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
