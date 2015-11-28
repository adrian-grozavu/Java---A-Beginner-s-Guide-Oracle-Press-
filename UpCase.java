/* Transform lowercase chars inti uppercase, using bitwise operators
  by resetting the 6th bit to 0 */

  public class UpCase {
    public static void main(String args[]) {
      char ch;

      for (int i = 0; i < 10; i++) {
        ch = (char) ('a' + i);
        System.out.print(ch);

        // Turn off the 6th bit | & is bitwise AND
        ch = (char) ((int) (ch & 65503));
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }
