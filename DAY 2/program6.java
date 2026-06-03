
   import java.util.Scanner;
public class program6 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0, dig;
        while (num != 0) {
            dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }
    
}
