import javax.swing.JFrame;

public class Table{
  public static void main(String[]args){
  JFrame frame = new JFrame ("Table");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  frame.getContentPane() .add(new TablePanel());
  frame.pack();
  frame.setVisible(true);
  }
}
