import java.util.Scanner;
public class Ll
{
    Scanner sc = new Scanner(System.in);
    Node start = null;
    
    public Node getNode() {    // Get the node
        int data;
        System.out.println("Enter data : ");
        data = sc.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
    }
    public void Insert_at_end() {
        Node newNode = getNode();
        if(start == null) {
            start = newNode;
        }else {
            Node temp = start;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        
    }
    public void Insert_at_start() {
        Node newNode = getNode();
        if(start == null) {
            start = newNode;
        }else {
            newNode.next = start;
            start = newNode;
        }
    }
    public void Insert_Middle() {
        Node newNode = getNode();
            if(start == null) {
                start = newNode;
            }else {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the position : ");
                int position = sc.nextInt();
                
                if(position >1 && position < nodeCounter()) {
                    Node temp = start;
                    int ctr = 1;
                    while(ctr<position-1) {
                        temp = temp.next;
                        ctr++;
                    }
                    newNode.next = temp.next;
                    temp.next = newNode;
                }else {
                    System.out.println("Invaid Position");
                }
        }
    }
    
    public void Delete_First() {
        if(start == null) {
            System.out.println("Empty List");
        }else {
            start = start.next;
        }
    }
    public void Delete_last() {
        if(start == null) {
            System.out.println("Empty List");
        }else {
            Node temp = start;
            while(temp.next.next!=null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void deleteMiddle() {
        if(start ==null) {
            System.out.println("Empty list, No Node to delete");
        }else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the position : ");
            int position = sc.nextInt();
            sc.close();
            if(position >1 && position < nodeCounter()) {
                Node temp = start;
                int ctr = 1;
                while(ctr<position-1) {
                    temp = temp.next;
                    ctr++;
                }
                temp.next = temp.next.next;
            }else {
                System.out.println("Invaid Position");
            }
        }
    }
    public int nodeCounter() {
        Node temp = start;
        int counter = 1;
        while(temp.next != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }
    public void printlist() {
        System.out.println();
        if(start == null) {
            System.out.println("\nCan't print list (Empty list)");
        }else {
            Node temp = start;
            while(temp != null) {
                if(temp.next != null) {
                    System.out.print(temp.data + "--->");
                }else {
                    System.out.print(temp.data);
                }
                temp = temp.next;
            }
        }
        System.out.println();
    }
}
