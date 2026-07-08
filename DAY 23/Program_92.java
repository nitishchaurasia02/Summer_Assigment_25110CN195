import java.util.*;
public class Program_92 {
    public static void main(String[] args) {
        int f = 0;
        char max=' ';
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

            if (frequency > f) {
                f = frequency;
                max = ch;
            }
        }

                System.out.println(" Most  repeating character is ::" + max);
                System.out.println("With Frequency:::" + f);

            }
        }
