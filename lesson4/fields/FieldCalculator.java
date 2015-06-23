public class FieldCalculator
{
    int radius = 400;
    int diameter = 2 * radius;
    
    /**
     * Calculates the number of circular fields of Radius 400 meters
     * that can fit on a plot
     * of land if the first row starts all the way at the left, and
     * the second row starts one radius away from the left edge as
     * described in the question video, and the circles are as close
     * together as they can be without overlapping.
     */
    public int getNumberOfFields(int width, int length)
    {
        // YOUR CODE HERE
        // Use the equations from the last few questions
        // and the mathematical operations you've learned in this lesson
        // You've done an example by hand. Now code it up!
        // TODO: Using the formulas that we developed, compute
        // the total number of rows, then        
        int rows = (int)((length - 2 * radius) / (radius * Math.sqrt(3))) + 1;
        // the number of even and odd rows,
        int numEvenRows = (int)(rows/2);
        int numOddRows = rows - numEvenRows;
        // the number of columns in each even and odd row,
        int circlesPerOddRow = (int)(width / (radius * 2));
        int circlesPerEvenRow = (int)((width = radius) / (radius * 2));
        // and finally the total number of fields
        return numOddRows * circlesPerOddRow + numEvenRows * circlesPerEvenRow;

    }
}
