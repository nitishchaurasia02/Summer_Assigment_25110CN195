import java.util.*;
public class program5
{
    public static void main (String []args){
        int dig,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while(num!=0){
            dig =num%10;
            sum =sum+dig;
            num=num/10;
    }
System.out.println("Sum of digits: " + sum);
    }
}
