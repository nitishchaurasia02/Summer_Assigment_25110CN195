import java.util.*;
public class program39
{
    public static void main (String [] args)
    {
        int a=1;
        
          Scanner sc=new Scanner (System.in);
        System.out.print("Enter the limits:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++){


 System.out.print(" ");
            }
             System.out.print(a*a );
              a=10*a+1;
              System.out.println();
            }
    sc.close();
    }
}