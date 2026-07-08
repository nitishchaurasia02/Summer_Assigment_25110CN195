import java.util.*;

public class Program_89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        int[] charCounts = new int[256];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i)]++;
        }

        char firstUnique = '\0';
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i)] == 1) {
                firstUnique = s.charAt(i);
                break; // Stop at the very first one we find
            }
        }
        System.out.println("\n---------------------------------");
        if (firstUnique != '\0') {
            System.out.println("First non-repeating character is: '" + firstUnique + "'");
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }

        sc.close();
    }
}