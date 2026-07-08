import java.util.*;
public class Program_106 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
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
                    deleteEmployee();
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
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Department: ");
        String department = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        employees.add(new Employee(id, name, department, salary));
        System.out.println("Employee added successfully.");
    }
    static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
        } else {
            System.out.println("\nEmployee Records:");
            for (Employee e : employees) {
                e.display();
            }
        }
    }
    static void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Employee e : employees) {
            if (e.id == id) {
                e.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
    static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        boolean removed = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).id == id) {
                employees.remove(i);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
    static class Employee {
        int id;
        String name;
        String department;
        double salary;
        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
        void display() {
            System.out.println("-------------------------");
            System.out.println("Employee ID   : " + id);
            System.out.println("Name          : " + name);
            System.out.println("Department    : " + department);
            System.out.println("Salary        : " + salary);
        }
    }
}