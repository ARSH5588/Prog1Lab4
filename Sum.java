//Importing the util import
import java.util.*;
///Class and main method
public class Sum {
  public static void main(String[] args) {
    //Variables
    int x = 10;
    int y = x + 1;
    //What the program does
    System.out.println("\nThis program  will add all integers between 10 and 20 ");
    //The initial value
    System.out.println("Initial Value = " + x);
    //Start of the for loop
    for (int i = 1; i<11 ; i++) {
      x =  x + y;
      System.out.println("\t\t" + x);
      y++;
      //End of the for loop
    }

  }
}

//Write a program that uses a for loop to output the sum of all the integers between 10 and 20, inclusive, that is, 10 + 11 + 12 + ... + 19 + 20.
