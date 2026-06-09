import java.util.*;
public class program43 {

        static int prime(int n)
        {
            int c=0; 
           for(int i=1;i<=n;i++)

         
  {
    if(n%i==0)
        c++;
}           
if (c==2)
{
return n;
}
else
           {
           return 0;
           }

        }
        public static void main (String [] args)
    {
          Scanner sc=new Scanner (System.in);
        System.out.print("Enter the numbers:");
        int n=sc.nextInt();
        int result=prime (n);
        if (result!=0)
        System.out.print(n+":ENTERED NUMBER IS PRIME") ;
else
     System.out.print(n+":ENTERED NUMBER IS NOT PRIME") ;
}

    }

