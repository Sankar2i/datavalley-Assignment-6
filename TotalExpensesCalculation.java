import java.util.Scanner;

public class TotalExpensesCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerOne = scanner.nextDouble();

        double totalExpenses = quantity * pricePerOne;

        if (quantity > 50) {
            totalExpenses *= 0.9; 
        } else if (quantity >= 25) {
            totalExpenses *= 0.95; 
        }

        System.out.println("Total expenses: Rs. " + totalExpenses);

        scanner.close();
    }
}