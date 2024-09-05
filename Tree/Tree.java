package Main;
import java.util.*;
public class Tree 
{
    Node start;
    public void bst()
    {
        start=null;
    }
    public Node getNode()
    {
        Node newNode=new Node();
        System.out.println("Enter the data =");
        Scanner in=new Scanner(System.in);
        newNode.data=in.nextInt();
        newNode.left=null;
        newNode.right=null;
        return newNode;
    }
    
    public void bst_in()
    {
        Node newNode=getNode();
        if(start==null)
        {
            start=newNode;
        }
        else
        {
            Node temp=start;
            while(true)
            {
                if(newNode.data<temp.data)
                {
                    if(temp.left==null)
                    {
                        temp.left=newNode;
                        System.out.println("imported");
                        break;
                    }
                    else
                    {
                        temp=temp.left;
                    }
                }
                if(newNode.data>temp.data)
                {
                    if(temp.right==null)
                    {
                        temp.right=newNode;
                        System.out.println("imported");
                        break;
                    }
                    else
                    {
                        temp=temp.right;
                    }
                }
                    
            }
        }
    }
    
    public void print_inorder(Node temp)
    {
        if(temp!=null)
        {
            print_inorder(temp.left);
            System.out.println(temp.data+"-->");
            print_inorder(temp.right);
        }
    }
    public void print_preorder(Node temp)
    {
        if(temp!=null)
        {
            System.out.println(temp.data+"-->");
            print_preorder(temp.left);
            print_preorder(temp.right);
        }
    }
    public void print_postorder(Node temp)
    {
        if(temp!=null)
        {
            print_postorder(temp.left);
            print_postorder(temp.right);
            System.out.println(temp.data+"-->");
        }
    }

    public boolean searching(int num)
	{
		Node temp=start;
		if(num==temp.data)
		{
			return true;
		}
		else if(num<temp.data)
		{
			temp=temp.left;
		}
		else
		{
			temp=temp.right;
		}
		return false;
	}
}
