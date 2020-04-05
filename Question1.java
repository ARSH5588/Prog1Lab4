import java.util.*;
/**
*This program will ask you to enter a sentence to detect if its a palindrome
*@author Arshjit Sansoe
*@return Valid/Invalid
*@since 2020-04-04
*/
public class Question1 {
  public static void main(String[] args) {

    System.out.println("\n\t * ~ This program outputs all the words that are PALINDROME ~ * ");

    Scanner sentence =  new Scanner(System.in);
    String palindrome = "";

    System.out.println("\n\t * ~ Enter a sentence/word of your wish ~ * ");
    String words = sentence.nextLine();
    //All the letters will be lowercase
    words = words.toLowerCase();
    //Replace symbols  and letters by space
    words = words.replaceAll("[^A-Z ]","");
    //for loop = checks the index of letters
    for (int i = words.length()-1;i>=0;i--) {
      palindrome =  palindrome + words.charAt(i);
    }
    //if palindrome is equal to words then this is executed
    if (words.equals(palindrome)) {
      System.out.println("Its a palindrome.");
    }
    else {
      System.out.println("Its not a palindrome.");
    }

  }
}

/*Write a program that receives a word as an input
*from the user and checks if it is a palindrome: if it
*reads the same backward as forward. A few examples are
*"civic", "radar" and "level". To make your program more
*advanced, ignore punctuation, capitalization, and spaces,
*and recognize sentences as "A man, a plan, a canal - Panama",
"Murder for a jar of red rum" and "Madam, I’m Adam".*/
