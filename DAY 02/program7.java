import java.util.Scanner;
public class program7
{
    public static void main (String []args)
    {
        int dig, product=1;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        while(num!=0)
        {
         dig = num%10;
         product=product*dig;
        num=num/10;
        }
    
    System.out.println(" Product of the digits are :" + product);
}
}