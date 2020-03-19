import java.util.*;

public class Product {
  public static void main(String[] args) {

    int x = 3;
    int y = 4;

    System.out.println("Intial Value =  " + x);

    for (int i = 1;i < 5 ;i++) {
      x = x * y;
      System.out.println("\t\t" +       x);
      y++;
    }
  }
}

//Write a program that uses a for loop to output the product of all the integers between 3 and 7, inclusive, that is, 3 * 4 * 5 * 6 * 7.
