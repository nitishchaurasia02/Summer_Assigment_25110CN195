import java.util.*;
public class program8
{
    public static void main (String []args)
    {
      int num,dum,dig,rev=0;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter a number: ");
        num =sc.nextInt();
    dum=num;
        while(num!=0)
        {
         dig=num%10;  
         rev=rev*10;
         rev=rev+dig;
         num=num/10;
        }
    System.out.println(" Reverse of the number is :" + rev);
    if(dum==rev)
    {
        System.out.println(" The number is a palindrome");
    }
    else
    {
        System.out.println(" The number is not a palindrome");
    }
}
}

    