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
}
