package Main;

import java.util.*;
public class Circular {
    Node start = null;
    Scanner sc = new Scanner(System.in);

    public Node getNode() 
    {
        System.out.println("Enter data: ");
        Node newNode=new Node();
        newNode.data=sc.nextInt();
        newNode.prev=null;
        newNode.next=null;
        return newNode;
        
    }

    public void Add_Last() 
    {
        Node newNode = getNode();
        if (start == null) 
        {
            start = newNode;
            start.next = start;
            start.prev = start;
        } 
        else 
        {
			Node temp=start;
			while(temp.next!=start) 
			{
				temp=temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
			newNode.next = start;
			start.prev = newNode;
		}
    }

    public void Add_First() 
    {
        Node newNode = getNode();
        if (start == null) 
        {
            start = newNode;
            start.next = start;
            start.prev = start;
        } 
        else 
        {
            Node last = start.prev;
            newNode.next = start;
            newNode.prev = last;
            start.prev = newNode;
            last.next = newNode;
            start = newNode;
        }
    }

    public void Add_Middle() 
    {
        Node newNode = getNode();
        if (start == null) 
        {
            start = newNode;
            start.next = start;
            start.prev = start;
        } 
        else 
        {
            System.out.print("Enter the position: ");
            int position = sc.nextInt();
            if (position > 1 && position < nodeCounter()) 
            {
                Node temp = start;
                int ctr = 1;
                while (ctr < position - 1) 
                {
                    temp = temp.next;
                    ctr++;
                }
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            } 
            else 
            {
                System.out.println("Invalid Position");
            }
        }
    }

    public void Delete_First() 
    {
        if (start == null) 
        {
            System.out.println("Empty List");
        } 
        else if (start.next == start) 
        { 
            start = null;
        } 
        else 
        {
            Node last = start.prev;
            start = start.next;
            start.prev = last;
            last.next = start;
        }
    }

    public void Delete_last() 
    {
        if (start == null) 
        {
            System.out.println("Empty List");
        } 
        else 
        {
			Node temp=start;
			while(temp.next!=start) 
			{
				temp=temp.next;
			}
			temp = temp.prev;
			temp.next = start;
			start.prev = temp;
		}
    }

    public void Delete_Middle() 
    {
        if (start == null) 
        {
            System.out.println("Empty list, No Node to delete");
        } 
        else 
        {
            System.out.print("Enter the position: ");
            int position = sc.nextInt();
            if (position > 1 && position < nodeCounter()) 
            {
                Node temp = start;
                int ctr = 1;
                while (ctr < position - 1) 
                {
                    temp = temp.next;
                    ctr++;
                }
                Node Delete = temp.next;
                temp.next = Delete.next;
                Delete.next.prev = temp;
            } 
            else 
            {
                System.out.println("Invalid Position");
            }
        }
    }

    public int nodeCounter() 
    {
        if (start == null) 
        {
        	return 0;
        }
        else
        {
        	Node temp = start;
            int counter = 1;
            while (temp.next != start) 
            {
                temp = temp.next;
                counter++;
            }
            return counter;
        }
        
    }

    public void printlist() 
    {
    	if (start==null) 
		{
			System.out.print("The List empty !!!");
		} 
    	else 
		{
			System.out.print(start.data+" ");
			Node temp=start.next;
			while(temp!=start) 
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		System.out.println();
    }
}
