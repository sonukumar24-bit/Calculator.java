import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        if (secondNumber == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double quotient = firstNumber / secondNumber;
            System.out.println("The quotient is: " + quotient);
        }

        scanner.close();
    }
}
