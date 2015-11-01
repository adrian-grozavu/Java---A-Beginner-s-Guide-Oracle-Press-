/*
  Demonstrate dynamic initialization
  Compute the vlume of a cylinder given the radius of its base and height
*/
class DynInit {
  public static void main(String args[]) {
    double radius = 4, height = 5;

    // Dynamically initialize volume, at runtime
    double volume = 3.14 * radius * radius * height;
    System.out.println("Volume is: " + volume);
  }
}
