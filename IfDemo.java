/*
  Demonstrate the IF control statement
  Call this file IfDemo.java
*/
class IfDemo {
  public static void main(String args[]) {
    int a, b, c;

    a = 2;
    b = 3;

    if (a < b) System.out.println("a is less than b.");
    if (a == b) System.out.println("won't print anything");

    // Newline
    System.out.println();

    c = b - a;
    System.out.println(" c contains the value1.");
    if (c >= 0) System.out.println(" c is not negative.");
    if (c < 0) System.out.println("c is negative");
  }
}
