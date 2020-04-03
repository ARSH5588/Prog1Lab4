//Importing all util imports
import java.util.*;
/**
*This program will multiply all the numbers between 3 & 7
*@author Arshjit Sansoe
*@return multiply 3 to 7
*@since 2020-04-02
*/
public class Product {
  public static void main(String[] args) {
    //Variables
    int x = 3;
    int y = 4;

    System.out.println("This program will multiply all the numbers between 3 and 7 ");
    //The initial Value is 3
    System.out.println("Intial Value =  " + x);
    //The start of the for loop
    for (int i = 1;i < 5 ;i++) {
      x = x * y;
      System.out.println("\t\t" + x);
      y++;
      //Exit of the for loop
    }

  }
}

//Write a program that uses a for loop to output the product of all the integers between 3 and 7, inclusive, that is, 3 * 4 * 5 * 6 * 7.
