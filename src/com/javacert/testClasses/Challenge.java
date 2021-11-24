package com.javacert.testClasses;

public class Challenge {
    public static void main(String[] args) {
        double dValue = 20.00d;

        double dValue2 = 80.00d;

        double val = (dValue + dValue2)*100.00d;
        System.out.println(val);
        double val2 = val % 40.00d;

        System.out.println(val2);
        boolean isZero = val2==0?true:false;
        System.out.println(isZero);
        if(!isZero){
            System.out.println("Got some remainder");
        }
    }
}
