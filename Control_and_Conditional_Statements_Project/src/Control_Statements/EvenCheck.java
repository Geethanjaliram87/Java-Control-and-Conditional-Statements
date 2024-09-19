package Control_Statements;

import java.util.Scanner;

public class EvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }
}

