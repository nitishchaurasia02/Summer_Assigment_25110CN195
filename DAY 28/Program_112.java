import java.util.*;
class Program_112{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contact> phonebook = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    deleteContact();
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
    static void addContact() {
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();
        phonebook.add(new Contact(name, phone, email));
        System.out.println("Contact saved successfully.");
    }
    static void displayContacts() {
        if (phonebook.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("\nContact List:");
            for (Contact c : phonebook) {
                c.display();
            }
        }
    }
    static void searchContact() {
        sc.nextLine();
        System.out.print("Enter Name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Contact c : phonebook) {
            if (c.name.equalsIgnoreCase(name)) {
                c.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }
    static void deleteContact() {
        sc.nextLine();
        System.out.print("Enter Name to delete: ");
        String name = sc.nextLine();
        boolean removed = false;
        for (int i = 0; i < phonebook.size(); i++) {
            if (phonebook.get(i).name.equalsIgnoreCase(name)) {
                phonebook.remove(i);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
    static class Contact {
        String name;
        String phone;
        String email;
        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
        void display() {
            System.out.println("---------------------------------");
            System.out.println("Name   : " + name);
            System.out.println("Phone  : " + phone);
            System.out.println("Email  : " + email);
        }
    }
}