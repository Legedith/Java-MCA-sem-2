class UseStack{
    // Write a class to test out stack functionality
    public static void main(String[] args)
    {
        StackSLL stack = new StackSLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Popping from stack: " + stack.pop());
        System.out.println("Popping from stack: " + stack.pop());
        System.out.println("Popping from stack: " + stack.pop());

        stack.push(3);
        stack.push(4);
        stack.push(5);
        

        System.out.println("Pooping from stack: " + stack.pop());
        System.out.println("Pooping from stack: " + stack.pop());
        System.out.println("Pooping from stack: " + stack.pop());
        System.out.println("Pooping from stack: " + stack.pop());
        System.out.println("Pooping from stack: " + stack.pop());
        
        System.out.println("Pooping from stack: " + stack.pop());
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top of stack: " + stack.peek());

    }
}