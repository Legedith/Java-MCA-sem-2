
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book implements java.io.Serializable 
{
    private Page[] myPages = new Page[100];
    private int noPages;
    private String author;
    private String title;
    
    public Book(String[] pageData,String author,String title){
        noPages = pageData.length;
        this.author = author;
        this.title = title;
        
        for (int i=0;i<noPages;i++){
            myPages[i] = new Page(pageData[i]);
        }
    }
    
    public boolean doIHave(String key){
        for (int i=0;i<noPages;i++){
            if (myPages[i].isOccurs(key)){
                return true;
            }
        }
        return false;
    }
    
    public int getCount(String key){
        int myCount = 0;
        for (int i=0;i<noPages;i++){
            myCount+=myPages[i].noOccurrences(key);
        }
        return myCount;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();  
        for (int i=0;i<noPages;i++){
            sb.append(myPages[i].toString());
            sb.append(" ");
        }
        return sb.toString();
    }
    
    
}
