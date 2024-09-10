package Main;
public class Main
{
    public static void main(String[] args) 
    {
        Circular c=new Circular();
        c.Add_Last();
        c.Add_Last();
        c.Add_Last();
        c.Add_Last();
        c.printlist();
        System.out.println();  
        c.Add_First();
        c.printlist();
        System.out.println();
        c.Add_Middle();
        c.printlist();
        System.out.println();
        System.out.println();

        c.Delete_First();
        c.printlist();
        System.out.println();

        c.Delete_last();
        c.printlist();
        System.out.println();

        c.Delete_Middle();
        c.printlist();
        System.out.println();
    }
}
