import  java.util.*;
public class program44 {

        static int fact(int n)
        {
              int facto=1;
            if (n>1)
            {
             for(int i=1;i<=n;i++)
              
            facto=facto *i;
            return facto;
            }
            else 
                return 0;
        }
            public static void main(String[]args)
    {
           Scanner sc=new Scanner (System.in);
        System.out.print("Enter the numbers:");
        int n=sc.nextInt();
        System.out.print("THe factorial of the provided number is::");
        System.out.print(fact(n));
    }
}
