import java.util.Scanner;

public class DLL {
    Node start = null;
    Scanner sc = new Scanner(System.in);

    public Node getNode() {
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        return new Node(data);
    }

    public void Insert_at_end() {
        Node newNode = getNode();
        if (start == null) {
            start = newNode;
            start.next = start;
            start.prev = start;
        } else {
            Node last = start.prev; // Get the last node
            last.next = newNode;
            newNode.prev = last;
            newNode.next = start;
            start.prev = newNode;
        }
    }

    public void Insert_at_start() {
        Node newNode = getNode();
        if (start == null) {
            start = newNode;
            start.next = start;
            start.prev = start;
        } else {
            Node last = start.prev; // Get the last node
            newNode.next = start;
            newNode.prev = last;
            start.prev = newNode;
            last.next = newNode;
            start = newNode;
        }
    }

    public void Insert_Middle() {
        Node newNode = getNode();
        if (start == null) {
            start = newNode;
            start.next = start;
            start.prev = start;
        } else {
            System.out.print("Enter the position: ");
            int position = sc.nextInt();
            if (position > 1 && position < nodeCounter()) {
                Node temp = start;
                int ctr = 1;
                while (ctr < position - 1) {
                    temp = temp.next;
                    ctr++;
                }
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            } else {
                System.out.println("Invalid Position");
            }
        }
    }

    public void Delete_First() {
        if (start == null) {
            System.out.println("Empty List");
        } else if (start.next == start) { // Only one node in the list
            start = null;
        } else {
            Node last = start.prev;
            start = start.next;
            start.prev = last;
            last.next = start;
        }
    }

    public void Delete_last() {
        if (start == null) {
            System.out.println("Empty List");
        } else if (start.next == start) { // Only one node in the list
            start = null;
        } else {
            Node last = start.prev;
            last.prev.next = start;
            start.prev = last.prev;
        }
    }

    public void deleteMiddle() {
        if (start == null) {
            System.out.println("Empty list, No Node to delete");
        } else {
            System.out.print("Enter the position: ");
            int position = sc.nextInt();
            if (position > 1 && position < nodeCounter()) {
                Node temp = start;
                int ctr = 1;
                while (ctr < position - 1) {
                    temp = temp.next;
                    ctr++;
                }
                Node toDelete = temp.next;
                temp.next = toDelete.next;
                toDelete.next.prev = temp;
            } else {
                System.out.println("Invalid Position");
            }
        }
    }

    public int nodeCounter() {
        if (start == null) return 0;
        Node temp = start;
        int counter = 1;
        while (temp.next != start) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    public void printlist() {
        System.out.println();
        if (start == null) {
            System.out.println("\nCan't print list (Empty list)");
        } else {
            Node temp = start;
            do {
                if (temp.next != start) {
                    System.out.print(temp.data + " <--> ");
                } else {
                    System.out.print(temp.data);
                }
                temp = temp.next;
            } while (temp != start);
        }
        System.out.println();
    }
}
