import java.io.File;
import java.util.Scanner;
public class randomText {
    // read a file and return a random word from the file
    public static String filename = "wordlist.txt";

    public static String getRandomWord()
    {
        return getRandomWord(filename);
    }
    public static String getRandomWord(String filename)
    {
        String word = "";
        try
        {
            Scanner in = new Scanner(new File(filename));
            int numWords = in.nextInt();
            int rand = (int)(Math.random() * numWords);
            // System.out.println(numWords);
            // System.out.println(rand);
            for (int i=0; i<rand; i++)
            {
                in.next();
            }
            word = in.next();
        }
        catch (Exception e)
        {
            System.out.println("Error reading fil" + e);
        }
        return word;
    }
}
