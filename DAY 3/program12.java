import java.util.*;
public class program12
{
    public static void main (String []args)
    {
         int n1,n2,i,j,lcm=1;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            n1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            n2 = sc.nextInt();
            for ( i=1;i<=n1 && i<=n2;i++)
            {
                if (n1%i==0 && n2%i==0)
                {
                   lcm=(n1*n2)/i;
                    System.out.println("The LCM of " + n1 + " and " + n2 + " is: " + lcm);  
                }     
                }
            }

    }
