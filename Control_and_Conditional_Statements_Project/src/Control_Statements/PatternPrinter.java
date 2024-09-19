package Control_Statements;

public class PatternPrinter {
    public static void main(String[] args) {
        // Loop through rows
        for (int i = 1; i <= 7; i++) {
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print stars
            for (int k = 7; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
