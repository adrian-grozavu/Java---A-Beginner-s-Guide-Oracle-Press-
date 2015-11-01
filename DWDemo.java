/* Demonstrate the Do-While Loop
  Guessing game: Loop until you guess the letter
*/

class DWDemo {
  public static void main(String args[]) throws java.io.IOException {
    char ch;

    do {
      System.out.println("Press a key followed by ENTER");
      ch = (char) System.in.read();
    }
    while (ch != 'q');
  }
}
