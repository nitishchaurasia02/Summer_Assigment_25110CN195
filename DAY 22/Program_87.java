import java.util.*;
public class Program_87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        System.out.println("\nCharacter Frequencies:");
        while (s.length() > 0) {
            char ch = s.charAt(0);
            int originalLength = s.length();
            s = s.replace(String.valueOf(ch), "");
            int newLength = s.length();
            int frequency = originalLength - newLength;
            System.out.println("Frequency of '" + ch + "' is " + frequency);
        }
        sc.close();
    }
}