import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > large) {
                large = number;
            }
            if (number < small) {
                small = number;
            }

            sum += number;
            count++;

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number: " + large);
            System.out.println("Smallest number: " + small);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}