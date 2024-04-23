package src.Problem1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();

        System.out.println("Populating the queue......");
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(12);
        arrayQueue.enqueue(13);
        arrayQueue.enqueue(14);
        arrayQueue.enqueue(15);
        arrayQueue.enqueue(16);
        arrayQueue.enqueue(17);
        arrayQueue.enqueue(18);
        arrayQueue.enqueue(19);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(21);
        System.out.println("12 values are enqueued");

        System.out.println();
        System.out.println("Check the Queue size after enqueueing");
        System.out.println("======================================");
        System.out.println("Queue size : "+arrayQueue.size());


        System.out.println();
        System.out.println("Check the peek method");
        System.out.println("======================================");
        int a=arrayQueue.peek();
        System.out.println("Expected value : 21");
        System.out.println("Returned value :"+a);


        System.out.println();
        System.out.println("Dequeue the full queue using loop");
        System.out.println("======================================");
        for(int i=arrayQueue.size(); i>0; i=i-1){
            int topValue=arrayQueue.dequeue();
            System.out.println(topValue);
        }

        System.out.println();
        System.out.println("Check the Queue size after dequeuing");
        System.out.println("======================================");
        System.out.println("Queue size : "+arrayQueue.size());

        System.out.println();
        System.out.println("Populating the queue again.....");
        System.out.println("======================================");
        arrayQueue.enqueue(100);
        arrayQueue.enqueue(200);
        arrayQueue.enqueue(300);
        arrayQueue.enqueue(400);
        arrayQueue.enqueue(500);

        System.out.println();
        System.out.println("Check the Queue size after enqueueing");
        System.out.println("======================================");
        System.out.println("Queue size : "+arrayQueue.size());

        System.out.println();
        System.out.println("Check the peek method");
        System.out.println("======================================");
        int c=arrayQueue.peek();
        System.out.println("Expected value : 500");
        System.out.println("Returned value :"+c);
    }
}