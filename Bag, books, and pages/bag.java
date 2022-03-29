import java.util.*;
public class bag {
    List<book> books;
    // constructors
    public bag()
    {
        books = new ArrayList<book>();
    }
    public bag(List<book> b)
    {
        books = b;
    }
    public void addInBag(book b)
    {
        books.add(b);
    }
    public void addInBag(List<book> b)
    {
        books.addAll(b);
    }
    public void removeFromBag(book b)
    {
        books.remove(b);
    }
    public void removeFromBag(List<book> b)
    {
        books.removeAll(b);
    }
    public List<book> getBooks()
    {
        return books;
    }
    public void setBooks(List<book> b)
    {
        books = b;
    }
    public void printBag()
    {
        for (book b : books)
        {
            System.out.println(b.getTitle());
        }
    }

    // Given a search key word, bag needs to return the details of all books (such as book name, book author etc.) containing the key word.
    public void search(String word)
    {
        for (book b : books)
        {
            if (b.getTotalWordCount(word)>0)
            {
                System.out.println("----------------------------------------------------");
                System.out.println("Title: " + b.getTitle());
                System.out.println("Author: " + b.getAuthor());
                System.out.println("Total Word count: " + b.getTotalWordCount(word));
                System.out.println("----------------------------------------------------");
            }
        }
    }
    //  Given a search key word, bag needs to return that book details (such as book name, author etc.) having that word occurring most of the time.
    public void mostFrequentWord(String word)
    {
        int max = 0;
        book b = null;
        for (book b1 : books)
        {
            if (b1.getTotalWordCount(word)>max)
            {
                max = b1.getTotalWordCount(word);
                b = b1;
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Total Word count: " + b.getTotalWordCount(word));
        System.out.println("----------------------------------------------------");
    }
}
