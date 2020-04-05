import java.util.*;
/**
*This program will detect if the email the user typed is valid or invalid
*@author Arshjit Sansoe
*@return Valid/Invalid email
*@since 2020-04-04
*/
public class Question2 {
  public static void main(String[] args) {

  Scanner address = new Scanner(System.in);

  System.out.println("Please enter an email address");
  String email = address.nextLine();
    //email.lenght() checks for the lenght of the email address
    for (int i = 0;i < email.length();i++) {
      //If this is in the email address then it will be valid
      if ((email.contains("@")) && (email.contains("."))) {
        System.out.println("Valid email");
        //Stops the program
        System.exit(0);
      }
      //If the if statement doesn't imply then it executes else
      else {
        System.out.println("Invalid email");
      }
    }

  }
}
