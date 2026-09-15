import java.util.Scanner;

public class Calculator {

    public static String divide(String a, String b) {
        try {
            double num1 = Double.parseDouble(a);
            double num2 = Double.parseDouble(b);
            if (num2 == 0) {
                return "Error: cannot divide by zero";
            }
            double result = num1 / num2;
            // Trim trailing .0 so 10/2 prints as 5 instead of 5.0
            return (result == (long) result)
                    ? String.valueOf((long) result)
                    : String.valueOf(result);
        } catch (NumberFormatException e) {
            return "Error: invalid input";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String a = scanner.next();
        System.out.print("Enter second number: ");
        String b = scanner.next();
        System.out.println("Result: " + divide(a, b));
    }
}