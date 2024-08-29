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
        
    }

}
