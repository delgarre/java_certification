package com.javacert.collections.binarysearch;

public class Main {

    public static void main(String[] args){

        Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();
        if (theatre.reservSeat("H11")){
            System.out.println("Please pay");
        }else {
            System.out.println("Reserved");
        }

        if (theatre.reservSeat("H11")){
            System.out.println("Please pay");
        }else {
            System.out.println("Reserved");
        }
    }
}
