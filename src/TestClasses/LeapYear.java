package TestClasses;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year <=1 || year>=9999){
            System.out.println("Not valid");
            return false;
        }
        else if(year%100==0 || year%4==0 || year%400==0) {
            System.out.println("100 no");
            return true;

        }else {
            return false;
        }
    }
}
