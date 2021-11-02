package AbstractClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot bird = new Parrot("Australian ringneck");
        bird.breathe();
        bird.eat();
        bird.fly();

        Penguin penguin = new Penguin("Pengy");
        penguin.fly();
    }
}
