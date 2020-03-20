import java.util.*;

public class Value {
  public static void main(String[] args) {

    double num;

    System.out.println("This program gives you the square root of numbers that are higher than 10");

    Scanner value = new Scanner(System.in);
    System.out.println("Enter a value higher than 10");
    num = value.nextDouble();

    if (num > 10) {
      System.out.println("Number type = " + num);
      while (num > 1.01) {
        num = Math.sqrt(num);
        System.out.printf("\nNumber = %.2f ", num);
      }
    }
    else {
      while (num <= 10) {
        System.out.println("Try Again, enter another value");
        num = value.nextDouble();
      }
      System.out.println("Number type = " + num);
      while (num > 1.01) {
        num = Math.sqrt(num);
        System.out.printf("\nNumber = %.2f ", num);
      }
    }

  }
}

//Write a program that prompts the user for a value greater than 10 as an input (you should loop until the user enters a valid value) and finds the square root of that number and the square root of //the result, and continues to find the square root of the result until you reach a number that is smaller than 1.01. The program should output how many times the square root operation was performed.
