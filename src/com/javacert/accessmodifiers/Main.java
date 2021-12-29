package com.javacert.accessmodifiers;

public class Main {
    public static void main(String[] args){
        Account account = new Account("Delenis");
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(-200);
        account.deposit(-20);
        account.calculateBalance();
        //account.balance = 5000;

        System.out.println("Account balance is " + account.getBalance());
       // account.transactions.add(4500);
        account.calculateBalance();
    }
}
