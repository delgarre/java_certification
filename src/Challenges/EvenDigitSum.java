package Challenges;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }else{
            int numberCopy = number, remainder = 0, sum = 0;
            while(numberCopy>0){
                remainder = numberCopy % 10;
                if(remainder % 2==0){
                    sum = sum + remainder;
                }
                numberCopy /= 10;
            }
            return sum;
        }
    }
}
