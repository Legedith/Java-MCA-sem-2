public class doublyLinkedList{
    // create head 
    public node head;

    // constructor
    public doublyLinkedList()
    {
        this.head = null;
    }
    public void addToFront(int ele)
    {
        node temp = new node(ele);
        if (head == null)
        {
            head = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }
    public void printdll()
    {
        node temp = head;
        if (temp == null)
        {
            return;
        }
        else{
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}