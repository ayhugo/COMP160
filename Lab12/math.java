/**  
 * math.java
 * 
 * Lab 12, COMP160 2015
 */
import java.util.Scanner;

public class math {
  
  public static void main(String[]args){
    /** variable declarations */
    int count = 2;
    int sum = 0;
    
    /** gets input from user*/
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number greater than 1:");
    int num = scan.nextInt();
    
    /** input must not be less than 2 */
    if (num < 2){
      System.out.println("Input value must not be less than 2");
    } else {
      
      while (count < num){
        /** if the count is even the add it to sum */
        if (count % 2 == 0){
          sum = sum + count;
        }//end if
        count++;
      }// end while
      
      System.out.println("sum of even numbers between 2 and "+num+" inclusive is: "+sum);
  }// end if
  }
  
  
  
}