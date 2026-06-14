import java.util.*;

public class program35
{
    public static void main (String[]args )
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the limits:");
        int l=sc.nextInt();
            int a=65;
        for(int i=0;i<=l;i++)
        {
            
           char b=(char) a;

             for (int j=0;j<=i;j++)
                {
                    System.out.print( b);
                } 
                System.out.println();
                    a++;
            }
    }
}
