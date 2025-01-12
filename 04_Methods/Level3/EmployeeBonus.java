import java.util.Random;

public class EmployeeBonus {

    // Method to generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] employeeData = new double[10][2];  // 2D array to store salary and years of service

        for (int i = 0; i < 10; i++) {
            // Generate random salary between 30000 and 99999
            double salary = 30000 + (random.nextInt(70000) + 1);
            // Generate random years of service between 1 and 20
            int yearsOfService = random.nextInt(20) + 1;

            // Store salary and years of service
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus based on the years of service
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[10][3]; // Array to store old salary, bonus, and new salary

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;
            double newSalary = 0;

            // Calculate bonus and new salary based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;  // 5% bonus
            } else {
                bonus = oldSalary * 0.02;  // 2% bonus
            }

            newSalary = oldSalary + bonus;

            // Store old salary, bonus, and new salary
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }

    // Method to calculate the total of old salaries, new salaries, and bonuses
    public static void calculateTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][2];
            totalBonus += updatedData[i][1];
        }

        // Display the totals
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }

    // Method to display employee data and bonus details
    public static void displayEmployeeDetails(double[][] updatedData) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + updatedData[i][0] 
                               + ", Bonus = " + updatedData[i][1] 
                               + ", New Salary = " + updatedData[i][2]);
        }
    }

    public static void main(String[] args) {
        // Generate employee data
        double[][] employeeData = generateEmployeeData();

        // Calculate bonus and new salary
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Display employee details
        displayEmployeeDetails(updatedData);

        // Calculate and display totals
        calculateTotals(updatedData);
    }
}
