/**  
 * Square.java
 * 
 * Lab 23, COMP160 2015
 */
package shapes;
import java.awt.*;

public class Square extends Shape {
  /* draws a square */
    public void display(Graphics g){
      g.setColor(color);
      g.fillRect(x, y, width, height);
  }
}