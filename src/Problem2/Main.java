package src.Problem2;

public class Main {
    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        System.out.println();
        System.out.println("Stack is populating......");
        System.out.println("==========================");
        linkedStack.push(10);
        linkedStack.push(20);
        linkedStack.push(30);
        System.out.println("Added 3 items");
        linkedStack.displayStack();



        System.out.println();
        System.out.println("Check pop method");
        System.out.println("==========================");
        System.out.println("Last item 30 should be picked and then deleted");
        System.out.println("Deleted item by POP: "+linkedStack.pop());


        System.out.println();
        System.out.println("List after pop");
        System.out.println("==========================");
        linkedStack.displayStack();


        System.out.println();
        System.out.println("Stack is populating.with few more items.....");
        System.out.println("==========================");
        linkedStack.push(90);
        linkedStack.push(100);
        System.out.println("2 more items added");
        linkedStack.displayStack();


        System.out.println();
        System.out.println("Checking peek method");
        System.out.println("===============");
        System.out.println("Expected result: 100 and Actual result : "+linkedStack.peek());


        System.out.println();
        System.out.println("Display all the items in the stack");
        System.out.println("================================");
        linkedStack.displayStack();
    }
}