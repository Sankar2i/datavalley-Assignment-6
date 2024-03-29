import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 7 == 0 && number % 13 == 0) {
            int quotient_7 = number / 7;
            int remainder_7 = number % 7;

            int quotient_13 = number / 13;
            int remainder_13 = number % 13;

            System.out.println(number + " is divisible by both 7 and 13.");
            System.out.println("Quotient when divided by 7: " + quotient_7);
            System.out.println("Remainder when divided by 7: " + remainder_7);
            System.out.println("Quotient when divided by 13: " + quotient_13);
            System.out.println("Remainder when divided by 13: " + remainder_13);
        } else {
            System.out.println(number + " is not divisible by both 7 and 13 simultaneously.");
        }

        scanner.close();
    }
}
