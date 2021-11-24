package com.javacert.autoboxingAndUnboxing.Challenge;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("Chase");

        bank.addBranch("JP");
        bank.addCustomer("JP", "Delenis", 50.05);
        bank.addCustomer("JP", "Mike", 175.34);
        bank.addCustomer("JP", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("JP", "Delenis", 44.22);
        bank.addCustomerTransaction("JP", "Delenis", 12.44);
        bank.addCustomerTransaction("JP", "Mike", 1.65);

        bank.listCustomers("JP", true);
        bank.listCustomers("Sydney", true);
        bank.addBranch("Melbourne");

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)){
            System.out.println("Error Melbourne branch does not exists");
        }
        if (!bank.addBranch("JP")){
            System.out.println("JP already exists");
        }
        if (!bank.addCustomerTransaction("JP", "Fergus", 52.33)){
            System.out.println("Customer does not exist at branch");
        }
        if (!bank.addCustomer("JP", "Delenis", 12.31)){
            System.out.println("Customer Delenis already exists");
        }
    }
}
