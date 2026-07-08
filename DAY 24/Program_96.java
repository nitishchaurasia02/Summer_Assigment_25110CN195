import java.util.*;

public class Program_96{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates :: " + result);

        sc.close();
    }
}