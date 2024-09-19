package Control_Statements;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input scores from the user
        System.out.print("Enter Quiz score: ");
        double quiz = scanner.nextDouble();
        
        System.out.print("Enter Mid-term score: ");
        double midTerm = scanner.nextDouble();
        
        System.out.print("Enter Final score: ");
        double finalScore = scanner.nextDouble();

        // Calculate average score
        double average = (quiz + midTerm + finalScore) / 3;

        // Determine the grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Output the grade
        System.out.println("Your grade is " + grade);

        scanner.close();
    }
}
