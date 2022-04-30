public class UnderFlowException extends Exception  {
    public UnderFlowException()
    {

    }
    @Override 
    public String toString()
    {
        return "UnderFlowException : We cannot pop any character from the stack.";
    }
}
