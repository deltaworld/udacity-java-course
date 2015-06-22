// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
        Day birthday = new Day(1989, 7, 1);
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900

        // January 1, 1900 was a Monday
        // Compute the number of days from that day until the birthday
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday
        Day startDay = new Day(1900, 1, 1);
        
        int weekday = birthday.daysFrom(startDay) % 7 - 1;
        
//         String weekday;
//         switch (dayOfWeek) {
//             case 0:  weekday = "Sunday";
//                      break;
//             case 1:  weekday = "Monday";
//                      break;
//             case 2:  weekday = "Tuesday";
//                      break;
//             case 3:  weekday = "Wednesday";
//                      break;
//             case 4:  weekday = "Thursday";
//                      break;
//             case 5:  weekday = "Friday";
//                      break;
//             case 6:  weekday = "Saturday";
//                      break;
//             default: weekday = "Invalid day";
//                      break;
//         }
        
        
        

        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
