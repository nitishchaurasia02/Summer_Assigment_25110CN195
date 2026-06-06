import java.util.*;

public class program32
{
    public static void main (String[]args )
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the limits:");
        int l=sc.nextInt();
        for(int i=0;i<=l;i++)
        {
             for (int j=0;j<i;j++)
                {
                    System.out.print(i);
                } 
                System.out.println();
            }
    }
}
