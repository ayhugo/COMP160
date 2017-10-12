/**  
 * Circle.java
 * 
 * Lab 23, COMP160 2015
 */
package shapes;
import java.awt.*;

public class Circle extends Shape {
  /* draws a circle */
    public void display(Graphics g){
      g.setColor(color);
      g.fillOval(x, y, width, height);
  }
}