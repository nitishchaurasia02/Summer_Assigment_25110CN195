import java.util.*;
class Program_114{
    static Scanner sc = new Scanner(System.in);
    static int[] arr = new int[100];
    static int size = 0;
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Array Operations System =====");
            System.out.println("1. Insert Element");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    delete();
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
    static void insert() {
        if (size >= arr.length) {
            System.out.println("Array is full.");
            return;
        }
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        arr[size] = element;
        size++;
        System.out.println("Element inserted successfully.");
    }
    static void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void search() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
    static void delete() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Enter element to delete: ");
        int element = sc.nextInt();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("Element deleted successfully.");
        } else {
            System.out.println("Element not found.");
        }
    }
}