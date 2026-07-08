import java.util.Scanner;

public class Program_93 {
    public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        if (str1.isEmpty()) {
            return true;
        }
        String combined = str1 + str1;
        return combined.contains(str2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter original string (S1): ");
        String s1 = scanner.nextLine();
        System.out.print("Enter target string to check (S2): ");
        String s2 = scanner.nextLine();
        if (isRotation(s1, s2)) {
            System.out.println("\nResult: \"" + s2 + "\" IS a valid rotation of \"" + s1 + "\"");
        } else {
            System.out.println("\nResult: \"" + s2 + "\" IS NOT a valid rotation of \"" + s1 + "\"");
        }
        scanner.close();
    }
}