/*  Guess the letter Game */

class GuessLetter {
  public static void main(String args[]) throws java.io.IOException {

    char ch, answer = 'k';

    System.out.println("I'm thinking of a letter between A an Z.");
    System.out.print("Can you guess it: ");

    // read character from keyboard
    ch = (char) System.in.read();

    // check the character against the answer
    if (ch == answer) System.out.println("** Right **");
  }
}
