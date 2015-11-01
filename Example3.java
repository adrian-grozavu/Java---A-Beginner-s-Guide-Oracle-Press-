/*
This program illustrates the difference between int and double
Call this file Example3.java
*/
class Example3 {
  public static void main(String args[]) {
    int var;    // Declare an int variable
    double x;   // Declare a floating-point variable

    // Assign values
    var = 10;
    x = 10.0;

    System.out.println("Original value of var: " + var);
    System.out.println("Original value of x: " + x);
    System.out.println();   // Print a blank line

    // Divide both variables by 4
    var = var / 4;
    x = x / 4;

    System.out.println("var after division: " + var);
    System.out.println("x after division: " +x);
  }
}
