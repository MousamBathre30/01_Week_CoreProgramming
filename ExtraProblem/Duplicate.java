import java.util.Scanner;

public class Duplicate{


   public static void getAllDuplicate(String str){
	   
	   // create a char [] = 26 size 
	   
	   int [] chararray = new int[26];
	   
	   int count = 0;
	   int countOfConsonet = 0;
	   String temp = "";
	   int n = str.length();
	   
	   for(int i=0; i<n; i++){
		   char ch = str.charAt(i);
		   
		   if(ch >= 'a' && ch <= 'z'){
			    chararray [ch - 'a']++; 
		   }   
	   }
	   
	   for(int i=0; i<n; i++){
		   
		   if(chararray[str.charAt(i) - 'a'] == 1){
			   temp+=str.charAt(i);
			   
		   }
	   }

	   System.out.println("given string  " + temp);
	   
   }


  public static void getPresent(String str){
	  int n= str.length();
	  String temp = "";
	   boolean [] chararray = new boolean[26];
	   for(int i=0; i<n; i++){

		   if(!chararray[str.charAt(i) - 'a']){
			   temp+=str.charAt(i);
			   chararray[str.charAt(i) - 'a'] = true;
			   
		   }
	   }
	   
	   System.out.println(temp);
 
  }
  

   public static void main(String args[]){
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   // enter the string 
	   String str = scanner.nextLine().trim();
	   
	   getAllDuplicate(str);
       getPresent(str);
	   
   }
  
}