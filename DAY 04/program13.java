import java.util.Scanner;
public class program13
{
    public static void main(String []args)
    {
      int x=0,y=1,l,z=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the limit of the Fibonacci series:");
      l=sc.nextInt();
      while(x<l)
      {
      z=x+y;
      x=y;
      y=z;
      
        System.out.print(" " +x);  
    }
}
}