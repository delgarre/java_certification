package testing;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sac = new Scanner(System.in);

        int number = sac.nextInt();

            if (number % 5 == 0) {
                System.out.println("fizz");
            } else if (number % 3 == 0) {
                System.out.println("buzz");
            } else if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("fizzbuzz");
            } else {
                System.out.println("fizzy");
            }
        }
}
