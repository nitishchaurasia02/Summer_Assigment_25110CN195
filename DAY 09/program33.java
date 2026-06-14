import java.util.*;

public class program33 
{
    public static void main (String[]args )
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the limits:");
        int l=sc.nextInt();
        for(int i=l;i>=0 ;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
}                
                System.out.println();
            }
    }
}

