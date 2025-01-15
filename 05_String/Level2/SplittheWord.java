  /*
  
  |\\\    \ 
  
  */
  
  import java.util.Scanner;
  
  public class SplittheWord{
    
	
	public static void getthesplitarray(String str){
		String splitarray [] = str.split("\\s+"); 
	
		
		for(int i=0; i<splitarray.length; i++){
			 System.out.println(splitarray[i]);
		}
		
		
	}
	
	
    public static void  main (String args []){

	  Scanner scanner = new Scanner(System.in);
	  // mousam is the best.
	  String str = scanner.nextLine();
	  
	  getthesplitarray(str);
	}
  }