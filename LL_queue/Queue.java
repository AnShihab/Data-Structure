import java.util.*;

public class Queue{
    Scanner input=new Scanner(System.in);
    Node start=null;
    
    //node creating function
    public Node getNode() {
        System.out.print("Enter data:");
        Node newNode=new Node();
        newNode.data=input.nextInt();
        newNode.next=null;
        return newNode;
    }
    
    public void enqueue() {
        Node newNode=getNode();
        if(start==null) {
            start=newNode;
        }else {
            Node temp=start;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void dequeue() {
        System.out.println("\nDequeuing 1 item...");
        if(start==null) {
            System.out.println("Queue already empty !!!");
        }else {
            start=start.next;
        }
    }
    public void printQueue() {
        System.out.println();
        if(start==null) {
            System.out.println("Nothing to print(queue empty)");
        }else {
            Node temp=start;
            while(temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    
}
