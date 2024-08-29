public class Main 
{
    public static void main(String[] args) 
    {
        Ll ll =new Ll();
        ll.Insert_at_end();
        ll.Insert_at_end();
        ll.Insert_at_end();
        ll.Insert_at_end();
        ll.printlist();

        ll.Insert_at_start();
        ll.printlist();
        
        ll.Insert_Middle();
        ll.printlist();
        
        ll.Delete_First();
        ll.printlist();

        ll.Delete_last();
        ll.printlist();

        ll.deleteMiddle();
        ll.printlist();
    }
}
