/*
The ASCII lowercase letters are separated from the uppercase letters by 32.
Thus, to convert a lowercase letter to uppercase, subtract 32 from it.
Use this information to write a program that reads characters from the keyboard.
Have it convert all lowercase letters to uppercase, and all uppercase letters to lowercase, displaying the result.
Make no changes to any other character. Have the program stop when the user enters a period.
At the end, have the program display the number of case changes that have taken place.
*/

public class AsciiLowerUpper {
  public static void main(String args[]) throws java.io.IOException {
    char character, upperChar, lowerChar;
    do {
      System.out.println("Press a character from from the alphabet");
      character = (char) System.in.read();
    } while (! ((character >= 'a' & character <= 'z') | (character >= 'A' & character <= 'Z')) );

    // If lowercase, convert to uppercase
    if (character >= 'a' & character <= 'z')  {
      upperChar = (char) (character - 32);
      System.out.println("The corresponding uppercase character is: " + upperChar);
    }
    else {
      lowerChar = (char) (character + 32);
      System.out.println("The corresponding lowercase character is: " + lowerChar);
    }
  }
}
