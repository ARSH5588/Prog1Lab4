import java.util.*;
/**
*This program will find all the multiples of 7 in the range of 33 & 97
*@author Arshjit Sansoe
*@return count all the multiples of 7 between 33 & 97
*@since 2020-04-02
*/
public class Multiples {
  public static void main(String[] args) {
    //Variables
    int z = 97/7;
    z++;
    final int FACTOR = 7;
    int a = 1;

    System.out.println("This program will find all the multiples of 7 in the range of 33 & 97 ");
    //Start of the for loop
    for (int i = 33/FACTOR; i < z ;i++) {
      int b = FACTOR * i;
      System.out.println(a + ")  " + " 7 * " + i +  " = " + b);
      a++;
    }
    a--;
    //Amount of multiples of 7 are between 33 and 97
    System.out.println("\nCount = " + a);
  }
}

//Write a program that uses a for loop to count how many multiples of 7 are between 33 and 97, inclusive
