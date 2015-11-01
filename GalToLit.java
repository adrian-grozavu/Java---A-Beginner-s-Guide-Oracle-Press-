/*
  This program converts gallons to liters
  Call this program GalToLit.java
*/
class GalToLit {
  public static void main(String args[]) {

    double gallons;
    double liters;

    gallons = 10;
    liters = gallons * 3.7854;  // convert to liters

    System.out.println(gallons + " gallons is" + liters + " liters.");
  }
}
