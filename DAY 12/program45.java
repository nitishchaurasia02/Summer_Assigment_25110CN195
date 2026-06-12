import java.util.*;

public class program45
{
static void pallindrome(int n)
{
    int m=n;
    int dig=0,rev=0;
    while (n>0) {
        dig=n%10;
        rev=rev*10+dig;
        n=n/10;
    }

    
     if (m==rev)
    {
         System.out.print("Pallindrome");
    }
    else
 {
         System.out.print("Not Pallindrome");
       }
    }
       public static void main (String [] args)
    {
          Scanner sc=new Scanner (System.in);
        System.out.print("Enter the numbers:");
        int n=sc.nextInt();
         pallindrome(n);
    }
}
