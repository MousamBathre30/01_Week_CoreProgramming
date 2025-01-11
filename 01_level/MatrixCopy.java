

import java.util.Scanner;


public class MatrixCopy{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	 // enter the number 
	 System.out.println("Enter the  number row and coloum");
	 
	 int row = scanner.nextInt();
     int colums = scanner.nextInt();
	
	// creating  array to storing factors
	int matrix [][] = new int[row][colums];
	
	int index=0;
	
// nested loop to input the matrix element.	
	for(int i=0; i<row; i++){ 
	     for(int j=0; j<colums; j++){
			 matrix[i][j] = scanner.nextInt();
		 }
	}
	
	System.out.println("Print the 2D matrix");
	for(int i=0; i<row; i++){ 
	     for(int j=0; j<colums; j++){
			 
			 System.out.print(matrix[i][j]+ " ");
		 }
		 System.out.println();
	}
	
	
	// create the singleDimension array.
	int array [] = new int[row * colums];
    
	// nested loop for printing and storing the array
   // print the single dimensitional array .
   for(int i=0; i<row; i++){
		for(int j=0; j<colums; j++){
			array[index] = matrix[i][j];
			System.out.println(array[index]);
			index++;
		}
		
	}
 
	scanner.close();
 }
}