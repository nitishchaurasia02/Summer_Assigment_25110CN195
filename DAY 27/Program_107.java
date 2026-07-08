import java.util.*;
public class Program_107 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Employee Salary");
            System.out.println("2. Display Salary Records");
            System.out.println("3. Search Employee Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addSalary();
                    break;
                case 2:
                    displaySalary();
                    break;
                case 3:
                    searchSalary();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }
    static void addSalary() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();
        System.out.print("Enter Deduction: ");
        double deduction = sc.nextDouble();
        double netSalary = basic + allowance - deduction;
        employees.add(new Employee(id, name, basic, allowance, deduction, netSalary));
        System.out.println("Salary record added successfully.");
    }
    static void displaySalary() {
        if (employees.isEmpty()) {
            System.out.println("No salary records found.");
        } else {
            System.out.println("\nSalary Records:");
            for (Employee e : employees) {
                e.display();
            }
        }
    }
    static void searchSalary() {
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
    static class Employee {
        int id;
        String name;
        double basic;
        double allowance;
        double deduction;
        double netSalary;
        Employee(int id, String name, double basic, double allowance, double deduction, double netSalary) {
            this.id = id;
            this.name = name;
            this.basic = basic;
            this.allowance = allowance;
            this.deduction = deduction;
            this.netSalary = netSalary;
        }
        void display() {
            System.out.println("-------------------------");
            System.out.println("Employee ID   : " + id);
            System.out.println("Name          : " + name);
            System.out.println("Basic Salary  : " + basic);
            System.out.println("Allowance     : " + allowance);
            System.out.println("Deduction     : " + deduction);
            System.out.println("Net Salary    : " + netSalary);
        }
    }
}