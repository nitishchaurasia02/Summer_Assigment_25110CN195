import java.util.*;
public class program24 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        int n,r=1,p;
  System.out.println("Enter a  number :");
        n=sc.nextInt();
  System.out.println("Enter power upto which wanted to calculate result :");
  p=sc.nextInt();
  for (int i=1;i<=p;i++)
  {
 r=r*n;

  }
  System.out.println(r);
  }
    
  
}
