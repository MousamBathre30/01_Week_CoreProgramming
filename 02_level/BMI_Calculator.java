import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for weight (in kg) and height (in cm)
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height (in cm): ");
        double heightInCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (heightInMeters * heightInMeters);

        // Display the BMI
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));

        // Determine and display the weight status based on BMI
        if (bmi <= 18.4) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have a Normal weight.");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }

        scanner.close();
    }
}
