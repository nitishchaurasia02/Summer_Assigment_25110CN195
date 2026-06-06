import java.util.*;

public class program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
    
        int result = Integer.bitCount(n);
        
        System.out.println("Number of set bits (1s): " + result);
    }
    }