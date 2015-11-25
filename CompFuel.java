class Vehicle {
  int passangers; // number of passangers
  int fuelcap;  // fuel capacity
  int mpg;  // fuel consumption in miles per galon

  // Method returns the range of the vehicle
  int range() {
    return fuelcap * mpg;
  }

  // Compute the fuel needed for a given distance
  double fuelneeded (int miles) {
    return (double) miles / mpg;
  }
}

class CompFuel {
  public static void main(String args[]) {
    // Create 2 Vehicle objects
    Vehicle minivan = new Vehicle();
    Vehicle sportscar = new Vehicle();

    double gallons;
    int dist = 257;

    // Assign values to fields in minivan
    minivan.passangers = 21;
    minivan.fuelcap = 14;
    minivan.mpg = 21;
    // Assign values to fields in sportscar
    sportscar.passangers = 8;
    sportscar.fuelcap = 18;
    sportscar.mpg = 19;

    gallons = minivan.fuelneeded(dist);
    System.out.println("To drive " + dist + " miles, minivan needs " + gallons + " gallons of fuel.");
    gallons = sportscar.fuelneeded(dist);
    System.out.println("To drive " + dist + " miles, sportscar needs " + gallons + " gallons of fuel.");
  }
}
