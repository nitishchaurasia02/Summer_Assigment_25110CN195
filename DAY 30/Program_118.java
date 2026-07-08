import java.util.*;
class Program_118 {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;
    static int[] ids = new int[MAX];
    static String[] titles = new String[MAX];
    static boolean[] isAvailable = new boolean[MAX];
    static int count = 0;
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Mini Library System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
    static void addBook() {
        if (count >= MAX) {
            System.out.println("Library storage full.");
            return;
        }
        System.out.print("Enter Book ID: ");
        ids[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        titles[count] = sc.nextLine();
        isAvailable[count] = true;
        count++;
        System.out.println("Book added successfully.");
    }
    static void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\nLibrary Catalog:");
        for (int i = 0; i < count; i++) {
            System.out.println("---------------------------------");
            System.out.println("Book ID   : " + ids[i]);
            System.out.println("Title     : " + titles[i]);
            System.out.println("Status    : " + (isAvailable[i] ? "Available" : "Issued"));
        }
    }
    static void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int id = sc.nextInt();
        int index = findBookIndex(id);
        if (index != -1) {
            System.out.println("---------------------------------");
            System.out.println("Book ID   : " + ids[index]);
            System.out.println("Title     : " + titles[index]);
            System.out.println("Status    : " + (isAvailable[index] ? "Available" : "Issued"));
        } else {
            System.out.println("Book not found.");
        }
    }
    static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();
        int index = findBookIndex(id);
        if (index != -1) {
            if (isAvailable[index]) {
                isAvailable[index] = false;
                System.out.println("Book issued successfully.");
            } else {
                System.out.println("Book is already issued.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
    static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();
        int index = findBookIndex(id);
        if (index != -1) {
            if (!isAvailable[index]) {
                isAvailable[index] = true;
                System.out.println("Book returned successfully.");
            } else {
                System.out.println("Book was not issued.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
    static int findBookIndex(int id) {
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                return i;
            }
        }
        return -1;
    }
}