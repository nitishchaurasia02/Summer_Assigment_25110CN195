import java.util.*;
class Program_117{
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;
    static int[] ids = new int[MAX];
    static String[] names = new String[MAX];
    static double[] marks = new double[MAX];
    static int count = 0;
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
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
    static void addStudent() {
        if (count >= MAX) {
            System.out.println("System storage is full.");
            return;
        }
        System.out.print("Enter Student ID: ");
        ids[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        names[count] = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();
        count++;
        System.out.println("Student record added successfully.");
    }
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\nStudent Records:");
        for (int i = 0; i < count; i++) {
            System.out.println("---------------------------------");
            System.out.println("ID    : " + ids[i]);
            System.out.println("Name  : " + names[i]);
            System.out.println("Marks : " + marks[i]);
        }
    }
    static void searchStudent() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("---------------------------------");
            System.out.println("ID    : " + ids[index]);
            System.out.println("Name  : " + names[index]);
            System.out.println("Marks : " + marks[index]);
        } else {
            System.out.println("Student not found.");
        }
    }
    static void deleteStudent() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                ids[i] = ids[i + 1];
                names[i] = names[i + 1];
                marks[i] = marks[i + 1];
            }
            count--;
            System.out.println("Student record deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}