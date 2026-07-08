import java.util.*;
public class Program_109 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> library = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
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
                    deleteBook();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();
        library.add(new Book(id, title, author, price));
        System.out.println("Book added successfully.");
    }
    static void displayBooks() {
        if (library.isEmpty()) {
            System.out.println("No books found in the library.");
        } else {
            System.out.println("\nLibrary Book Records:");
            for (Book b : library) {
                b.display();
            }
        }
    }
    static void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Book b : library) {
            if (b.id == id) {
                b.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }
    static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = sc.nextInt();
        boolean removed = false;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).id == id) {
                library.remove(i);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
    static class Book {
        int id;
        String title;
        String author;
        double price;
        Book(int id, String title, String author, double price) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.price = price;
        }
        void display() {
            System.out.println("---------------------------------");
            System.out.println("Book ID      : " + id);
            System.out.println("Title        : " + title);
            System.out.println("Author       : " + author);
            System.out.println("Price        : " + price);
        }
    }
}