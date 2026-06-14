import java.util.*;
public class program27 {
    static int sumd(int n)
    {
        int sum=0;
        if(n==0)
            return 0;
      
        return n%10+sumd(n/10);
    }

public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number: ");
        int n = sc.nextInt();
        
        int out = sumd(n);
        System.out.print("Sum of digits:"+ out);
        
    }
        
    }

