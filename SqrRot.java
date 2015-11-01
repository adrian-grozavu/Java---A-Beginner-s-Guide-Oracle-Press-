/*
  Print the square root of the numbers between 1 and 99.
  Display the rounding error for each square root.
*/

class SqrRoot {
  public static void main(String args[]) {
    double num, sroot, rerr;

    for (num = 1.0; num <= 100; num++) {
      sroot = Math.sqrt(num);
      System.out.println("The square root of " + num + " is " + sroot);

      // Compute rounding error
      rerr = num - (sroot * sroot);
      System.out.println("Rounding error is: " + rerr);
      System.out.println();
    }
  }
}
