import java.util.Scanner;
public class program14
{
    public static void main(String []args)
    {
      int x=0,y=1,l,c=0,z=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the n th term of the Fibonacci series to be printed:");
      l=sc.nextInt();
      while(c<=l)
      {
      z=x+y;
      x=y;
      y=z;
      c++;
      if(c==l)
      {
        System.out.print("REQUIRED FIBONACCI TERM IS:"+x);
      }
       }
    }
}
