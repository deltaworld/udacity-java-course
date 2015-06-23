// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
        // rows = (int)((length - 2*radius) / (radius * sqrt(3))) + 1;
        // colsOdd = (int)(width / (radius*2))
        // colsEve = (int)((width - radius)/ (radius*2))
        // oddRows = (int)((rows+1)/2)
        // eveRows = (int)(rows/2)
        // noOnRows = (int)((total/2) + total%2)
        // totalCircles = numOddRows * circlesPerOddRow + numEvenRows * circlesPerEvenRow

    public int getNumberOfFields(int radius)
    {
        // TODO: Using the formulas that Sara developed, compute
        // the total number of rows, then
        int rows = (int)((this.length - 2 * radius) / (radius * Math.sqrt(3))) + 1;
        // the number of even and odd rows,
        int numEvenRows = (int)(rows/2);
        int numOddRows = rows - numEvenRows;
        // the number of columns in each even and odd row,
        int circlesPerOddRow = (int)(this.width / (radius * 2));
        int circlesPerEvenRow = (int)((this.width - radius) / (radius * 2));
        // and finally the total number of fields
        return numOddRows * circlesPerOddRow + numEvenRows * circlesPerEvenRow;
    }
}
