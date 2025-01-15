
import java.util.Scanner;
import java.util.*;

public class Solve{


  public static void angram(String str1 , String str2){
    /// step-1 find the length is equal or not.
      if(str1.length() != str2.length()){
		  
		System.out.println("Not a anagram");
		return;
	  }
	  // step 2 store in the array.
	  char array [] = str1.toCharArray();
	  char array2 [] = str2.toCharArray();
	  

	  Arrays.sort(array);
	  Arrays.sort(array2);
	  
	  
	  for(int i=0; i<array.length; i++){
		  
		  if(array[i] != array2[i] ){
			System.out.println("Given string is not a anagram");  
		  }
	  }
	  System.out.println("Given string is anagram");  
  }
  a
 
 public static void main(String args[]){
   // taking the input 
   Scanner scanner = new Scanner(System.in);
   
   String str1 = scanner.nextLine(); // first string 
   
   String str2 = scanner.nextLine();  // second string 
   
   // mousam - > j  
   
    angram(str1 , str2);
   
 
 }
}