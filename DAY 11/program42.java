import java.util.*;
public class program42 {
    static int max(int a,int b)
    {
        if (a>b)
        {
           return a;
        }
        else 
        {
            return b;
        }
    }
 public static void main (String [] args)
    {
          Scanner sc=new Scanner (System.in);
        System.out.print("Enter two numbers:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print("Largest of the two number is ::");
        System.out.println(max(n,m));
    }
    }
