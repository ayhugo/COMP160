/**  
 * Diner.java
 * 
 * Lab 14, COMP160 2015
 */

// import graphics classes including JFrame
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;

/** declares data values*/
public class Diner {
  
  private int x;
  private int y;
  private String name;
  private Color colour;
  private int seatNum;
  private static final int DIAMETER = 50;
  
  /** constuctor */ 
  public Diner(int a, int b, String n, int s, Color c){
    this.x = a;
    this.y = b;
    this.name = n;
    this.seatNum = s;
    this.colour = c;
    
    
  }
  /** draws the diner table and people */
  public void draw(Graphics g) {
    
    g.setColor(colour); // sets color
    g.fillOval(x, y, 50, 50);    // circle
    g.setColor(Color.black);// sets color
    g.drawString(name, x, y+30); // name
    g.setColor(Color.black);
    g.drawString(Integer.toString(seatNum), x+20, y+15);
  }//end draw
 
}//end class
