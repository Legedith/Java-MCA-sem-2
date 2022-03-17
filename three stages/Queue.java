public class Queue {
    private StackSLL s1;
    private StackSLL s2;

    public Queue() {
        s1 = new StackSLL();
        s2 = new StackSLL();
    }

    public void enqueue(int v) {
        System.out.println("Enqueueing " + v);
        s1.push(v);
    }

    public int dequeue() {
        if (!s1.isEmpty())
        {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int ret =  s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return ret;
        }
        return -99999;
        
    }

}
