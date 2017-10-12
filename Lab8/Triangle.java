/**  
 * Triangle.java
 * 
 * Lab 8, COMP160 2015
 */

import java.text.DecimalFormat;
public class Triangle {
  //data field declarations 
  private int p1x;       
  private int p1y;        
  private int p2x;       
  private int p2y;        
  private int p3x;       
  private int p3y;
  private String name;
 
  
  /** replacement for default constructor */
  public Triangle(){}
  
  /** constructor sets co-ords */
  public Triangle(int a, int b, int c, int d, int e, int f, String n){
    p1x = a;
    p1y = b;
    p2x = c;
    p2y = d;
    p3x = e;
    p3y = f;
    name = n;
    
  }//end method
  
  /** calculates the length of a side */
  public double calcSide(int x1, int x2, int y1, int y2){
    return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
  }// end method
  
  /**returns the value of the perimeter */
  public String getPerimeter(){
    DecimalFormat fmt = new DecimalFormat("0.##");
    return fmt.format(calcSide(p1x, p2x, p1y, p2y) + calcSide(p1x, p3x, p1y, p3y) + calcSide(p2x, p3x, p2y, p3y));
  } //end method
  
  /**returns the value of the data field name */
  public String getName(){      
    return name; 
  } //end method
  
  /**displays information to the console window */  
  public String toString(){     
   return ("Triangle "+getName()+ " perimeter is "+getPerimeter()+" units"); 

  } //end method  
  
  
}