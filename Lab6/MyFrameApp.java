/**  
 * MyFrameApp.java
 * 
 * Lab 6, COMP160 2015, Hugo
 */

import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;


public class MyFrameApp {
  
  
  public static void main(String[]args){
    
    
    MyFrame m1 = new MyFrame();
    m1.setSize(300,150); //size
    m1.decorate(Color.pink, "Pink Einstein", 0); //background color and title
    m1.setVisible(true); //make it visible
    
    MyFrame m2 = new MyFrame();
    m2.decorate(Color.blue, "Blue", 180); //background color and title
    m2.setSize(300,150); //size
    m2.setVisible(true); //make it visible 
  }
  
}//end class
