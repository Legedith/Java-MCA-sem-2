public class page {
    
    private int pageno;
    private String content;
    
    public page()
    {
        this(0, "");
    }
    
    public page(int n, String s)
    {
        pageno = n;
        content = s;
    }

    public void changePageNo(int n)
    {
        pageno = n;
    }
    public int getPageNo()
    {
        return pageno;
    }
    public void changeContent(String s)
    {
        content = s;
    }
    public String getContent()
    {
        return content;
    }
    public int getWordCount(String word)
    {
        // return count of times the word appears in the content, 0 if not found
        int count = 0;
        String[] words = content.split(" ");
        for (String w : words)
        {
            if (w.equals(word))
            {
                count++;
            }
        }
        return count;
    }
    // Finished page class
}
