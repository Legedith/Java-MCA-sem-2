public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        if (!this.isFull())
        {
            stackArray[++top] = j;
        }
        else
        {
            System.out.println("Stack is full");
            return;
        }        
    }

    public char pop() {
        if (!this.isEmpty())
        {
            return stackArray[top--];
        }
        else
        {
            System.out.println("Stack is empty");
            return '\0';
        }
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
