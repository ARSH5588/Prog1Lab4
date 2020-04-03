//Importing the util import
import java.util.*;
/**
*This program gives you the square root of numbers that are higher than 10 and will square root until it hits 1.01
*@author Arshjit Sansoe
*@return squre root of numbers higher than 10 until 1.01
*@since 2020-04-02
*/
public class Value {
  public static void main(String[] args) {
    //Variable
    double num;

    System.out.println("This program gives you the square root of numbers that are higher than 10 and will square root until it hits 1.01");
    //Scanner used
    Scanner value = new Scanner(System.in);
    //Asked user to enter a higher value than 10
    System.out.println("Enter a value higher than 10");
    num = value.nextDouble();
    //It will execute if number is greater than 10
    if (num > 10) {
      System.out.println("Number type = " + num);
      //While loop will execute if number is higher than 1.01
      while (num > 1.01) {
        num = Math.sqrt(num);
        System.out.printf("\nNumber = %.2f ", num);
        //End of while loop
      }
    }
    //It will execute if the first if statement didnt appeal to the users answer
    else {
      //It will execute if the number is less than or equal to 10
      while (num <= 10) {
        System.out.println("Try Again, enter another value");
        num = value.nextDouble();
      }
      System.out.println("Number type = " + num);
      //It enters the while loop if the number is bigger than 1.01
      while (num > 1.01) {
        num = Math.sqrt(num);
        System.out.printf("\nNumber = %.2f ", num);
      }
    }

  }
}

//Write a program that prompts the user for a value greater than 10 as an input (you should loop until the user enters a valid value) and finds the square root of that number and the square root of //the result, and continues to find the square root of the result until you reach a number that is smaller than 1.01. The program should output how many times the square root operation was performed.
