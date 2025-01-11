

import java.util.Scanner;


public class EvenOdd{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	 // enter the number 
	 System.out.println("Enter the  number ");
	 
	 int n = scanner.nextInt();
	 int size = n / 2 + 1;
	
	// creating two different array to storing 
	int even [] = new int[size];
	int odd [] = new int [size];
	int index=0;
	int index_odd=0;
	
// check the even odd condition and storing it into the array's	
	if(n > 0){
	for(int i=0; i<n; i++){ 
	  if(i%2==0){
		 even[index] = i;
		 index++;
	  } else{
		  odd[index_odd] = i;
		  index_odd++;
	  }
	}

    for(int i=0; i<size-1; i++){
		System.out.println(even[i]);
	}	
	System.out.println("*****************"); 
	 for(int i=0; i<size-1; i++){	
		System.out.println(odd[i]);
	}
	}else{
		System.out.println("Number is invalid");
		System.exit(-1);
	}
	
	 
	scanner.close();
 }
}