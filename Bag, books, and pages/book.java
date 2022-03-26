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
        int pno = pages.size();

        page p = new page(pno, content);
        pages.add(p);
    }
    public void addPage(String content, int pno)
    {
        if (pno<pages.size())
        {
            page p = new page(pno, content);
            pages.add(pno, p);
        }
        else
        {
            addPage(content);
        }
    }
    // replace page to replace the content of the 
    
}
