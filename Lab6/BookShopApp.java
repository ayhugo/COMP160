import javax.swing.*;
import java.awt.*;



public class BookShopApp {
  
  
  public static void main(String[]args){
    Book m1 = new Book();
       m1.setTitle("Life of Pi");
       m1.setPages(273);
       m1.setPrice(28.90);
       m1.displayBook();
       
   Book m2 = new Book();
       m2.setTitle("Mister Pip");
       m2.setPages(240);
       m2.setPrice(22.70);
       m2.displayBook();
   
   Book m3 = new Book();
       m3.setTitle("Harry Potter");
       m3.setPages(200);
       m3.setPrice(25.60);
       m3.displayBook();
  }
  
}//end class