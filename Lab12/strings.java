/**  
 * strings.java
 * 
 * Lab 12, COMP160 2015
 */
import java.util.Scanner;

public class strings {
  public static void main(String[]args){
    /** variable declarations */
    String mySentance;
    String lowerSentance;
    int countVowel = 0, countConsonant = 0, num =0;
    
    /** gets input from user*/
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentance:");
    mySentance = scan.nextLine();
    
    lowerSentance = mySentance.toLowerCase(); // decap's the phrase entered in
    
    while (num < mySentance.length()){
      /** checks if the char is a letter. If so then passes it into the switch*/
      if ('a' <= lowerSentance.charAt(num) && lowerSentance.charAt(num) <= 'z'){ 
        switch (lowerSentance.charAt(num)){
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
            countVowel = countVowel + 1;
            break;
          default:
            countConsonant = countConsonant + 1;
        } // end switch
      } // end if
              num++;
              
   }//end while
    System.out.println("Sentence is : "+mySentance);
    System.out.println("Vowel Count : "+countVowel);
    System.out.println("Vowel Constant : "+countConsonant);
 }//end main
}//end public