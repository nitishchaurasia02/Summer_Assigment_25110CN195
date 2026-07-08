import java.util.*;

public class Program_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        HashSet<Character> set = new HashSet<>();
        char firstRepeating = '\0';

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                firstRepeating = ch;
                break;
            }
            set.add(ch);
        }

        if (firstRepeating != '\0')
            System.out.println("First repeating character :: " + firstRepeating);
        else
            System.out.println("No repeating characters found.");

        sc.close();
    }
}