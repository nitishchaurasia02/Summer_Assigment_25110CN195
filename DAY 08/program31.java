import java.util.*;

public class program31 
{
    public static void main (String[]args )
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the limits:");
        int l=sc.nextInt();
        for(int i=0;i<=l;i++)
        {
            int a=65;
            

             for (int j=0;j<i;j++)
                {
                  char b=(char) a;
                  a++;
                    System.out.print( b);
                } 
                System.out.println();
            }
    }
}
