package com.javacert.challenges;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){

            }else {
                break;
            }
        }

        scanner.close();
    }
}
