/**
 * fish.java
 * Hugo Ayre 2015, Lab 3, COMP160,
 * prints a few verses followed by user input verse
 */

import java.util.Scanner;
public class Fish{
 
  public static void main(String [] args){
    // declare vars
    String verse3 = "This one has a little star.\n";
    String verse4;
    Scanner scan = new Scanner(System.in);
    
    // Get input from user
    System.out.println("Enter a verse: ");
    verse4 = scan.nextLine();
    
    // print out the verse's
    printVerse1();
    printVerse2();
    printVerse3(verse3);
    printVerse3(verse4);
  }//end main
  
  /**declares a String variable called verse1 and displays it on the screen*/
  public static void printVerse1(){
    String verse1 = "One fish\nTwo fish\nRed fish\nBlue fish.\n";
    System.out.println(verse1);
  }//end printVerse1
  
  public static void printVerse2(){
    String verse2 = "Black fish\nBlue fish\nOld fish\nNew fish.\n";
    System.out.println(verse2);
  }
  
    public static void printVerse3(String verse){
    System.out.println(verse);
  }
}//end class
