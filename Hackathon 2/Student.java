package Hackathon2;

import java.util.Scanner;

public class Student {
     private String studentName;
    private int rollNumber;
    private double marks;
    private String courseName;
    private int courseCredits;

    public Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

     public double calculateFee() {
        return courseCredits * 1500.0;
    }

    public boolean checkEligibility() {
        return marks >= 50.0;
    }

    public double calculateScholarship() {
        double fee = calculateFee();
        if (marks >= 85.0) {
            return 0.20 * fee;
        } else if (marks >= 70.0 && marks <= 84.0) {
            return 0.10 * fee;
        } else {
            return 0.0;
        }
    }

    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    public void displayDetails() {
        System.out.println("\n-------------------------------------------");
        System.out.println("       STUDENT REGISTRATION SUMMARY        ");
        System.out.println("-------------------------------------------");
        System.out.println("Student Name       : " + studentName);
        System.out.println("Roll Number        : " + rollNumber);
        System.out.println("Marks Scored       : " + marks);
        System.out.println("Course Name        : " + courseName);
        System.out.println("Course Credits     : " + courseCredits);
        System.out.println("Eligibility Status : " + (checkEligibility() ? "Eligible" : "Not Eligible"));
        System.out.println("Base Course Fee    : Rs. " + String.format("%.2f", calculateFee()));
        System.out.println("Scholarship Amount : Rs. " + String.format("%.2f", calculateScholarship()));
        System.out.println("Final Fee Payable  : Rs. " + String.format("%.2f", calculateFinalFee()));
        System.out.println("-------------------------------------------");
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = scanner.nextInt();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine(); // Clear newline buffer

        System.out.print("Enter Course Name: ");
        String course = scanner.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = scanner.nextInt();

        Student student = new Student(name, roll, marks, course, credits);

        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nRegistration Failed: Student is not eligible for course registration (Requires at least 50 marks).");
        }

        scanner.close();
    }
}