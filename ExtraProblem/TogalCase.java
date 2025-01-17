import java.util.Scanner;

public class TogalCase{


   public static void getTogal(String str){
	   
	   
	   int count = 0;
	   String ans = "";
	   String uppercase = str.toUpperCase();
	   String lowercase = str.toLowerCase();
	   for(int i=0; i<str.length(); i++){
		   
		   if(i % 2 == 0){
			   ans += uppercase.charAt(i);
		   }else{
			   ans += lowercase.charAt(i);
		   }
	   }
	  
	   System.out.println("togal string is " + ans);
	   
   }


  

   public static void main(String args[]){
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   // enter the string 
	   String str = scanner.nextLine();
	   getTogal(str);
     
   }
  
}