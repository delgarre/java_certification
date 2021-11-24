package com.javacert.inheritance;

public class Vehicle {

    private String steering;
    private String gears;
    private String speed;

    public Vehicle(String steering, String gears, String speed) {
        this.steering = steering;
        this.gears = gears;
        this.speed = speed;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        this.gears = gears;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println("Vehicle is moving");
    }

    public void turn(){
        System.out.println("Vehicle is turning");
    }
}
