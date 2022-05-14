
/**
 * Write a description of class Page here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Page implements java.io.Serializable 
{
    private String pageContent;
    
    Page(String s){
        pageContent = s;
    }
    
    boolean isOccurs(String key){
        return pageContent.contains(key);
    }
    
    int noOccurrences(String key){
        String[] words = pageContent.split(" ");
        int count = 0;
        for (int i=0;i<words.length;i++){
            if (words[i].equalsIgnoreCase(key)){
                count++;
            }
        }
        return count;
    }
    @Override
    public String toString() {
        return pageContent;
    }
}