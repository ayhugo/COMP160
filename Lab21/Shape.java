/**  
 * Shape.java
 * 
 * Lab 21, COMP160 2015
 */
import java.util.Random;
import java.awt.*;

public class Shape {
  private int x, y, width, height;
  private Color color;
  
  /* returns a random int between min and max */
  private int randomNumber(int lo, int hi){
    int randomInt, range = hi - lo;
    Random random = new Random(); // create a random generator
    
    randomInt = random.nextInt(range) + lo;
    return randomInt;
  }//randomNumber
  
  /* a constructor to set start data fields to random variables */
  public Shape(){
    int red, green, blue;
    
    this.width = randomNumber(10, 30);
    this.height = width;
    
    this.x = randomNumber(0, (400-width));
    this.y = randomNumber(0, (400-height));
    
    red = randomNumber(0, 255);
    green = randomNumber(0, 255);
    blue = randomNumber(0, 255);
    
    this.color = new Color(red, green, blue);
  }
  
   /* draws the oval */
  public void display(Graphics g){
    g.setColor(color);
    g.fillOval(x, y, width, height);
  }
}