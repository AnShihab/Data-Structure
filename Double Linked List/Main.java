import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        System.out.println("1. Addition");
        System.out.println("    a.First");
        System.out.println("    b.Middle");
        System.out.println("    c.End");
        System.out.println("2. Deletion");
        System.out.println("    a.First");
        System.out.println("    b.Middle");
        System.out.println("    c.End");

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String inputb = in.next().toLowerCase();

        DLL list=new DLL();
        if (input == 1) 
        {
            if (inputb.equals("a")) 
            {
                list.Insert_at_start();
                list.printlist();
                list.Insert_at_start();
                list.printlist();
                list.Insert_at_start();
                list.printlist();
            } 
            else if (inputb.equals("b")) 
            {
                list.Insert_Middle();
                list.printlist();
                list.Insert_Middle();
                list.printlist();
                list.Insert_Middle();
                list.printlist();
            } 
            else if (inputb.equals("c")) 
            {
                list.Insert_at_end();
                list.printlist();
                list.Insert_at_end();
                list.printlist();
                list.Insert_at_end();
                list.printlist();
                list.Insert_at_end();
                list.printlist();
            }
        } 
        
        else if (input == 2) 
        {
            if (inputb.equals("a")) 
            {
                list.Delete_First();
                list.printlist();
                list.Delete_First();
                list.printlist();
                list.Delete_First();
                list.printlist();
            } 
            else if (inputb.equals("b")) 
            {
                list.deleteMiddle();
                list.printlist();
                list.deleteMiddle();
                list.printlist();
                list.deleteMiddle();
                list.printlist();
            } 
            else if (inputb.equals("c")) 
            {
                list.Delete_last();
                list.printlist();
                list.Delete_last();
                list.printlist();
                list.Delete_last();
                list.printlist();
                list.Delete_last();
                list.printlist();
                list.Delete_last();
                list.printlist();
            }
        }
        in.close();
    }
}
