import java.util.*;
public class program22
{
    public static void main (String []args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a binary number: ");
        int n,m=0,r=0,c;
        n=sc.nextInt();
        while(n>0)
        {
      c=n%10;
   
 r =  r +  c*(int)Math.pow(2,m);
      n=n/10;
        m++;
        }
        System.out.println("REQUIRED DECIMAL RESULT:"+r);
    }
}
