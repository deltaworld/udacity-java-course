// Calculate the number of days that Sally Ride lived.
public class SallyLife
{
    public static void main(String args[])
    {
        Day birthDay = new Day(1951, 5, 26);    // Sally's Birthday
        Day lastDay = new Day(2012, 7, 23);     // Sally's Death Day
        int result = lastDay.daysFrom(birthDay);// Calculation of Sally's living days
        System.out.println(result);             // Print the result to the console of the days lived.
        
    }
}