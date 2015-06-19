import Canvas;
public class Graphics
{
    public static void main(String[] args)
    {
        int x1 = 0;
        int y1 = 0;
        int x2 = 45;
        int y2 = 45;
        Line segment = new Line(x1, y1, x2, x2);
        segment.draw();
        
        int x = 0;
        int y = 0;
        int width = 45;
        int height = 25;
        Ellipse egg = new Ellipse(x, y, width, height);
        egg.draw();
        
        Text message = new Text(x, y, "Udacity");
        message.draw();
    }
}