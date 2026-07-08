import java.util.*;
class Program_115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== String Operations System =====");
            System.out.println("1. Reverse a String");
            System.out.println("2. Check Palindrome");
            System.out.println("3. Count Vowels and Consonants");
            System.out.println("4. Convert Case (Upper/Lower)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter a string: ");
                String s = sc.nextLine();
                switch (choice) {
                    case 1:
                        String rev = "";
                        for (int i = s.length() - 1; i >= 0; i--) {
                            rev += s.charAt(i);
                        }
                        System.out.println("Reversed String: " + rev);
                        break;
                    case 2:
                        String check = "";
                        for (int i = s.length() - 1; i >= 0; i--) {
                            check += s.charAt(i);
                        }
                        if (s.equalsIgnoreCase(check)) {
                            System.out.println("The string is a palindrome.");
                        } else {
                            System.out.println("The string is not a palindrome.");
                        }
                        break;
                    case 3:
                        int vowels = 0, consonants = 0;
                        String temp = s.toLowerCase();
                        for (int i = 0; i < temp.length(); i++) {
                            char ch = temp.charAt(i);
                            if (ch >= 'a' && ch <= 'z') {
                                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                    vowels++;
                                } else {
                                    consonants++;
                                }
                            }
                        }
                        System.out.println("Vowels: " + vowels);
                        System.out.println("Consonants: " + consonants);
                        break;
                    case 4:
                        System.out.println("Uppercase: " + s.toUpperCase());
                        System.out.println("Lowercase: " + s.toLowerCase());
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}