/**  
 * Box.java
 * 
 * Lab 7, COMP160 2015
 */




public class Box {
  //data field declarations 
  private int length;       
  private int width;        
  private int height;
  
  /** replacement for default constructor */
  public Box(){}
  
  /** constructor sets height width and length */
  public Box(int h, int l, int w){
    height = h;
    length = l;
    width = w;
  }//end method
  
  /** constructor sets height width and length */
  public Box(int h){
    height = h;
    length = h;
    width = h;
  }//end method
  
  
   /**sets the value of the data field length to input parameter value*/
  public void setLength(int l){      
    length = l;      
  } //end method 
  
  /**sets the value of the data field height to input parameter value*/
  public void setHeight(int h){      
    height = h;      
  } //end method
  
  /**sets the value of the data field width to input parameter value*/
  public void setWidth(int w){      
    width = w;      
  } //end method 
  
  /**returns the value of the data field Volumne */
  public int getVolumne(){      
    int volumne = length * width * height;
    return volumne;
  } //end method
  
  /**returns the value of the data field surface area */
  public int getArea(){      
    int area = 2*length*width + 2*length*height + 2*width*height;
    return area;
  } //end method 
  
  /**displays information to the console window */  
  public String toString(){     
   return("Height is: " + height +", Length is: "+ length +", Width is: " + width + ", Volumne is: "+getVolumne()+", Surface Area: "+getArea()); 

  } //end method  
  
  
}