/** application class for Customer.java
 * Lab 9 COMP160
 */
import java.text.NumberFormat;  //for formatting price to 2 decimal places.
import java.util.Scanner;
public class CruiseApp{
    
    public static void main(String[]args){
        //each Customer created with name, age, showed student ID card
        Customer customer1 = new Customer("Aaron Stott",17, true);
        Customer customer2 = new Customer("Betty Adams",17, false);
        Customer customer3 = new Customer("Corin Child",16, true);
        Customer customer4 = new Customer("Doris Stewart",25, true);
        Customer customer5 = new Customer("Edmond Cheyne",12, false);
        Customer customer6 = new Customer("Fiona Chaney",7, false);
        Customer customer7 = new Customer("Ged Still-Child",16, true);
        Customer customer8 = new Customer("Harry Adamson",20, false);
        
        //calling each customer
        confirmBooking(customer1); 
        confirmBooking(customer2);
        confirmBooking(customer3);
        confirmBooking(customer4);
        confirmBooking(customer5);
        confirmBooking(customer6);
        confirmBooking(customer7);
        confirmBooking(customer8);
        
        showBooked(customer1);
        showBooked(customer2);
        showBooked(customer3);
        showBooked(customer4);
        showBooked(customer5);
        showBooked(customer6);
        showBooked(customer7);
        showBooked(customer8);
    }
   /** comfirms the booking of the cutstomer, and applies discounts (if required) */
    public static void confirmBooking(Customer customer) {
      double ticketPrice = 56; // price of the ticket
      double mealPrice = 30; // price of the meal
      double discountTicket; //data field for the discounted ticket 
      double discountMeal; //data field for the discounted meal
      String stringBooking;
      
      // if the customer is a child then apply child discounts
      if (customer.isChild()){
        discountTicket = ticketPrice * 0.5;
        discountMeal = mealPrice * 0.5;
        
      // else if the customer is  a student then apply student discount
      }else if (customer.isStudent()){
        discountTicket = ticketPrice * 0.5;
        discountMeal = mealPrice * 0.9;
      
      // if the customer is not a child or a student then apply normal discounts
      }else{
        discountTicket = ticketPrice * 0.8;
        discountMeal = mealPrice * 0.9;
      }
      NumberFormat fmt = NumberFormat.getCurrencyInstance(); // for formatting price
      System.out.println(customer.getName() +"\nTicket Price:"+ fmt.format(discountTicket) +"\nMeal Price:"+ fmt.format(discountMeal)+ "\nTotal price:"+fmt.format((discountMeal+discountTicket))+"\n");
      Scanner scan = new Scanner(System.in);
    
    // Get input from user
    System.out.println("Comfirm booking for "+customer.getName()+ " (Y/N)");
    stringBooking = scan.nextLine();
    
    // if the user enters Y or y then comfirm the booking
    if (stringBooking.equals("Y") || stringBooking.equals("y")){
      customer.setBooked();
      System.out.println("Booked\n");
    }
    
    }
    
    //if the customer is booked say that they are booked 
    public static void showBooked(Customer customer){
      if (customer.isBooked()){
      System.out.println(customer.getName()+" is booked");
      }
    }
}