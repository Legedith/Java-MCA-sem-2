public class OverFlowException extends Exception {
    int size;
    char ch;
    public OverFlowException(int n, char c)
    {
        size = n;
        ch = c;
    }
    @Override
    public String toString()
    {
        return "OverFlowException : the character "+ch+" cannot be pushed in the stack. \nThe size of Object was "+ size;
    }
}
