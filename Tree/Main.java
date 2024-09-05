package Main;

public class Main {

    public static void main(String[] args) 
    {
        Tree t=new Tree();
        t.bst_in();
        t.bst_in();
        t.bst_in();
        t.bst_in();
        t.bst_in();
        t.bst_in();
        t.bst_in();
        
        System.out.println("Inorder ");
        t.print_inorder(t.start);
        System.out.println("Postorder ");
        t.print_postorder(t.start);
        System.out.println("Preorder ");
        t.print_preorder(t.start);
        System.out.println();
		
	boolean found=false;
	while(!found)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the vlaue u want to find =");
		int value=in.nextInt();
		if(t.searching(value))
		{
			System.out.println("The vlaue is found");
			found=true;
		}
		else
		{
			System.out.println("The vlaue is not found");
		}
	}      
    }

}
