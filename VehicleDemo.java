class Vehicle {
  int passangers; // number of passangers
  int fuelcap;  // fuel capacity
  int mpg;  // fuel consumption in miles per galon
}

class VehicleDemo {
  public static void main(String args[]) {
    Vehicle minivan = new Vehicle();
    int range;

    // Assign values to  fields in minivan
    minivan.passangers = 21;
    minivan.fuelcap = 14;
    minivan.mpg = 21;

    // compute the range assuming a full tank of gass
    range = minivan.fuelcap * minivan.mpg;
    System.out.println("Minivan can carry " + minivan.passangers + " with a range of " + range);
  }
}
