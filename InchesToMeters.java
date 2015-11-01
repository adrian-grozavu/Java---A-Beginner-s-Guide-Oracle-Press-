/*
  Display a conversion table of inches to meters
*/
class InchesToMeters {
  public static void main(String args[]) {
    double inches, meters;
    int counter = 0;

    for (inches = 1; inches < 144; inches++) {
      meters = inches * 39.37;
      System.out.println(inches + " inches equals " + meters + " meters");
      counter++;
      if (counter == 12) {
        System.out.println();
        counter = 0;
      }
    }
  }
}
