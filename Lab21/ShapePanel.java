/**  
 * ShapePanel.java
 * 
 * Lab 21, COMP160 2015
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapePanel extends JPanel {
  //data fields 
  Shape[] shapes = new Shape[20];
  
  int countShape;
  
  JButton addShape;
  JLabel countLabel;
  JTextField showNum;
  JPanel controlPanel;
  ButtonListener buttonListener;
  DrawingPanel drawPanel = new DrawingPanel();
  
  
  public static void main(String [] args){
    JFrame frame = new JFrame("Shape Panel");
    frame.setContentPane(new ShapePanel());
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
  /** adds the button, text, and label to controlPanel and adds controlPanel to shapePanel.
    * sets the size of controlPanel*/
  public ShapePanel(){
    addShape = new JButton("Add Shape");
    showNum = new JTextField(2);
    countLabel = new JLabel("Count:");
    controlPanel = new JPanel();
    buttonListener = new ButtonListener();
    
    addShape.addActionListener(buttonListener);
    controlPanel.add(addShape);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    controlPanel.setPreferredSize(new Dimension(100, 400));
    add(controlPanel);
    add(drawPanel);
  }
  /** adds a shape to the array and displays the number of shapes */
  private class ButtonListener implements ActionListener {
    public void actionPerformed (ActionEvent e){
      if (e.getSource() == addShape && countShape < shapes.length){
        shapes[countShape] = new Shape();
        countShape ++;
      }
      showNum.setText("" + countShape);
      drawPanel.repaint();
    }//actionPerformed
  }//ButtonListener
  
  /** sets the size and color of DrawingPanel */
  private class DrawingPanel extends JPanel{
    public DrawingPanel(){
      setPreferredSize(new Dimension(400, 400));
      setBackground(Color.pink);
    }//constructor
    
    /** displays the shapes on DrawingPanel */
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      if (countShape > 0){
        for (int i = 0; i < countShape; i++){
          shapes[i].display(g);
        }
      }
    }
  }//DrawingPanel class
  
}
