package Composition;

public class PC {
    private Case theCase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo(){
        //Fancy graphics
        monitors.drawPixelAt(1200, 50, "yellow");
    }

}
