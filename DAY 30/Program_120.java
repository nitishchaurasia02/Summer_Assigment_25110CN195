import java.util.*;
class Main {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;
    static int[] patientId = new int[MAX];
    static String[] patientName = new String[MAX];
    static int[] patientAge = new int[MAX];
    static String[] patientGender = new String[MAX];
    static String[] disease = new String[MAX];
    static String[] roomType = new String[MAX];
    static int[] assignedDoctorId = new int[MAX];
    static double[] doctorFees = new double[MAX];
    static double[] roomCharges = new double[MAX];
    static double[] labCharges = new double[MAX];
    static double[] medicineCharges = new double[MAX];
    static double[] totalBill = new double[MAX];
    static boolean[] isPaid = new boolean[MAX];
    static int patientCount = 0;
    static int[] doctorId = {101, 102, 103, 104, 105};
    static String[] doctorName = {"Dr. A.K. Sharma", "Dr. S. Verma", "Dr. P. Reddy", "Dr. N. Mishra", "Dr. R. Joshi"};
    static String[] specialization = {"Cardiologist", "Pediatrician", "Neurologist", "Orthopedic", "General Physician"};
    static int[] logPatientId = new int[500];
    static String[] logMessage = new String[500];
    static int logCount = 0;
    public static void main(String[] args) {
        insertSampleData();
        addLog(0, "System started successfully");
        int choice;
        do {
            System.out.println("\n========================================");
            System.out.println("       HOSPITAL MANAGEMENT SYSTEM       ");
            System.out.println("========================================");
            System.out.println("1. Patient Registration & Records");
            System.out.println("2. Doctor Information & Duty Roster");
            System.out.println("3. Diagnostic Lab Test Center");
            System.out.println("4. Pharmacy & Medicine Store");
            System.out.println("5. Billing & Payment Counter");
            System.out.println("6. System Operations & History Logs");
            System.out.println("7. Exit Program");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    patientModule();
                    break;
                case 2:
                    doctorModule();
                    break;
                case 3:
                    labModule();
                    break;
                case 4:
                    pharmacyModule();
                    break;
                case 5:
                    billingModule();
                    break;
                case 6:
                    displayLogs();
                    break;
                case 7:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);
        sc.close();
    }
    static void insertSampleData() {
        patientId[0] = 1001; patientName[0] = "Ramesh Kumar"; patientAge[0] = 45; patientGender[0] = "Male"; disease[0] = "Heart Attack"; roomType[0] = "ICU"; assignedDoctorId[0] = 101; doctorFees[0] = 1000; roomCharges[0] = 5000; labCharges[0] = 1500; medicineCharges[0] = 800; totalBill[0] = 8300; isPaid[0] = false;
        patientId[1] = 1002; patientName[1] = "Suman Lata"; patientAge[1] = 28; patientGender[1] = "Female"; disease[1] = "Viral Fever"; roomType[1] = "General"; assignedDoctorId[1] = 105; doctorFees[1] = 300; roomCharges[1] = 1000; labCharges[1] = 500; medicineCharges[1] = 400; totalBill[1] = 2200; isPaid[1] = true;
        patientId[2] = 1003; patientName[2] = "Amit Singh"; patientAge[2] = 12; patientGender[2] = "Male"; disease[2] = "Fracture"; roomType[2] = "Private"; assignedDoctorId[2] = 104; doctorFees[2] = 600; roomCharges[2] = 2500; labCharges[2] = 1200; medicineCharges[2] = 600; totalBill[2] = 4900; isPaid[2] = false;
        patientCount = 3;
    }
    static void addLog(int id, String msg) {
        if (logCount < 500) {
            logPatientId[logCount] = id;
            logMessage[logCount] = msg;
            logCount++;
        }
    }
    static void patientModule() {
        int choice;
        do {
            System.out.println("\n--- PATIENT MANAGEMENT MODULE ---");
            System.out.println("1. Add New Patient Admission");
            System.out.println("2. View All Admitted Patients");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. Update Patient Details");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    viewPatients();
                    break;
                case 3:
                    searchPatient();
                    break;
                case 4:
                    updatePatient();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);
    }
    static void addPatient() {
        if (patientCount >= MAX) {
            System.out.println("Hospital database is full. Cannot accept more patients.");
            return;
        }
        System.out.print("Enter 4-digit Patient ID: ");
        int id = sc.nextInt();
        if (findPatientIndex(id) != -1) {
            System.out.println("Error: This Patient ID already exists.");
            return;
        }
        patientId[patientCount] = id;
        sc.nextLine();
        System.out.print("Enter Patient Full Name: ");
        patientName[patientCount] = sc.nextLine();
        System.out.print("Enter Patient Age: ");
        patientAge[patientCount] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender (Male/Female/Other): ");
        patientGender[patientCount] = sc.nextLine();
        System.out.print("Enter Disease/Symptoms: ");
        disease[patientCount] = sc.nextLine();
        System.out.print("Enter Room Type (ICU/Private/General): ");
        roomType[patientCount] = sc.nextLine();
        System.out.println("\nSelect an Available Doctor to Assign:");
        for (int i = 0; i < doctorId.length; i++) {
            System.out.println(doctorId[i] + ". " + doctorName[i] + " (" + specialization[i] + ")");
        }
        System.out.print("Enter Doctor ID: ");
        int docChoice = sc.nextInt();
        assignedDoctorId[patientCount] = docChoice;
        if (docChoice == 101) doctorFees[patientCount] = 1000;
        else if (docChoice == 102) doctorFees[patientCount] = 500;
        else if (docChoice == 103) doctorFees[patientCount] = 800;
        else if (docChoice == 104) doctorFees[patientCount] = 600;
        else doctorFees[patientCount] = 300;
        if (roomType[patientCount].equalsIgnoreCase("ICU")) roomCharges[patientCount] = 5000;
        else if (roomType[patientCount].equalsIgnoreCase("Private")) roomCharges[patientCount] = 2500;
        else roomCharges[patientCount] = 1000;
        labCharges[patientCount] = 0;
        medicineCharges[patientCount] = 0;
        totalBill[patientCount] = doctorFees[patientCount] + roomCharges[patientCount];
        isPaid[patientCount] = false;
        addLog(id, "Registered new patient: " + patientName[patientCount]);
        patientCount++;
        System.out.println("Patient record saved successfully.");
    }
    static void viewPatients() {
        if (patientCount == 0) {
            System.out.println("No patient records available.");
            return;
        }
        System.out.println("\n----------------------------------------------------------------------------------");
        System.out.printf("%-6s %-16s %-5s %-8s %-15s %-10s %-8s\n", "ID", "Name", "Age", "Gender", "Disease", "Room", "Doc ID");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < patientCount; i++) {
            System.out.printf("%-6d %-16s %-5d %-8s %-15s %-10s %-8d\n", patientId[i], patientName[i], patientAge[i], patientGender[i], disease[i], roomType[i], assignedDoctorId[i]);
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
    static void searchPatient() {
        System.out.print("Enter Patient ID to search: ");
        int id = sc.nextInt();
        int idx = findPatientIndex(id);
        if (idx != -1) {
            displayPatientProfile(idx);
        } else {
            System.out.println("Patient not found in the records.");
        }
    }
    static void updatePatient() {
        System.out.print("Enter Patient ID to update details: ");
        int id = sc.nextInt();
        int idx = findPatientIndex(id);
        if (idx != -1) {
            sc.nextLine();
            System.out.print("Enter Updated Disease/Condition: ");
            disease[idx] = sc.nextLine();
            System.out.print("Enter Updated Room Type (ICU/Private/General): ");
            roomType[idx] = sc.nextLine();
            if (roomType[idx].equalsIgnoreCase("ICU")) roomCharges[idx] = 5000;
            else if (roomType[idx].equalsIgnoreCase("Private")) roomCharges[idx] = 2500;
            else roomCharges[idx] = 1000;
            totalBill[idx] = doctorFees[idx] + roomCharges[idx] + labCharges[idx] + medicineCharges[idx];
            addLog(id, "Updated disease status and room type");
            System.out.println("Patient details have been modified.");
        } else {
            System.out.println("Patient not found.");
        }
    }
    static void doctorModule() {
        System.out.println("\n--- DOCTOR INFORMATION & SPECIALIZATIONS ---");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-18s %-10s\n", "Doctor ID", "Doctor Name", "Specialization", "OPD Fee");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < doctorId.length; i++) {
            double fee = 300;
            if (doctorId[i] == 101) fee = 1000;
            else if (doctorId[i] == 102) fee = 500;
            else if (doctorId[i] == 103) fee = 800;
            else if (doctorId[i] == 104) fee = 600;
            System.out.printf("%-10d %-20s %-18s INR %.0f\n", doctorId[i], doctorName[i], specialization[i], fee);
        }
        System.out.println("------------------------------------------------------------");
    }
    static void labModule() {
        System.out.println("\n--- DIAGNOSTIC LAB TEST CENTER ---");
        System.out.println("1. Blood Test (Complete Hemogram) - INR 400");
        System.out.println("2. X-Ray Chest - INR 800");
        System.out.println("3. Ultrasound Scanning - INR 1500");
        System.out.println("4. MRI Scan - INR 4500");
        System.out.print("Select test number to add to patient: ");
        int testType = sc.nextInt();
        System.out.print("Enter Patient ID: ");
        int pId = sc.nextInt();
        int idx = findPatientIndex(pId);
        if (idx == -1) {
            System.out.println("Patient not found.");
            return;
        }
        double price = 0;
        String testName = "";
        switch (testType) {
            case 1:
                price = 400;
                testName = "Blood Test";
                break;
            case 2:
                price = 800;
                testName = "X-Ray";
                break;
            case 3:
                price = 1500;
                testName = "Ultrasound";
                break;
            case 4:
                price = 4500;
                testName = "MRI Scan";
                break;
            default:
                System.out.println("Invalid test choice.");
                return;
        }
        labCharges[idx] += price;
        totalBill[idx] = doctorFees[idx] + roomCharges[idx] + labCharges[idx] + medicineCharges[idx];
        addLog(pId, "Added lab test charge: " + testName);
        System.out.println(testName + " bill of INR " + price + " added to Patient ID: " + pId);
    }
    static void pharmacyModule() {
        System.out.println("\n--- PHARMACY & MEDICINE STORE ---");
        System.out.println("1. Antibiotics Course Pack - INR 350");
        System.out.println("2. Painkillers & Anti-inflammatory Pack - INR 150");
        System.out.println("3. Multivitamins and Tonic Bottle - INR 250");
        System.out.println("4. Diabetic Insulin Dose Injections - INR 1100");
        System.out.print("Select medicine option to purchase: ");
        int medType = sc.nextInt();
        System.out.print("Enter Patient ID: ");
        int pId = sc.nextInt();
        int idx = findPatientIndex(pId);
        if (idx == -1) {
            System.out.println("Patient not found.");
            return;
        }
        double price = 0;
        String medName = "";
        switch (medType) {
            case 1:
                price = 350;
                medName = "Antibiotics Pack";
                break;
            case 2:
                price = 150;
                medName = "Painkillers";
                break;
            case 3:
                price = 250;
                medName = "Multivitamins";
                break;
            case 4:
                price = 1100;
                medName = "Insulin Dose";
                break;
            default:
                System.out.println("Invalid medicine choice.");
                return;
        }
        medicineCharges[idx] += price;
        totalBill[idx] = doctorFees[idx] + roomCharges[idx] + labCharges[idx] + medicineCharges[idx];
        addLog(pId, "Added medicine pharmacy fee: " + medName);
        System.out.println(medName + " charge of INR " + price + " added to Patient ID: " + pId);
    }
    static void billingModule() {
        int choice;
        do {
            System.out.println("\n--- BILLING & PAYMENT COUNTER ---");
            System.out.println("1. Generate Patient Invoice & Receipt");
            System.out.println("2. Settle Account Bills (Accept Cash/Card)");
            System.out.println("3. Hospital Management Revenue Report");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    printInvoice();
                    break;
                case 2:
                    payBill();
                    break;
                case 3:
                    revenueReport();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid input code.");
            }
        } while (choice != 4);
    }
    static void printInvoice() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        int idx = findPatientIndex(id);
        if (idx != -1) {
            System.out.println("\n==================================================");
            System.out.println("          OFFICIAL HOSPITAL MEDICAL BILL          ");
            System.out.println("==================================================");
            System.out.println("Patient ID       : " + patientId[idx]);
            System.out.println("Patient Name     : " + patientName[idx]);
            System.out.println("Age / Gender     : " + patientAge[idx] + " / " + patientGender[idx]);
            System.out.println("Diagnosis        : " + disease[idx]);
            System.out.println("Room Stay Type   : " + roomType[idx]);
            System.out.println("--------------------------------------------------");
            System.out.printf("1. Doctor Consultation Fees   : INR %.2f\n", doctorFees[idx]);
            System.out.printf("2. Room Rent / Ward Charges   : INR %.2f\n", roomCharges[idx]);
            System.out.printf("3. Pathology / Lab Test Fees  : INR %.2f\n", labCharges[idx]);
            System.out.printf("4. Pharmacy / Medicine Cost   : INR %.2f\n", medicineCharges[idx]);
            System.out.println("--------------------------------------------------");
            System.out.printf("GRAND TOTAL BILL AMOUNT       : INR %.2f\n", totalBill[idx]);
            System.out.println("Payment Status                : " + (isPaid[idx] ? "PAID / CLEARED" : "DUE / PENDING"));
            System.out.println("==================================================");
        } else {
            System.out.println("Patient record not found.");
        }
    }
    static void payBill() {
        System.out.print("Enter Patient ID to settle bills: ");
        int id = sc.nextInt();
        int idx = findPatientIndex(id);
        if (idx != -1) {
            if (isPaid[idx]) {
                System.out.println("This bill has already been fully paid.");
                return;
            }
            System.out.printf("Total Amount Owed: INR %.2f\n", totalBill[idx]);
            System.out.print("Enter amount paid by user: ");
            double moneyRec = sc.nextDouble();
            if (moneyRec >= totalBill[idx]) {
                double change = moneyRec - totalBill[idx];
                isPaid[idx] = true;
                addLog(id, "Bill settled. Change returned: " + change);
                System.out.printf("Payment successful! Return change amount: INR %.2f\n", change);
            } else {
                System.out.println("Payment rejected! Provided cash amount is less than total bill.");
            }
        } else {
            System.out.println("Patient not found.");
        }
    }
    static void revenueReport() {
        double collected = 0;
        double pending = 0;
        for (int i = 0; i < patientCount; i++) {
            if (isPaid[i]) collected += totalBill[i];
            else pending += totalBill[i];
        }
        System.out.println("\n==================================================");
        System.out.println("          HOSPITAL FINANCIAL BALANCE SHEET        ");
        System.out.println("==================================================");
        System.out.println("Total Registered Admitted Patients  : " + patientCount);
        System.out.printf("Total Cash Revenue Collected       : INR %.2f\n", collected);
        System.out.printf("Total Pending/Due Credit Amount    : INR %.2f\n", pending);
        System.out.printf("Total Net Worth of Transactions    : INR %.2f\n", (collected + pending));
        System.out.println("==================================================");
    }
    static void displayLogs() {
        System.out.println("\n========================================================================");
        System.out.println("                     SYSTEM TELEMETRY AUDIT LOG HISTORY                 ");
        System.out.println("========================================================================");
        if (logCount == 0) {
            System.out.println("No actions tracked yet inside log index tables.");
            return;
        }
        for (int i = 0; i < logCount; i++) {
            System.out.println("Log Record #" + (i + 1) + " | Patient Context ID: " + logPatientId[i] + " | Operation Note: " + logMessage[i]);
        }
        System.out.println("========================================================================");
    }
    static int findPatientIndex(int id) {
        for (int i = 0; i < patientCount; i++) {
            if (patientId[i] == id) {
                return i;
            }
        }
        return -1;
    }
    static void displayPatientProfile(int idx) {
        System.out.println("\n---------------------------------");
        System.out.println("        PATIENT SHEET FILE       ");
        System.out.println("---------------------------------");
        System.out.println("ID Number      : " + patientId[idx]);
        System.out.println("Full Name      : " + patientName[idx]);
        System.out.println("Age Bracket    : " + patientAge[idx]);
        System.out.println("Gender Sex     : " + patientGender[idx]);
        System.out.println("Disease Track  : " + disease[idx]);
        System.out.println("Room Allotted  : " + roomType[idx]);
        System.out.println("Doctor ID Ref  : " + assignedDoctorId[idx]);
        System.out.printf("Total Expenses : INR %.2f\n", totalBill[idx]);
        System.out.println("Billing Status : " + (isPaid[idx] ? "Cleared" : "Pending"));
        System.out.println("---------------------------------");
    }
}