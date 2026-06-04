import java.util.*;

public class program20 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = sc.nextInt();  
        
        int max = -1;

        // 1. Check and divide out all 2s first (since 2 is the only even prime)
        while (n % 2 == 0) {
            max = 2;
            n = n / 2;
        }

        // 2. Look for odd factors using your exact loop style
        for (int i = 3; i * i <= n; i = i + 2) {
            while (n % i == 0) {
                max = i;
                n = n / i; // Keep dividing to break it down
            }
        }

        // 3. If anything is left over, that remaining number is the largest prime
        if (n > 2) {
            max = n;
        }

        System.out.println("The largest prime factor is: " + max);
        
     
    }
}