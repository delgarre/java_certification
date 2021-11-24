package com.javacert.polymorphism_challenge;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String accelerate(boolean brakes){

        if(brake(brakes)==true){
            return getClass().getSimpleName()+" is slowing down";
        }
        return name+" is accelerating";
    }

    public boolean brake(boolean brakes){
        return brakes;
    }

    public String stopEngine(){

        return "Car has been turned off";
    }

    public String rate(){
        return getClass().getSimpleName()+" has 0.0% rate";
    }

}

class Toyota extends Car{

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean brake(boolean brakes) {
        brakes= false;
        return super.brake(brakes);
    }

    public String rate(){
        return getClass().getSimpleName()+" has 5.0% rate";
    }
}

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean brake(boolean brakes) {
        return super.brake(brakes);
    }

    public String rate(){
        return getClass().getSimpleName()+" has 20.0% rate";
    }
}

class Blank extends Car{

    public Blank(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean brake(boolean brakes) {
        return super.brake(brakes);
    }


}

public class Main {
    public static void main(String[] args){

            Car car = new Car(5, "Base");
            Toyota toyota = new Toyota(4, "Camry");
            Ford ford = new Ford(6, "F150");
            Blank blank = new Blank(2, "Blank");
            System.out.println(car.getName());
            System.out.println(car.accelerate(true));
            System.out.println(car.rate());
            System.out.println(toyota.getName());
            System.out.println(toyota.accelerate(false));
            System.out.println(toyota.stopEngine());
            System.out.println(toyota.getCylinders());
            System.out.println(toyota.rate());
            System.out.println(ford.getName());
            System.out.println(ford.getCylinders());
            System.out.println(ford.accelerate(true));
            System.out.println(ford.rate());
            System.out.println(blank.rate());

    }

}
