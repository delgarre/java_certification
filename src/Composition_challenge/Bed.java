package Composition_challenge;

public class Bed {
    private Dimensions dimensions;
    private String headBoard;
    private String nightStand;

    public Bed(Dimensions dimensions, String headBoard, String nightStand) {
        this.dimensions = dimensions;
        this.headBoard = headBoard;
        this.nightStand = nightStand;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getHeadBoard() {
        return headBoard;
    }

    public String getNightStand() {
        return nightStand;
    }
}
