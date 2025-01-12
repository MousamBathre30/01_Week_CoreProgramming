import java.util.Scanner;

public class ExtendedUnitConverter {

    // Conversion constants
    private static final double YARDS_TO_FEET = 3.0;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * INCHES_TO_CM;
    }

    public static void main(String[] args) {
        // Example usage
        double yards = 5;
        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");

        double feet = 15;
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");

        double meters = 2;
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");

        double inches = 50;
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");

        System.out.println(inches + " inches is equal to " + convertInchesToCentimeters(inches) + " centimeters.");
    }
}
