package com.javacert.oop_challenge;

public class Main {
    public static void main(String[] args){
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Price is "+hamburger.itemizedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddtion1("Lentils", 3.41);
        System.out.println("Total price is "+healthyBurger.itemizedHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizedHamburger();

    }
}
