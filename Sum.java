import java.util.*;

public class Sum {
  public static void main(String[] args) {

    int x = 10;
    int y = x + 1;

    System.out.println("\nThis program  will add all integers between 10 and 20 ");

    System.out.println("Initial Value = " + x);

    for (int i = 1; i<11 ; i++) {
      x =  x + y;
      System.out.println("\t\t" + x);
      y++;
    }

  }
}

//Write a program that uses a for loop to output the sum of all the integers between 10 and 20, inclusive, that is, 10 + 11 + 12 + ... + 19 + 20.
