package testing;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println(s);

        for (int i=0; i<s.length(); i++)
        {
            ch= s.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
