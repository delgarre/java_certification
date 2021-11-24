package com.javacert.composition_challenge;

public class House {

    private Bed bed;
    private Ottoman ottoman;
    private Closet closet;

    public House(Bed bed, Ottoman ottoman, Closet closet) {
        this.bed = bed;
        this.ottoman = ottoman;
        this.closet = closet;
    }

    public void openCloset(){
        closet.reachForShoes();
        sitOnBed();
    }
    public void sitOnBed(){
        System.out.println("You're sitting on the bed to put your shoes on");
    }
}
