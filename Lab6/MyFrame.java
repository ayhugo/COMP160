/**  
 * MyFrame.java
 * 
 * Lab 6, COMP160 2015
 */

// import graphics classes including JFrame
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;

/**Make our own version of a JFrame class with our own paint method...*/
public class MyFrame extends JFrame {
  
  public void paint(Graphics g) {
    g.drawRect(50,50,40,40);       // square
    g.drawRect(60, 80, 225, 30);   // rectangle       
    g.drawOval(75, 65, 20, 20);    // circle
    g.drawLine(35, 60, 100, 120);  // line
    g.drawString("Out of clutter, find simplicity", 110, 70);
    g.drawString("-- Albert Einstein", 130, 100);
  }//end paint
  
  public void decorate(Color shade, String title, int y){
    int yOffset = y;
    setLocation(0,yOffset);
    setBackground(shade);
    setTitle(title);
  }//end decorate
 
}//end class
