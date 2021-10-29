package Classes_Challenge;

public class Main {
    public static void main(String[] args){
//        BankAccount bankAccount = new BankAccount("1234", 22.75, "Delenis Garrett", "de@yahoo.com",
//                "(111) 555-8879");
//
//        System.out.println("Balance: " + bankAccount.getBalance());
//        bankAccount.depositFunds(30);
//        System.out.println("$30 has been deposited into your account. Your new balance is: " + "$"+bankAccount.getBalance());
//        bankAccount.withdrawalFunds(10.50);
//        System.out.println("You just withdrew $10 from your account. Your new balance is: " + "$"+bankAccount.getBalance());
//
//        BankAccount bankAccount1 = new BankAccount("Tim", "tem@email.com", "12345");
//        System.out.println(bankAccount1.getAccountNumber() + " name " + bankAccount1.getCustomerName());


//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getName());
//
//        VipCustomer person2 = new VipCustomer(25000,"bob@gmail.com");
//        System.out.println(person2.getCreditLimit());
//
//        VipCustomer person3 = new VipCustomer("Jim", 100, "jim@email.com");
//        System.out.println(person3.getName());

        Wall wall = new Wall(4,5);
        System.out.println("Area= "+ wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("height= "+wall.getHeight());

        Wall walls = new Wall(-1.25, -1.25);

        System.out.println("Area= "+walls.getArea());
    }
}
