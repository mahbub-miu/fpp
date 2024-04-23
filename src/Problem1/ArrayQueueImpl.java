package src.Problem1;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;
    //private int count=0;
    public int peek() {
        if(isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        return arr[front-1];
    }
    public void enqueue(int obj){
        if(front>=arr.length) {
            resize();
        }

        if(front<0) {
            front = 1;
            arr[rear] = obj;
        }
        else {
            rear = front;
            arr[rear] = obj;
            front++;
            rear=0;
        }


        //count++;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data=arr[front-1];
        //count--;
        front--;
        return data;

    }
    public boolean isEmpty(){
        return (front==-1);
    }
    public int size(){
        return front;
    }
    private void resize(){
        int[] temp=new int[arr.length*2];
        System.arraycopy(arr,0,temp,0,arr.length);
        arr=temp;
    }
}