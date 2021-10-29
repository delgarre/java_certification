package Switch;

import java.util.Locale;

public class Main {
    public static void main(String[] args){
//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        }else if(value==2){
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }
//        int switchValue = 4;
//
//        switch (switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was 3, 4, or 5");
//                System.out.println("Actual value: "+switchValue);
//                break;
//            default:
//                System.out.println("Was not 1, 2, 3, 4, 5");
//                break;
//        }
        char text = 'F';
        switch (text){
            case 'A':
                System.out.println("char was A");
                break;
            case 'B':
                System.out.println("char was B");
                break;
            case 'C':
                System.out.println("char was C");
                break;
            case 'D':
                System.out.println("char was D");
                break;
            case 'E':
                System.out.println("char was E");
                break;
            default:
                System.out.println("Not found");
                break;
        }
        String month = "JAnuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
