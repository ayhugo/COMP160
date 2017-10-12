/**  
 * ShapePanel.java
 * 
 * Lab 24, COMP160 2015
 */
package shapes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ShapePanel extends JPanel {
  //data fields 
  ArrayList<Shape> shapes = new ArrayList<Shape>();
  JButton [] buttons = new JButton[8];
  
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
    countLabel = new JLabel("Remove which?");
    controlPanel = new JPanel();
    buttonListener = new ButtonListener();
    timer = new Timer(DELAY, buttonListener);
    
    String[] label = {"Circle", "Square", "Oval", "Smiley", "Swirl", "Remove", "Start", "Stop"};
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
        for (Shape s : shapes){
          s.move();
        }
        
      }else {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("Remove")){
          try {
            int removeShapeNum = Integer.parseInt(showNum.getText());
            
              shapes.remove(removeShapeNum);
        
          }catch (NumberFormatException exception){
            System.out.println("please enter a number");
          }catch (IndexOutOfBoundsException exception){
            System.out.println("Number out of bounds");
          }
        }
        if (shapes.size() <= 20){
          
          if(button.getText().equals("Circle")){
            shapes.add(new Circle());
            
          } else if (button.getText().equals("Square")){
            shapes.add(new Square());
            
          } else if (button.getText().equals("Smiley")){
            shapes.add(new Smiley());
            
          } else if (button.getText().equals("Swirl")){
            shapes.add(new Swirl());
            
          }else if (button.getText().equals("Oval")){
            shapes.add(new Oval());
            
          }
          if (shapes.size() > 0){
            showNum.setText(Integer.toString(shapes.size() - 1));
          } else {
            showNum.setText("");
          }
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
      if (shapes.size() > 0){
        for (Shape s : shapes){
          s.display(g);
          s.showIndex(g, shapes.indexOf(s));
        }
      }
    }
  }//DrawingPanel class
  
}
