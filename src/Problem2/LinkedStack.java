package src.Problem2;

public class LinkedStack {
    class Node{
        int val;
        Node next;
        Node(int x){
            val=x;
        }
    }
    int count;
    Node top;
    LinkedStack(){
        count=0;
        top=new Node(0);
    }

    public void push(int val){
        Node toAdd=new Node(val);
        Node pred = top;
        toAdd.next=pred.next;
        pred.next=toAdd;
        count++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        Node pred=top;
        int value=pred.next.val;
        pred.next=pred.next.next;
        count--;
        return value;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            Node pred=top;
            return pred.next.val;
        }
        return -1;
    }

    public boolean isEmpty(){
        return (count==0);
    }
    public int size(){
            return count;
    }

    public void displayStack(){
        Node p=top.next;
        while (p !=null){
            System.out.println(p.val);
            p=p.next;

        }
    }
}
