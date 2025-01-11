import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input values for the two numbers and the operator
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = scanner.next();

        // Initialize the result variable
        double result = 0;

        // Perform operations using switch...case
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                scanner.close();
                return;
        }

        // Print the result
        System.out.println("Result: " + result);

        // Close scanner
        scanner.close();
    }
}
