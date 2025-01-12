import java.util.Arrays;
import java.util.Scanner;

public class NumberCheck {

    // Method to generate a random 3-digit number in the range 150-250
    public static int get3DigitNumber() {
        return (int) (Math.random() * (250 - 150 + 1)) + 150;
    }

    // Method to find the shortest person (minimum value in the array)
    public static int getShort(int array[]) {
        Arrays.sort(array);
        return array[0];
    }

    // Method to find the sum of heights in the array
    public static int getSum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Method to find the tallest person (maximum value in the array)
    public static int getTall(int array[]) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    // Method to calculate the mean
    public static int getMean(int sum, int size) {
        return sum / size;
    }

    // Method to display the results
    public static void getDisplay(int array[], int sum, int shortest, int tallest, int mean) {
        System.out.println("Heights of the team members:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Sum of heights: " + sum);
        System.out.println("Shortest person: " + shortest);
        System.out.println("Tallest person: " + tallest);
        System.out.println("Mean height: " + mean);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int teamArray[] = new int[11];

        // Generate random heights for the team
        for (int i = 0; i < 11; i++) {
            int randomNumber = get3DigitNumber();
            teamArray[i] = randomNumber;
        }

        // Calculate the sum of heights
        int sum = getSum(teamArray);
        // Calculate the mean height
        int mean = getMean(sum, teamArray.length);
        // Find the shortest height
        int shortest = getShort(teamArray);
        // Find the tallest height
        int tallest = getTall(teamArray);

        // Display the results
        getDisplay(teamArray, sum, shortest, tallest, mean);

        scanner.close();
    }
}
