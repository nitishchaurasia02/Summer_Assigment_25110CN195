import java.util.*;
public class Program_108 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Marksheet> marksheets = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Marksheet Generation System =====");
            System.out.println("1. Generate Marksheet");
            System.out.println("2. Display All Marksheets");
            System.out.println("3. Search Marksheet");
            System.out.println("4. Delete Marksheet");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    generateMarksheet();
                    break;
                case 2:
                    displayMarksheets();
                    break;
                case 3:
                    searchMarksheet();
                    break;
                case 4:
                    deleteMarksheet();
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
    static void generateMarksheet() {
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Physics Marks: ");
        double physics = sc.nextDouble();
        System.out.print("Enter Chemistry Marks: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter Mathematics Marks: ");
        double math = sc.nextDouble();
        marksheets.add(new Marksheet(rollNo, name, physics, chemistry, math));
        System.out.println("Marksheet generated successfully.");
    }
    static void displayMarksheets() {
        if (marksheets.isEmpty()) {
            System.out.println("No marksheets found.");
        } else {
            System.out.println("\nAll Student Marksheets:");
            for (Marksheet m : marksheets) {
                m.display();
            }
        }
    }
    static void searchMarksheet() {
        System.out.print("Enter Roll Number to search: ");
        int rollNo = sc.nextInt();
        boolean found = false;
        for (Marksheet m : marksheets) {
            if (m.rollNo == rollNo) {
                m.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Marksheet not found.");
        }
    }
    static void deleteMarksheet() {
        System.out.print("Enter Roll Number to delete: ");
        int rollNo = sc.nextInt();
        boolean removed = false;
        for (int i = 0; i < marksheets.size(); i++) {
            if (marksheets.get(i).rollNo == rollNo) {
                marksheets.remove(i);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Marksheet deleted successfully.");
        } else {
            System.out.println("Marksheet not found.");
        }
    }
    static class Marksheet {
        int rollNo;
        String name;
        double physics;
        double chemistry;
        double math;
        double total;
        double percentage;
        String grade;
        Marksheet(int rollNo, String name, double physics, double chemistry, double math) {
            this.rollNo = rollNo;
            this.name = name;
            this.physics = physics;
            this.chemistry = chemistry;
            this.math = math;
            this.total = physics + chemistry + math;
            this.percentage = total / 3.0;
            if (percentage >= 90) grade = "A+";
            else if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B";
            else if (percentage >= 60) grade = "C";
            else if (percentage >= 50) grade = "D";
            else grade = "Fail";
        }
        void display() {
            System.out.println("---------------------------------");
            System.out.println("Roll Number  : " + rollNo);
            System.out.println("Student Name : " + name);
            System.out.println("Physics      : " + physics);
            System.out.println("Chemistry    : " + chemistry);
            System.out.println("Mathematics  : " + math);
            System.out.println("Total Marks  : " + total);
            System.out.printf("Percentage   : %.2f%%\n", percentage);
            System.out.println("Grade        : " + grade);
        }
    }
}