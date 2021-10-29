package Challenges;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //my version
//
//        int sum = 0;
//        System.out.println("Enter number #1");
//        boolean hasNextInt = scanner.hasNextInt();
//        if (hasNextInt){
//            int count = 1;
//
//            while(count<11){
//                int number = scanner.nextInt();
//            scanner.nextLine();
//            count+=1;
//            System.out.println("Enter number #"+count);
//                for (int i=number; i<10; i++){
//                    sum = i + number;
//                }
//
//            }
//        }else {
//            System.out.println("Invalid");
//        }
//        System.out.println("sum= "+sum);

        int counter = 0;
        int sum = 0;

      //  while (true){
            while (counter<10){
            int order = counter+1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum+=number;
//                if (counter==10){
//                    break;
//                }
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();// handle end of line (enter key)
        }
        System.out.println("sum= " + sum);
        scanner.close();
    }
}
