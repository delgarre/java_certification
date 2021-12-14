package com.javacert.packagechallenge;

import java.util.Scanner;

public class Series {

    //nSum(int n) returns the sum of all numbers from 0 to n
    public static long nSum(int n){
       return (n *(n+1))/2;
    }

    //factorial(int n) returns the product of all numbers from 1 to n
    public static long factorial(int n){
        if (n==0){
            return 1;
        }
        long fact = 1;
        for (int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }


    //fibonacci(n) returns the nth Fibonacci number. These are defined as:
    //f(0) = 0
    //f(1) = 1
    //f(n) = f(n-1) + f(n-2)
    //so f(2) is also 1. The first 10 fibonacci numbers are:
    public static long fibonacci(int n){
        if (n ==0){
            return 0;
        }else if(n ==1){
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;
        for (int i = 1; i<n; i++){
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }

}
