//Complete the code in the class BlockTower to draw a tower of blocks
//that looks like the one at the link below.  Each block has a width of 40
//and a height of 30. There are three rows.
//The upper left-hand corner of the bottom row is at (20, 70)

//Create a custom color for the topmost color where red = 125, green=125, blue = 255.
//For all the other colors, use predefined colors.
//The colors from top to bottom are: custom color, RED, PINK, BLUE, MAGENTA, CYAN,

//For the draft, draw the first rectangle in the bottom row.

//For the final, draw the whole tower.

public class BlockTower
{
   public static void main(String[] args)
   {
       //bottom row
       int width = 40;
       int height = 30;
       int startX = 20;
       int startY = 70;
       int startMidRowX = startX + width / 2;
       int startMidRowY = startY - height;
       Rectangle box1 = new Rectangle(startX, startY, width, height);
       box1.setColor(Color.BLUE);
       box1.fill();
       
       Rectangle box2 = new Rectangle(startX + width, startY, width, height);
       box2.setColor(Color.MAGENTA);
       box2.fill();
       
       Rectangle box3 = new Rectangle(startX + 2 * width, startY, width, height);
       box3.setColor(Color.CYAN);
       box3.fill();
       
       Rectangle box4 = new Rectangle(startMidRowX, startMidRowY, width, height);
       box4.setColor(Color.RED);
       box4.fill();
       
       Rectangle box5 = new Rectangle(startMidRowX + width, startMidRowY, width, height);
       box5.setColor(Color.PINK);
       box5.fill();
       
       Rectangle boxTop = new Rectangle(startX + width, startY-2*height, width, height);
       boxTop.setColor(new Color(125,125,255));
       boxTop.fill();
   }
}
