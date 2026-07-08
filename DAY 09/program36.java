import java.util.*;
public class program36 {
    public static void main (String[]args )
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the limits:");
        int l=sc.nextInt();
        for(int i=1;i<=l;i++)
        {
            for (int j = 1; j <= l; j++)
            {
                if (i == l || j == l || i == 1 || j == 1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        }
     } 
    



                