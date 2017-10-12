/**  
 * Customer.java
 * 
 * Lab 9, COMP160 2015
 */



public class Customer {
  //data field declarations 
  private String name;
  private boolean child;
  private boolean student;
  private boolean booked;
  
  /** constructor */
  public Customer(String n, int a, boolean s){
    name = n;
    student = s;
    if (a <= 16 && a >= 5){
      child = true;
    } else {
      child = false;
    }
  }//end method
  
  
  /**returns the value of the data field name */
  public String getName(){      
    return name; 
  } //end method
  
  /**returns the value of the data field child */
  public boolean isChild(){      
    return child; 
  } //end method
  
  /**returns the value of the data field student */
  public boolean isStudent(){
    return student;
  }//end method
  
  /**returns the value of the data field booked */
  public boolean isBooked(){
    return booked;
  }//end method
  
  public void setBooked(){
    booked = true;
  }

}
  



