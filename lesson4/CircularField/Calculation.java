public class Calculation
{
    public static void main(String[] args)
    {
        double number = 400 * Math.sqrt(3);
        double height = 800;
        
        System.out.println(height + 4*number);
        
        // rows = (int)((length - 2*radius) / (radius * sqrt(3))) + 1;
        // colsOdd = (int)(width / (radius*2))
        // colsEve = (int)((width - radius)/ (radius*2))
        // oddRows = (int)((rows+1)/2)
        // eveRows = (int)(rows/2)
        // noOnRows = (int)((total/2) + total%2)
        // totalCircles = numOddRows * circlesPerOddRow + numEvenRows * circlesPerEvenRow
    }
}
