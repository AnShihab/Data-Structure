import java.util.*;

public class Main {

    public static boolean randomSearch(int no, int[] ids, int size) 
    {
        if (size == 0) 
        {
            ids[0] = no;
            return true;
        } 
        else 
        {
            for (int i = 0; i < size; i++) 
            {
                if (ids[i] == no) 
                {
                    return false;  // Duplicate found
                }
            }
            ids[size] = no;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        int[] ids = new int[100];
        SRM t = new SRM();
        int index = 0;
        int opt;
        Scanner in = new Scanner(System.in);

        System.out.println("***************************************************************");
        System.out.println("***************************************************************");
        System.out.println("**                                                           **");
        System.out.println("**                    Student Record                         **");
        System.out.println("**                   Management System                       **");
        System.out.println("**                                                           **");
        System.out.println("**                                                           **");
        System.out.println("**                                                           **");
        System.out.println("***************************************************************");
        System.out.println("***************************************************************");
        

        do {
            System.out.println("1. Enter a new student record.");
            System.out.println("2. Search for a student record.");
            System.out.println("3. Display all students.");
            System.out.println("4. Exit");
            opt = in.nextInt();

            if (opt == 1) 
            {
                boolean ans = false;
                while (!ans) 
                {
                    Random random = new Random();
                    int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
                    ans = randomSearch(randomNumber, ids, index);
                    if (ans) 
                    {
                        t.bst_in(randomNumber);
                        index++;
                    }
                }

            } 
            else if (opt == 2) 
            {
                System.out.println("Enter the roll number to search:");
                int searchRoll = in.nextInt();
                Node result = t.searching(searchRoll);
                if (result != null) 
                {
                    System.out.println("Student Found: ");
                    System.out.println("Roll No: " + result.roll);
                    System.out.println("Name: " + result.name);
                    System.out.println("CGPA: " + result.cgpa);
                    System.out.println("Department: " + result.dept);
                } 
                else 
                {
                    System.out.println("Student record not found.");
                }

            } 
            else if (opt == 3) 
            {
                System.out.println("Displaying all students:");
                t.displayAll();

            } 
            else if (opt == 4) 
            {
                System.out.println("Exiting...");
            } 
            else 
            {
                System.out.println("Invalid option.");
            }

        } 
        while (opt != 4);

        in.close();
    }
}
