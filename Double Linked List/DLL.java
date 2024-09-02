import java.util.Scanner;
public class DLL
{
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
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void Insert_at_start() {
        Node newNode = getNode();
        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
    }

    public void Insert_Middle() {
        Node newNode = getNode();
        if (start == null) {
            start = newNode;
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
                if (temp.next != null) {
                    temp.next.prev = newNode;
                }
                temp.next = newNode;
            } else {
                System.out.println("Invalid Position");
            }
        }
    }

    public void Delete_First() {
        if (start == null) {
            System.out.println("Empty List");
        } else {
            start = start.next;
            if (start != null) {
                start.prev = null;
            }
        }
    }

    public void Delete_last() {
        if (start == null) {
            System.out.println("Empty List");
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            if (temp.prev != null) {
                temp.prev.next = null;
            } else {
                start = null;
            }
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
                if (toDelete.next != null) {
                    toDelete.next.prev = temp;
                }
            } else {
                System.out.println("Invalid Position");
            }
        }
    }

    public int nodeCounter() {
        Node temp = start;
        int counter = 1;
        while (temp.next != null) {
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
            while (temp != null) {
                if (temp.next != null) {
                    System.out.print(temp.data + " <--> ");
                } else {
                    System.out.print(temp.data);
                }
                temp = temp.next;
            }
        }
        System.out.println();
    }
}
