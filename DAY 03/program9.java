import java.util.*;
public class program9
{
    public static void main(String[]args)
    {
        int count=0,num;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                    count++;
            }
                    if(count==2)
                        System.out.println(num + " is a prime number.");
                    else
                        System.out.println(num + " is not a prime number.");
                }
            }
    
