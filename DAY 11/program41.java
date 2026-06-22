import java.util.*;

public class program41 {
   
static int sum(int n,int m)
{
return n+m;
}
  public static void main (String [] args)
    {
          Scanner sc=new Scanner (System.in);
        System.out.print("Enter the numbers:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print("The  sum of both elements is ::") ;
        System.out.println(sum(n,m));
    }
}
