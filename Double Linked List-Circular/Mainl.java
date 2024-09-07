public class Main
{
    public static void main(String[] args) 
    {
        Circular c=new Circular();
        c.Insert_at_end();
        c.Insert_at_end();
        c.Insert_at_end();
        c.Insert_at_end(); 
        c.printlist();
        System.out.println();  
        c.Insert_at_start();
        c.printlist();
        System.out.println();
        c.Insert_Middle();
        c.printlist();
        System.out.println();
        System.out.println();

        c.Delete_First();
        c.printlist();
        System.out.println();

        c.Delete_last();
        c.printlist();
        System.out.println();

        c.deleteMiddle();
        c.printlist();
        System.out.println();
    }
}
