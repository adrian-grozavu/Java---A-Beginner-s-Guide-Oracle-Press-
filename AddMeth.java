class Vehicle {
  int passangers; // number of passangers
  int fuelcap;  // fuel capacity
  int mpg;  // fuel consumption in miles per galon

  // Method displays the range of the vehicle
  void range() {
    System.out.println("Range is " + fuelcap * mpg);
  }
}

class AddMeth {
  public static void main(String args[]) {
    Vehicle minivan = new Vehicle();
    Vehicle sportscar = new Vehicle();

    int range1, range2;
    // Assign values to fields in minivan
    minivan.passangers = 21;
    minivan.fuelcap = 14;
    minivan.mpg = 21;
    // Assign values to fields in sportscar
    sportscar.passangers = 8;
    sportscar.fuelcap = 18;
    sportscar.mpg = 19;

    System.out.println("Minivan can carry " + minivan.passangers + ". ");
    minivan.range();
    System.out.println("Sportscar can carry " + sportscar.passangers + ". ");
    sportscar.range();
  }
}
