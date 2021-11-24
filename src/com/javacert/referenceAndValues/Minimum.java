package com.javacert.referenceAndValues;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args){
        System.out.println("Enter count:");
        int count = scanner.nextInt();

        int[] returnedArray = readIntegers(count);
        int returnMin = findMin(returnedArray);

        System.out.println("min = "+returnMin);
    }

    private static Scanner scanner = new Scanner(System.in);

    private static int[] readIntegers(int count){

        int[] values = new int[count];

        for (int i = 0; i<values.length; i++){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            values[i] = number;
        }
        return values;
    }

    private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;

        for (int i =0; i<array.length; i++){
            int value = array[i];

            if (value<min){
                min = value;
            }
        }
        return min;
    }

}
