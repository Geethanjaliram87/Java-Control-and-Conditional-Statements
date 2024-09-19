package Control_Statements;

import java.util.Scanner;

public class RevenueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input unit price and quantity from the user
        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Calculate revenue and discount
        double revenue = unitPrice * quantity;
        double discount = 0;
        
        if (quantity >= 100 && quantity <= 120) {
            discount = revenue * 0.10;
        } else if (quantity > 120) {
            discount = revenue * 0.15;
        }

        double finalRevenue = revenue - discount;

        // Output the revenue and discount
        System.out.println("The revenue from sale: " + finalRevenue + "$");
        System.out.println("After discount: " + discount + "$ (" + ((discount / revenue) * 100) + "%)");

        scanner.close();
    }
}

