/* Display truth table for Java's logical operators */

class LogicalOpTable {
  public static void main(String args[]) {
    boolean p, q;

    // Display table header
    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

    p = true; q = true;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) );
    System.out.println();
    //*******************************
    p = true; q = false;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) );
    System.out.println();
    //*******************************
    p = false; q = true;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) );
    System.out.println();
    //*******************************
    p = false; q =false;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) );
    System.out.println();
  }
}
