package Inheritance;

public class Car extends Vehicle{

    private int wheels;
    private int gasTank;
    private int radio;

    public Car(String steering, String gears, String speed, int wheels, int gasTank, int radio) {
        super(steering, gears, speed);

        this.gasTank = gasTank;
        this.wheels = wheels;
        this.radio = radio;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getGasTank() {
        return gasTank;
    }

    public void setGasTank(int gasTank) {
        this.gasTank = gasTank;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void turn() {
        super.turn();
    }
}
