import java.util.Scanner;

public class MarksGradeCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


         // Input the number 
		 int n = scanner.nextInt();
         		
		 int maths [] = new int maths[n];
		 int chemistry [] = new int chemistry[n];
		 int physics [] = new int physics[n];
		 int percentage[] = new int percentage[n];
		 
        // Input marks for Physics, Chemistry, and Maths
         
		for(int i=0; i<n; i++){
			maths[i] = scanner.nextInt();
			chemistry[i] = scanner.nextInt();
			physics [i] = scanner.nextInt();
		} 
            
		double totalMarks;
		 // Determine grade and remarks
        String grade;
        String remarks;

        // Calculate total and percentage
		for(int i=0; i<n; i++){
			totalMarks  = (maths[i]+chemistry[i]+physics[i]);
            percentage[i] = totalMarks/3;
            			
						
		if (percentage[i] >= 80) {
            grade = "A";
            remarks = "Level 4: Above agency-normalized standard";
	    // Display the results
        System.out.println("\n--- Result ---");
        System.out.printf("Average Marks: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        } else if (percentage[i] >= 70) {
            grade = "B";
            remarks = "Level 3: At agency-normalized standard";
			 // Display the results
        System.out.println("\n--- Result ---");
        System.out.printf("Average Marks: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        } else if (percentage[i] >= 60) {
            grade = "C";
            remarks = "Level 2: Below but appropriate agency-normalized standard";
			 // Display the results
        System.out.println("\n--- Result ---");
        System.out.printf("Average Marks: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        } else if (percentage[i] >= 50) {
            grade = "D";
            remarks = "Level 1: Well below agency-normalized standard";
			 // Display the results
        System.out.println("\n--- Result ---");
        System.out.printf("Average Marks: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        } else if (percentage[i] >= 40) {
            grade = "E";
            remarks = "Level 1: Too below agency-normalized standard";
			 // Display the results
        System.out.println("\n--- Result ---");
        System.out.printf("Average Marks: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        } else {
            grade = "R";
            remarks = "Remedial standard";
			 // Display the results
        System.out.println("\n--- Result ---");
        System.out.printf("Average Marks: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        }			
		}

        scanner.close();
    }
}
