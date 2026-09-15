import java.util.Scanner;

public class UserInputSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the first number
        System.out.print("Enter the first number (minuend): ");
        double num1 = scanner.nextDouble();
        
        // Get the second number
        System.out.print("Enter the second number (subtrahend): ");
        double num2 = scanner.nextDouble();
        
        // Calculate the difference
        double result = num1 - num2;
        
        // Print the result
        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        
        scanner.close();
    }
}