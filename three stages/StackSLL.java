// Creating stack using SLL
class StackSLL{
    private SLL s;
    
    public StackSLL(){
        s = new SLL();
    }
    
    
    public void push(int v){
        // System.out.println("Pushing "+v);
        s.insertAtBegin(v);
    }
    
    public int pop(){
        if (!this.isEmpty())
            return s.deleteAtBegin();
        return -99999;
    }
    
    public int peek(){
        return s.getHeadValue();
    }
    
    public boolean isEmpty(){
        return s.getHead() == null;
    }
        


}