// BlueJ Project: lesson4/book1
// Video: Working with the Book Text

import java.util.Scanner;
import java.io.File;
import org.apache.commons.lang3.StringUtils;

public class Book
{
    private String bookText;
    private int firstPeriod;


    public Book(String fileName)
    {
        readBook(fileName);
    }

    /**
     * Gets the first sentence of this book.
     * @return the first sentence (including the period) of this book.
     */
    public String getFirstSentence()
    {
        this.firstPeriod = bookText.indexOf(".");
        return bookText.substring(0, this.firstPeriod+1);
    }
    
    /**
     * Gets the second sentence of this book.
     * @return the second sentence (including the period) of the book.
     */
    public String getSecondSentence()
    {
        int secondPeriod = bookText.indexOf(".", this.firstPeriod+2);
        return this.bookText.substring(this.firstPeriod+2,secondPeriod+1);
    }
    
    /**
     * Counts how many times a given word occurs in this book.
     * @param word a word of length >= 1
     * @return the number of occurrences
     */
    public int occurrencesOf(String word)
    {
        // TODO: Find the number of times the word "Alice" occurs in this book
        int wordLength = word.length();
        int numChars = this.getNumCharacters();
        String replacedBook = this.bookText.replace(word, "");
        int numCharsReplacedBook = replacedBook.length();
        
        return (numChars - numCharsReplacedBook) / wordLength;
        
        //return StringUtils.countMatches(this.bookText, alice);
        
    }
    /**
     * Calculates the number of characters (as in letters and
     * symbols, not people) in the book.
     * @return the number of letters and symbols in the book.
     */
    public int getNumCharacters()
    {
        // TODO: Complete this method
        // You will want to use the fact sheet linked in the instructor comments.
        // Which string method do you want to use?
        return this.bookText.length();
    }
    
    /**
       Finds where the string "Mad Hatter" occurs for the first time in the book.
       @return the location of the first occurrence of the string
    */
 
    public int firstOccurrenceOfMadHatter()
    {
        // TODO: Complete this method
        //
        // Check the fact sheet. There is a String function
        // that can do this for you.
        return this.bookText.indexOf("Mad Hatter");
    }
    /**
     * A method to help read the book out of the file.
     * You don't have to read this unless you want to.
     * the "try" and "catch" are java's way of dealing with
     * runtime errors or "exceptions".
     */
    public void readBook(String fileName)
    {
        bookText = "";
        try
        {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                bookText += line + "\n";
            }
            file.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
