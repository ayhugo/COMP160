/**  
 * TwelveTables.java
 * 
 * Lab 16, COMP160 2015
 */
public class TwelveTables{
  
  /** displays the multiplication table up to 12x12 */
  public static void main(String [] args){
  int cols = 12;
  int rows = 12;
  int [] [] table = new int [rows][cols];
  for (int row = 0; row <rows; row++){
    for (int col = 0; col < cols; col ++){
      table[row][col] = (row+1)*(col+1);
    }
  }
  for (int row = 0; row<table.length; row ++){
    for (int col = 0; col <table[row].length; col ++){
      System.out.print(table[row][col]+"\t");
      
    }
    System.out.println();
  }
  }
}