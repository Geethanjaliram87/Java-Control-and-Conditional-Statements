package Control_Statements;

import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question prompt
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println("a. int 1x=10;");
        System.out.println("b. int x=10;");
        System.out.println("c. int x;");
        System.out.println("d. float x=10.0f;");
        System.out.println("e. int x, y, z=5;");
        System.out.println("f. String x=\"10\";");
        
        // Input user choice
        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);

        // Output result based on user's choice
        switch (choice) {
        case 'b':
        case 'c':
        case 'e':
            System.out.println("Correct!");
            break;
        default:
            System.out.println("Incorrect.");
            break;
    }

        scanner.close();
    }
}
