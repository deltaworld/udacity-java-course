import java.util.Scanner;
// BlueJ Project: lesson4/book7
// Video: Working with the Book Text

public class LookUpAnyWord
{
    public static void main(String[] args)
    {
        System.out.print("Type a word and I'll tell you how many times it appears: ");
        
        // TODO: Create an scanner object to read the user input
        Scanner sc = new Scanner(System.in);
        // Read a word from the scanner and assign it to a String variable named word
        String word = sc.next();

        // TODO: Create a book object that reads from aliceInWonderland.txt
        Book alice = new Book("aliceInWonderland.txt");
        int occurrences = alice.occurrencesOf(word);
        // TODO: Find the number of occurences of that word and assign it to a variable named occurences
        System.out.println(word + " occurs " + occurrences + " times!");
        
    }
}
