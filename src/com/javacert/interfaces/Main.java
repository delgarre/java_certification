package com.javacert.interfaces;

public class Main {
    public static void main(String[] args){

        ITelephone telephone;
        telephone = new DeskPhone(123456);
        telephone.powerOn();
        telephone.callPhone(123456);
        telephone.answer();

        telephone = new MobilePhone(24565);
        telephone.powerOn();
        telephone.callPhone(24565);
        telephone.answer();
    }
}
