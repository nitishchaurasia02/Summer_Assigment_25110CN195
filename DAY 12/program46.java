import java.util.*;

public class program46
{
static void armstrong(int n)
{
    int m=n;
    int t=n;
    int dig=0,c=0,sum=0;
    while (n>0)
         {
        dig=n%10;
    c++;
    n=n/10;
    }
     while(m>0)
        {
         dig=m%10;
        m=m/10;
sum=sum+ (int)Math.pow(dig,c);
        }
      if(sum==t)
      {
          System.out.println("Armstrong number");
      }
      else
      {
          System.out.println("Not an Armstrong number");
      }
    }


       public static void main (String [] args)
    {
          Scanner sc=new Scanner (System.in);
        System.out.print("Enter the numbers:");
        int n=sc.nextInt();
         armstrong(n);
    }
}
