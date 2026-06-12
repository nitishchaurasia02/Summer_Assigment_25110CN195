import java.util.*;

public class program47 {
    static int fibo(int n)
    {
      
        if (n == 0) {
            return 0;
        }
     
        else if (n == 1) {
            return 1;
        }
        
        else {
            return fibo(n-1 ) + fibo(n - 2);
        }
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a position number: ");
        int n = sc.nextInt();
        
        int out = fibo(n);
        System.out.print("Fibonacci number at position " + n + " is: " + out);
        
    
    }
}