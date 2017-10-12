/**
 Hugo Ayre
 Pie.java
 Provided for Part 2, Lab5, COMP160 2015
 
 */

import javax.swing.*;
import java.awt.*;

public class Pie extends JFrame{
    
    /**creates  an instance of Pie called chart1*/
    public static void main(String[]args){
        Pie chart1 = new Pie(); 
        chart1.setSize(300,220);
        chart1.setVisible(true);
    }
    
    /**all drawing code goes in the paint method, which is called automatically*/
    public void paint (Graphics page){
        page.setColor(Color.white);
        page.fillRect(0,0,300,220);
        //your pie chart code goes here
        final int MID = 150;
        final int TOP = 110;
        
        page.setColor (Color.red);
        page.fillArc (MID-65, TOP-80, 150, 150, 0, 45); // 1st arc
        
        page.setColor (Color.orange);
        page.fillArc (MID-75, TOP-75, 150, 150, 45, 45); // 2nd arc
        
        page.setColor (Color.yellow);
        page.fillArc (MID-75, TOP-75, 150, 150, 90, 45); // 3rd arc
        
        page.setColor (Color.green);
        page.fillArc (MID-75, TOP-75, 150, 150, 135, 45); // 4th arc
        
        page.setColor (Color.blue);
        page.fillArc (MID-75, TOP-75, 150, 150, 180, 45); // 5th arc
        
        page.setColor (Color.red);
        page.fillArc (MID-75, TOP-75, 150, 150, 225, 45); // 6th arc
        
        page.setColor (Color.yellow);
        page.fillArc (MID-75, TOP-75, 150, 150, 270, 45); // 7th arc
        
        page.setColor (Color.blue);
        page.fillArc (MID-75, TOP-75, 150, 150, 315, 45); // 8th arc
        
    }
}
