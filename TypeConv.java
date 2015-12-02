// Demonstrate automatic type conversion of method parameters

class Overload2 {
  void f(byte x) {
    System.out.println("Inside f(byte): " + x);
  }
  void f(int x) {
    System.out.println("Inside f(int): " + x);
  }
  void f(double x) {
    System.out.println("Inside f(double): " + x);
  }
}

class TypeConv {
  public static void main(String args[]) {
    Overload2 obj = new Overload2();
    int i = 10;
    double d = 10.7;
    byte b = 17;
    float f = 11.2F;
    short s = 2;

    // Call the f method on obj.
    obj.f(i);
    obj.f(d);
    obj.f(b);
    obj.f(f);
    obj.f(s);
  }
}
