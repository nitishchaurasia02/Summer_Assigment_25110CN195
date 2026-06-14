import java.util.*;
public class program34 
{

            public static void main (String[]args )
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the limits:");
        int f=sc.nextInt();
        for(int i=f;i>=0 ;i--)
{
    int a=0;
    for(int j=1;j<=i;j++)
    {
        
        a++;
        System.out.print(a);
}                
                System.out.println();
            }
    }
}
