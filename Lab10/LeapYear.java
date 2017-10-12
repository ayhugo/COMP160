/**  
 * LeapYear.java
 * 
 * Lab 10, COMP160 2015
 */



public class LeapYear {

  public static void main(String[]args){
    // calling each year
    leapYear(2010);
    leapYear(2012);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
  }

  public static void leapYear(int y){
    //if the year is greater that 1582 then do the following if not then it predates the Gregorian calendar
    if ( y > 1582){
      //if the year is divisible by 4, by 100, and by 400 then it is a leap year
      if (y % 4 == 0 && y % 100 == 0 && y % 400 == 0){
        
        System.out.println(y+": is a leap year");
      
      //it is not a leap year if it is divisible by 4, by 100, but not by 400 or if it is not divisible by 4
      } else if (y % 4 == 0 && y % 100 == 0 && y % 400 != 0 || y % 4 != 0)  {
        
        System.out.println(y+": is not a leap year");
    
      //if the year is divisible by 4 then it is a leap year
      } else if (y % 4 == 0){
        
        System.out.println(y+": is a leap year");
        
      }
      
    } else {
        System.out.println(y+": predates the Gregorian calendar");
      
      }
    }  
  }
