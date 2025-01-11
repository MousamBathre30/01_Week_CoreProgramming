import java.util.Scanner;

public class TotalHandShake{
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Number of Student !");
    int numberOfStudent = scanner.nextInt();

    // calculate the total number of handshake
    
    int totalHandShake = (numberOfStudent * (numberOfStudent-1))/2;

    

    System.out.println(" the number of possible handshakes. ! " + totalHandShake);
}
} 
