import java.util.*;
public class program40
{
    public static void main (String [] args)
    {
        int a=65;
          Scanner sc=new Scanner (System.in);
        System.out.print("Enter the limits:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++){
 System.out.print(" ");
            }  for(int k=1;k<=(2*i-1);k++){
               char b=(char)a;
             System.out.print(b );
            }
 a++;
            System.out.println();
            }
            sc.close();
          }
}