// Main.java
// Name: Vedant Shitole
// PRN: 23070126143
// Batch: AIML B3

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
                while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update Student Details");
            System.out.println("7. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = Integer.parseInt(scan.nextLine());

            try {
                switch (choice) {

                        case 1:
                        System.out.print("Enter Name: ");
                        String name = scan.nextLine();
                        if (name.isEmpty()) throw new EmptyFieldException("Name cannot be empty.");

                        System.out.print("Enter PRN: ");
                        long prn = Long.parseLong(scan.nextLine());

                        System.out.print("Enter Branch: ");
                        String branch = scan.nextLine();
                        if (branch.isEmpty()) throw new EmptyFieldException("Branch cannot be empty.");

                        System.out.print("Enter Batch: ");
                        String batch = scan.nextLine();

                        System.out.print("Enter CGPA: ");
                        double cgpa = Double.parseDouble(scan.nextLine());

                        Student student = new Student(name, prn, branch, batch, cgpa);
                        operations.addStudent(student);
                        break;

                        case 2:
                        operations.displayStudents();
                        break;

                        case 3:
                        System.out.print("Enter PRN: ");
                        prn = Long.parseLong(scan.nextLine());
                        operations.searchByPRN(prn).display();
                        break;




