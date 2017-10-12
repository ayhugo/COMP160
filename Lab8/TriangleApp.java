/**  
 * TriangleApp.java
 * 
 * Lab 8, COMP160 2015
 */


import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class TriangleApp {
  public static void main(String[]args){
    
    
    
    Triangle tri1 = new Triangle(0,0,3,0,3,4,"A");
    Triangle tri2 = new Triangle(0,3,3,4,1,9,"B");
    
    System.out.println(tri1.toString());
    System.out.println(tri2.toString());
    

  }
  
  

}