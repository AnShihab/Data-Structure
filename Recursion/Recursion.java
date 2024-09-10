package Main;

public class Recursion 
{ 
    public int fact(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else
        {
            return num*fact(num-1);
        }
    }
    public int fibonacci(int num)
    {
        if(num<=1) 
        {
            return 1;
        }
        else
        {
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
    public static boolean pelindrome(String n,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }
        else if(n.charAt(start)!=n.charAt(end))
        {
            return false;
        }
        else
        {
            return pelindrome(n, start=1, end-1);
        }
    }
    public int number(int n)
    {
        if(n<1)
        {
            return 0;
        }
        System.out.println(n);
        return number(n-1);
    }
    
    public String java(int n)
    {
        if(n<1)
        {
            return null;
        }
        System.out.println("Java ");
        return java(n-1);
    }
    
}
