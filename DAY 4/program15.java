import java.util.Scanner;
public class program15
 {
    public static void main(String []args)
    {
        int n,dig,sum=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextInt();
        int m=n;
        int t=n;
        while(n>0)
        {
         dig=n%10;
        c++;
        n=n/10;
        }
        System.out.println("Number of digits: " + c);
        while(t>0)
        {
         dig=t%10;
        t=t/10;
sum=sum+ (int)Math.pow(dig,c);
        }
      if(sum==m)
      {
          System.out.println("Armstrong number");
      }
      else
      {
          System.out.println("Not an Armstrong number");
      }
    }

}
