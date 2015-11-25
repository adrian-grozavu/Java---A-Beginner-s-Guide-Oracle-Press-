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
