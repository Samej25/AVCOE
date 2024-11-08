import java.util.Scanner;

public class SimpleTryCatch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input from the user
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();  // Try to read an integer

            System.out.println("You entered: " + num);  // Print the entered number
        } catch (Exception e) {
            // Catch any exception that occurs (e.g., invalid input)
            System.out.println("Invalid input! Please enter a valid number.");
        }

        scanner.close();
    }
}
