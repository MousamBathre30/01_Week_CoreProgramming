public class ProfitLoss{
  
  public static void main(String args[]){
     /*
        Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 

    */
    
    int costPrice = 129;
    int sellingPrice = 191;
    int profit = (sellingPrice - costPrice);
    double profitPercentage =  ( double)profit  / ((double)costPrice* 100);
    
    System.out.println("the Cost Price is INR " +  costPrice + "and Selling Price is INR " + sellingPrice + "and the profit Percentage is  " +   profitPercentage );
 

}
  
} 
