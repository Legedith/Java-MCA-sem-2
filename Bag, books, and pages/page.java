public class page {
    int pageno;
    String content;
    
    public page()
    {
        page(0, "");
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

}
