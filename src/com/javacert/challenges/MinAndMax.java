package com.javacert.challenges;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        //boolean first = true;
        while (true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();

//                if (first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number> max) {
                    max = number;
                }

                if (number<min){
                    min=number;
                }

            }else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("min= "+min+", max= " +max);
        scanner.close();
    }

}
