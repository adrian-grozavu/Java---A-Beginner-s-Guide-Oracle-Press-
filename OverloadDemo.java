// Demonstrate method overloading
class Overload {
  void ov1Demo() {
      System.out.println("No parameters");
  }
  void ov1Demo(int a) {
    System.out.println("One parameter: " + a);
  }
  // 2 integer parameters
  int ov1Demo(int a, int b) {
    System.out.println("Two parameters:" + a + " " + b);
    return a + b;
  }
  // 2 double parameters
  double ov1Demo(double a, double b) {
    System.out.println("Two parameters:" + a + " " + b);
    return a + b;
  }
}

public class OverloadDemo {
  public static void main(String args[]) {
    Overload obj = new Overload();
    int resI;
    double resD;
    // call all versions of ov1Demo
    obj.ov1Demo();
    System.out.println();

    obj.ov1Demo(10);
    System.out.println();

    resI = obj.ov1Demo(7, 11);
    System.out.println("Result of ov1Demo(7, 11): " + resI);

    resD = obj.ov1Demo(2.2, 17.8);
    System.out.println("Result of ov1Demo(2.2, 17.8): " + resD);
  }
}
