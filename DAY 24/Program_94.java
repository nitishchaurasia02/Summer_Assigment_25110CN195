import java.util.*;

public class Program_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        String compressed = "";
        int count = 1;

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                compressed += s.charAt(i);
                compressed += count;
                count = 1;
            }
        }

        System.out.println("Compressed String: " + compressed);

        sc.close();
    }
}