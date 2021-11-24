package com.javacert.inheritance;

public class Ford extends Car{

    private String trunk;
    private String fourWheelDrive;
    private String heatedSeats;

    public Ford(String steering, String gears, String speed, int wheels, int gasTank, int radio, String heatedSeats, String fourWheelDrive,
                String trunk) {
        super(steering, gears, speed, wheels, gasTank, radio);
        this.fourWheelDrive = fourWheelDrive;
        this.trunk = trunk;
        this.heatedSeats = heatedSeats;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public String getFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(String fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getHeatedSeats() {
        return heatedSeats;
    }

    public void setHeatedSeats(String heatedSeats) {
        this.heatedSeats = heatedSeats;
    }
    public void tow(){
        move();
        System.out.println("Ford is towing");
    }
}
