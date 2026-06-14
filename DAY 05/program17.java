import java.util.*;
public class program17
{
       public static void main(String []args)
       {
        int sum=0;
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        for(int i=1; i<num;i++)
        {
            if (num%i==0)
            {
                System.out.println(i);
                sum=sum+i;
        }
    }
        if (sum==num)
        
            System.out.println("Perfect number");
            else 
                System.out.print("Not a perfect number");
        
       }

}