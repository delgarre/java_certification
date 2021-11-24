package com.javacert.inheritance;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal(1, 1, 1, 1, "Animal");

        Dog dog = new Dog(4,3, "Yorkie", 2,1, 10, "Yellow Silky", 4);
        //dog.eat();
        //dog.walk();
       // dog.run();
        Vehicle vehicle = new Vehicle("can steer","4","5");

        Car car = new Car("can steer","4","5",4, 1, 1);

        Ford ford = new Ford("can steer","4","5",4, 1, 1, "N/A", "Yes", "Yes");

        vehicle.move();
        car.turn();
        ford.tow();
    }
}
