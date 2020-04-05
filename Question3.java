//Importing the util import
import java.util.*;
/**
*This program will ask you to guess a number between 0 and 100
*@author Arshjit Sansoe
*@return Correct/Incorrect
*@since 2020-04-04
*/
public class Question3 {
  public static void main(String[] args) {

    do {
      //Variables
      double randomNumber = Math.round(Math.random()*100) + 1;
      double playAgain;
      int x = 1;

      System.out.println(" This program will ask you to guess a number between 0 and 100 ");

      System.out.println(randomNumber);

      //Scanner used
      Scanner random = new Scanner(System.in);
      //Asked the user to guess the number
      System.out.println("\n\t Enter your guess ");
      double numberChosen = random.nextDouble();

      for (int i = 1;i < 10;i++) {
        //It executes if the if statement is true
        if (randomNumber == numberChosen) {
          System.out.println("\n\t * ~ Correct Answer ~ * ");
          System.out.println("\t * ~ Would you like to play again ? ~ * ");
          System.out.println("\t * ~ Press 1 to replay or 0 to exit ~ * ");
          playAgain=random.nextInt();
          if(playAgain!=1)
          System.exit(0);
          i = 10;
        }
        //It executes if the if statement in the for loop doesn't imply
        else {
          System.out.println("Guess again:");
          numberChosen = random.nextDouble();
          x += 1;
        }
        //Executes if the x less than or equal to 10
        if (x >= 10) {
          System.out.println("\n\t\t * ~ Wrong Answer ~ * ");
          System.out.println("\nYou have 0 tries remaining to guess the number,press 0 to exit");
          System.exit(0);
        }
      }
    }
    while(true);

  }
}
/*Write a program that generates a random number between 0 and 100 and asks the
*user to guess it.The user can have at maximum 10 trials. If the number is
*guessed, the user should be asked if *she/he wants to play again. If the
*number is not guessed and 10 trials were used, the user is *not lucky, the
program should terminate with a proper message.*/
