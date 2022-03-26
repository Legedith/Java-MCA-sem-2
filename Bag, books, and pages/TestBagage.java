import java.util.*;
public class TestBagage {
    public static void main(String[] args)
    {
        // Make 5 books and add them to bag
        book b1 = new book("The Hobbit", "J.R.R. Tolkien");
        book b2 = new book("The Lord of the Rings", "J.R.R. Tolkien");
        book b3 = new book("The Silmarillion", "J.R.R. Tolkien");
        book b4 = new book("Flying circus of physics", "Anna Frank");
        book b5 = new book();

        List<book> books = new ArrayList<book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        // loop over books
        //      get a random int from 5 - 10
        //          insert that many pages in book
        //              make pages by using randomText.getRandomWord()
        for (book b : books)
        {
            int numPages = (int)(Math.random() * 6) + 5;
            for (int i=0; i<numPages; i++)
            {
                String content = "";
                for (int j = 0; j<(int)(Math.random() * 20) + 10; j++)
                {
                    content += randomText.getRandomWord() + " ";
                }
                System.out.println(content);
                b.addPage(content);
            }
        }
        
        // System.out.println("Random words from wordlist.txt:");
        // for (int i = 0; i < 30; i++)
        //     System.out.println(randomText.getRandomWord());

        bag backpack = new bag(books);


    }
}
