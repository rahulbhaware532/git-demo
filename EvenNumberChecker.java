import java.util.Scanner;

public class EvenNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even
        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }

    // Method to check if a number is even
    private static boolean isEven(int number) {
        // A number is even if it is divisible by 2 with no remainder
        return number % 2 == 0;
    }
}
