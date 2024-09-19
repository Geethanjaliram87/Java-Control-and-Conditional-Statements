package Control_Statements;

import java.util.Scanner;

public class KeyPressDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input key from the user
        System.out.print("Press a key: ");
        char key = scanner.next().charAt(0);

        // Detect key press
        if (key >= '0' && key <= '9') {
            System.out.println("You pressed number: " + key);
        } else {
            System.out.println("Not allowed");
        }

        scanner.close();
    }
}
