/**  
 * TablePanel.java
 * 
 * Lab 14, COMP160 2015
 */

// import graphics classes including JFrame
import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;


public class TablePanel extends JPanel {

  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
  /** creates all the poeple sitting around the table */
  public TablePanel(){
  diner1 = new Diner (120, 40, "David", 1, Color.red);
  diner2 = new Diner (180, 100, "Claire", 2, Color.blue);
  diner3 = new Diner (180, 160, "Michael", 3, Color.red);
  diner4 = new Diner (120, 210, "Metiria", 4, Color.blue);
  diner5 = new Diner (60, 160, "Todd", 5, Color.red);
  diner6 = new Diner (60, 100, "Jacqui", 6, Color.blue);
  
  setPreferredSize (new Dimension(300,400));
  setBackground (Color.white);
  }
  
  public void paintComponent (Graphics g){
    
    super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    
    g.setColor(Color.black);
    g.fillRect(120,100,50,100);
  
  }
}