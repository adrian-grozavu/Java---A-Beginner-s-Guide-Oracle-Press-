/*
  Display a conversion table of gallons to liters
  Call this file GalToLitTable.java
*/
class GalToLitTable {
  public static void main(String args[]) {
    double gallons, liters;
    int counter = 0;

    for (gallons = 1; gallons <= 100; gallons++) {
      liters = gallons * 3.7854;
      System.out.println(gallons + " gallons is: " + liters + " liters");
      // Every 10 gallons
      counter++;
      if (counter == 10) {
        System.out.println(); // Print a newline
        counter = 0;  // Reset the counter
      }
    }
  }
}
