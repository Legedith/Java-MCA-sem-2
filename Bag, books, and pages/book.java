import java.util.*;
public class book {
    // Book contains page, title, author
    String title;
    String author;
    List<page> pages;

    // constructor for making a book
    public book(String t, String a)
    {
        title = t;
        author = a;
        pages = new ArrayList<page>();
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
    public void removePage(int pno)
    {
        if (pno<pages.size())
        {
            pages.remove(pno);
        }
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getNumPages()
    {
        return pages.size();
    }
    public int getTotalWordCount(String word)
    {
        int count = 0;
        for (page p : pages)
        {
            count += p.getWordCount(word);
        }
        return count;
    }

    
}
