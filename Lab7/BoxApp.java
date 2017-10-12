/**  
 * BoxApp.java
 * 
 * Lab 7, COMP160 2015
 */
import javax.swing.*;
import java.awt.*;


public class BoxApp {
  public static void main(String[]args){
  
    //new boxes made using constructors
    Box box1 = new Box(4,4,6);
    System.out.println(box1.toString());
    
    Box box2 = new Box(3,4,5);
    System.out.println(box2.toString());
    
    Box box4 = new Box(5);
    System.out.println(box4.toString());
    
  }
  
  

}