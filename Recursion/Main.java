package Main;

public class Main 
{
    public static void main(String[] args) 
    {
        Recursion r=new Recursion();
        System.out.println("Result of the factorial is ="+r.fact(6));
        System.out.println("Result of the fibonacchi is ="+r.fibonacci(9));
        
        String str = "sos";
        boolean result = Recursion.pelindrome(str, 0, str.length() - 1);
        System.out.println("Result of the palindrome is = " + result);
        
        r.number(100);
        System.out.println();
        r.java(50);
    }
}
