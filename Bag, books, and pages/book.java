import java.util.*;
public class book {
    // Book contains page, title, author
    String title;
    String author;
    int numPages;
    List<page> pages;

    // constructor for making a book
    public book(String t, String a)
    {
        title = t;
        author = a;
    }
    public book()
    {
        this("Just Life", "Joe");
    }
    // addPage function to create and add a page to list based on content passed
    public void addPage(String content)
    {
        pages.add(content);
    }
    public void addPage(String content, int pno)
    {
        if (pno<pages.size())
        {
            pages.add(pno, content);
        }
        else
        {
            addPage(content);
        }
    }
    // replace page to replace the content of the 
    
}
