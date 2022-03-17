public class UseQueue {
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("Dequeueing: "+q.dequeue());
        System.out.println("Dequeueing: "+q.dequeue());
        System.out.println("Dequeueing: "+q.dequeue());
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println("Dequeueing: "+q.dequeue());
        System.out.println("Dequeueing: "+q.dequeue());

        System.out.println("Dequeueing: "+q.dequeue());
        System.out.println("Dequeueing: "+q.dequeue());
    }
}
