package com.javacert.composition_challenge;

public class Closet {
    private Dimensions dimensions;
    private int shelves;
    private String clothesRack;

    public Closet(Dimensions dimensions, int shelves, String clothesRack) {
        this.dimensions = dimensions;
        this.shelves = shelves;
        this.clothesRack = clothesRack;
    }

    public void reachForShoes(){
        System.out.println("The shoes are on the top shelf");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getShelves() {
        return shelves;
    }

    public String getClothesRack() {
        return clothesRack;
    }
}
