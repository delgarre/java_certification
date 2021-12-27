package com.javacert.scope.challenge;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        InnerClass innerClass = new InnerClass();
        innerClass.timesTwo(count);
    }

    public static class InnerClass{
        public InnerClass(){

        }
        public void timesTwo(int x){

            for (int i=0; i<13; i++){
                System.out.println(i + " times two is " + i * x);
            }
        }
    }
}
