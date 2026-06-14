import java.util.Scanner;
public class program4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int dig, count = 0;
        while (num != 0) {
            dig = num % 10;
            count++;
            num /= 10;
        }
        System.out.println("Number of digits: " + count);
    }
}

