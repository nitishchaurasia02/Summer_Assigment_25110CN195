import java.util.*;

public class Program_102{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote in India.");
        } else {
            System.out.println("You are not eligible to vote in India.");
            System.out.println("You need " + (18 - age) + " more year(s) to vote.");
        }

        sc.close();
    }
}