
public class Findunique{

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
	   
	   System.out.println("uniqe char is " +temp);
 
  }
  
   public static void main(String args[]){
   
   
   
    Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
    getPresent(str);
   }
  
  
  }