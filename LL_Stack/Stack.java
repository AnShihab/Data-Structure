package Main;
import java.util.*;
public class Stack 
{
    Scanner in=new Scanner(System.in);
    Node start=null;
    
    public Node getNode()
    {
        System.out.println("Enter data : ");
        Node newNode=new Node();
        newNode.data=in.nextInt();
        newNode.next=null;
        return newNode;
    }
    
    public void push()
    {
        Node newNode=getNode();
        if(start==null)
        {
            start=newNode;
        }
        else
        {
            Node temp=start;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    
    public void pop()
    {
        System.out.println("Popping an item");
        if(start==null)
        {
            System.out.println("The list is empty ");
        }
        else
        {
            Node temp=start;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    
    
    public void print()
    {
        if(start==null)
        {
            System.out.println("The list is empty");
        }
        else
        {
            Node temp=start;
            while(temp!=null)
            
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        
    }
}
