/**  
 * Oval.java
 * 
 * Lab 23, COMP160 2015
 */
package shapes;
import java.awt.*;

public class Oval extends Shape {
  public Oval(){
    super(); 
    height = 4 * width; 
    y = randomNumber(0, 400 - height); 
  }
  /* draws a oval */
    public void display(Graphics g){
      g.setColor(color);
      g.fillOval(x, y, width, height);
  }
}