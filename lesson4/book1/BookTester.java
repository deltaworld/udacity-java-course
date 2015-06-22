public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("aliceInWonderland.txt");

        System.out.println(alice.getNumCharacters());
        System.out.println("Expected: 144331");

        Book mary = new Book("mary.txt");
        System.out.println(mary.getNumCharacters());
        System.out.println("Expected: 475");
        
        System.out.print("Actual: ");
        System.out.println(alice.firstOccurrenceOfMadHatter());
        System.out.println("Expected: -1");

        Book code = new Book("BookTester.java");
        System.out.print("Actual: ");
        System.out.println(code.firstOccurrenceOfMadHatter());
        System.out.println("Expected: 3");
        
        System.out.println();
        System.out.print("Actual: ");
        System.out.println(alice.getFirstSentence());
        System.out.println("Expected: ");
        System.out.println("CHAPTER I Down the Rabbit-Hole" + 
"" +
"Alice was beginning to get very tired of sitting by her sister on the" +
"bank, and of having nothing to do: once or twice she had peeped into the" +
"book her sister was reading, but it had no pictures or conversations in" +
"it, 'and what is the use of a book,' thought Alice 'without pictures or" +
"conversation?'.");
        
    }
}
