package Composition_challenge;

public class Main {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(1200, 500, 25);
        Bed bed = new Bed(dimensions, "Dolce", "Versace");
        Ottoman ottoman = new Ottoman(55, 22);
        House house = new House(bed, ottoman, new Closet(dimensions, 6, "Clothes are there"));
        house.openCloset();

    }
}
