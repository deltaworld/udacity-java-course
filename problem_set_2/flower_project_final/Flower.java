public class Flower
{
    private int x;
    private int y;
    
    private Ellipse northPinkPetal;
    private Ellipse westPinkPetal;
    private Ellipse southPinkPetal;
    private Ellipse eastPinkPetal;
    private Ellipse yellowCentre;    
    private Line greenStem;    
    public Flower(int theX, int theY)
    {
        this.x = theX;
        this.y = theY;
        
        this.draw();
        
    }
    
    /**
     * This function draws the flower.
     */
    public void draw()
    {
        int diameter = 20;
        // northPinkPetal
        this.northPinkPetal = new Ellipse(diameter + this.x, 0 + this.y, diameter, diameter);
        this.northPinkPetal.setColor(Color.PINK);
        this.northPinkPetal.fill();
        
        // westPinkPetal
        this.westPinkPetal = new Ellipse(0 + this.x, diameter + this.y, diameter, diameter);
        this.westPinkPetal.setColor(Color.PINK);
        this.westPinkPetal.fill();

        // eastPinkPetal
        this.eastPinkPetal = new Ellipse(2 * diameter + this.x, diameter + this.y, diameter, diameter);
        this.eastPinkPetal.setColor(Color.PINK);
        this.eastPinkPetal.fill();

        // southPinkPetal
        this.southPinkPetal = new Ellipse(diameter + this.x, 2 * diameter + this.y, diameter, diameter);
        this.southPinkPetal.setColor(Color.PINK);
        this.southPinkPetal.fill();

        // yellowCentre
        this.yellowCentre = new Ellipse(diameter + this.x, diameter + this.y, diameter, diameter);
        this.yellowCentre.setColor(Color.YELLOW);
        this.yellowCentre.fill();
        
        // greenStem
        this.greenStem = new Line(1.5 * diameter + this.x, 3 * diameter + this.y, 1.5 * diameter + this.x, 6 * diameter + this.y);
        this.greenStem.setColor(Color.GREEN);
        this.greenStem.draw();
    }
}
