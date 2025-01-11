public class DividePen{
  
  public static void main(String args[]){
     /*
    Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pen

    */
    
   int totalPan = 14;
   int totalStudent = 3;
   int distributedPan= totalPan / 3;
   int notDistributedPan = totalPan % 3;
   System.out.println("The Pen Per Student is " + distributedPan + "and the remaining pen not distributed is " +  notDistributedPan );
 

}
  
} 
