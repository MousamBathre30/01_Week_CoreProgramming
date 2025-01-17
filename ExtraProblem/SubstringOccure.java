import java.util.Scanner;

public class SubstringOccure{


   public static void getSubstringoccure(String str , String sub){
	   
	   // create a char [] = 26 size 
	  int count = 0; // count the occurence 
	  int n =sub.length();
	  int m = str.length();
	  for(int i=0; i<str.length(); i++){
	  int check = (m-n-2+i);
	  if(check < 6){
	  String temp = str.substring(i,check);
	   if(temp.equals(sub)){
		   count++;
	   }
	  } else{
		  break;
	  }
	  
	  }  
	   System.out.println("Substring count is " + count);
	   
   }


  

   public static void main(String args[]){
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   // enter the string 
	   String str = scanner.nextLine();
	   String sub = scanner.nextLine();
	   getSubstringoccure(str,sub);
     
   }
  
}