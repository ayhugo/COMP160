/**  
 * ShapePanel.java
 * 
 * Lab 23, COMP160 2015
 */
package shapes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapePanel extends JPanel {
  //data fields 
  Shape[] shapes = new Shape[20];
  JButton [] buttons = new JButton[7];
  
  int countShape;
  
  Timer timer;
  private final int DELAY = 10;
  
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
    
    
    
    showNum = new JTextField(2);
    countLabel = new JLabel("Count:");
    controlPanel = new JPanel();
    buttonListener = new ButtonListener();
    timer = new Timer(DELAY, buttonListener);
    
    String[] label = {"Circle", "Square", "Oval", "Smiley", "Swirl", "Start", "Stop"};
    for (int i = 0; i < buttons.length; i++){
      buttons[i] = new JButton(label[i]);
    }
    
    for (JButton button : buttons){
      button.addActionListener(buttonListener);
      controlPanel.add(button);
    }
    
    
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    controlPanel.setPreferredSize(new Dimension(100, 400));
    add(controlPanel);
    add(drawPanel);
  }
  /** adds the shapes to the array and displays the number of shapes */
  private class ButtonListener implements ActionListener {
    public void actionPerformed (ActionEvent e){
      if (e.getSource() == timer){
          for (int i = 0; i < countShape; i++){
            shapes[i].move();
          }
        
      }else {
        JButton button = (JButton) e.getSource();
        if (countShape < shapes.length){
          
          if(button.getText().equals("Circle")){
            shapes[countShape] = new Circle();
            countShape++;
          } else if (button.getText().equals("Square")){
            shapes[countShape] = new Square();
            countShape++;
          } else if (button.getText().equals("Smiley")){
            shapes[countShape] = new Smiley();
            countShape++;
          } else if (button.getText().equals("Swirl")){
            shapes[countShape] = new Swirl();
            countShape++;
          }else if (button.getText().equals("Oval")){
            shapes[countShape] = new Oval();
            countShape++;
          }
          showNum.setText("" + countShape);
        }
        
        if (button.getText().equals("Start")){
          timer.start();
        }else if (button.getText().equals("Stop")) {
          timer.stop();
        }
        
      }
      drawPanel.repaint();
    }
    
    }
    

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
