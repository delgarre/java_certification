package ReferenceAndValues;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] intArray = new int[5];
        int[] another = intArray;

        System.out.println("m array = " + Arrays.toString(intArray));
        System.out.println("another = " + Arrays.toString(another));

        another[0] = 1;

        System.out.println("m array after change = " + Arrays.toString(intArray));
        System.out.println("another after change = " + Arrays.toString(another));

        another = new int[]{4,5,6,7,8};
        modifyArray(intArray);

        System.out.println("m array after modify = " + Arrays.toString(intArray));
        System.out.println("another after modify = " + Arrays.toString(another));
    }
    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
