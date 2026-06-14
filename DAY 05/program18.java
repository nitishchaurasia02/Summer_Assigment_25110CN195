import java.util.*;
public class program18 {
    public static void main(String[] args)
     {
            Scanner sc = new Scanner(System.in);
            int dig,dummy,sum=0;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        dummy=num;
        while(num!=0)
            {
               int fact=1;
            dig =num%10;
            num=num/10;
            for(int i=1;i<=dig;i++)
            {
                fact=fact*i;
            
      
            }
                  sum=sum+fact;
        }
            if (sum==dummy)
            {
     System.out.println("THE PROVIDED NUMBER IS STRONG");
    }
else
     System.out.println("THE PROVIDED NUMBER IS NOT STRONG");
            }
    }


    

