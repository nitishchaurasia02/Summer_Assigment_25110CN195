import java.util.*;
class Program_119 {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;
    static int[] ids = new int[MAX];
    static String[] names = new String[MAX];
    static String[] departments = new String[MAX];
    static double[] salaries = new double[MAX];
    static int count = 0;
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Mini Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Department");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateDepartment();
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
    static void addEmployee() {
        if (count >= MAX) {
            System.out.println("Employee directory full.");
            return;
        }
        System.out.print("Enter Employee ID: ");
        ids[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        names[count] = sc.nextLine();
        System.out.print("Enter Department: ");
        departments[count] = sc.nextLine();
        System.out.print("Enter Salary: ");
        salaries[count] = sc.nextDouble();
        count++;
        System.out.println("Employee added successfully.");
    }
    static void displayEmployees() {
        if (count == 0) {
            System.out.println("No employee records found.");
            return;
        }
        System.out.println("\nEmployee Roster:");
        for (int i = 0; i < count; i++) {
            System.out.println("---------------------------------");
            System.out.println("ID         : " + ids[i]);
            System.out.println("Name       : " + names[i]);
            System.out.println("Department : " + departments[i]);
            System.out.println("Salary     : " + salaries[i]);
        }
    }
    static void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        int index = findEmployeeIndex(id);
        if (index != -1) {
            System.out.println("---------------------------------");
            System.out.println("ID         : " + ids[index]);
            System.out.println("Name       : " + names[index]);
            System.out.println("Department : " + departments[index]);
            System.out.println("Salary     : " + salaries[index]);
        } else {
            System.out.println("Employee not found.");
        }
    }
    static void updateDepartment() {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        int index = findEmployeeIndex(id);
        if (index != -1) {
            sc.nextLine();
            System.out.print("Enter new department: ");
            departments[index] = sc.nextLine();
            System.out.println("Department updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
    static int findEmployeeIndex(int id) {
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                return i;
            }
        }
        return -1;
    }
}