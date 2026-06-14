import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int g = sc.nextInt();

        System.out.println("Armstrong numbers up to " + g + " are:");

        for (int num = 1; num <= g; num++) {
            int temp = num;
            int c = 0, sum = 0;

          
            while (temp > 0) {
                temp = temp / 10;
                c++;
            }

            
            temp = num;
            while (temp > 0) {
                int dig = temp % 10;
                temp = temp / 10;
                sum += (int) Math.pow(dig, c);
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}