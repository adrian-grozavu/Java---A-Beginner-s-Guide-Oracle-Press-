/*
Compute the hypotenuse, given the length of the two opposing sides  | Use the Pythagorean theorem
*/
class Hypot {
  public static void main(String args[]) {
    double x, y, z;

    x = 3;
    y = 4;
    // The sqrt() method is preceded by the name of the class of which it is a member
    z = Math.sqrt(x*x + y*y);
    // Print result
    System.out.println("hypotenuse is: " + z);
  }
}
