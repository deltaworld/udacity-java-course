// Bluej project: lesson5-2/vowels

public class Word
{
    private String letters;
    
    public Word(String letters) 
    {
        this.letters = letters.toLowerCase();
    }
    
    /** Checks whether the ith letter is a vowel.
     *  @return true if the ith letter is a vowel, false otherwise.
     */
    public boolean isVowel(int i)
    {
        // TODO your code here!
        // A little piece of code to get you started
        String letter = letters.substring(i, i + 1);
        return letter.equals("a") 
            || letter.equals("e") 
            || letter.equals("i") 
            || letter.equals("o") 
            || letter.equals("u");
    }
    
    /** Checks whether the ith letter is a consonant.
     *  @return true if the ith letter is a consonant, false otherwise.
     */
    public boolean isConsonant(int i)
    {
        if (!isVowel(i)) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
