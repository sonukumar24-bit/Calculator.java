import java.util.Scanner;

public class Calculator {
    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        try {
            double result;
            switch (choice) {
                case 1:
                    result = add(firstNumber, secondNumber);
                    break;
                case 2:
                    result = subtract(firstNumber, secondNumber);
                    break;
                case 3:
                    result = multiply(firstNumber, secondNumber);
                    break;
                case 4:
                    result = divide(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    scanner.close();
                    return;
            }
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }

        scanner.close();
    }
}
