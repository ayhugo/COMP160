/**  
 * TrafficLightPanelApp.java
 * 
 * Lab 18, COMP160 2015
 */
import javax.swing.JFrame;

public class TrafficLightPanelApp {
  
  public static void main(String[]args){
    //  Creates and presents the program frame.
    JFrame frame = new JFrame ("Traffic Lights");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane().add(new TrafficLightPanel());
    
    frame.pack();
    frame.setVisible(true);
    
  }

  }
