// Understand the effects of access modifiers

class MyClass {
  private int alpha;  // private Access
  public int beta;    // public access
  int gama;           // default access

  // Getter and Setter methods
  void setAlpha(int a) {
    alpha = a;
  }
  int getAlpha() {
    return alpha;
  }
}

public class AccessDemo {
  public static void main(String args[]) {
  MyClass obj = new MyClass();

  // Access to alpha is only allowed through its accessor methods
  obj.setAlpha(10);
  System.out.println("obj.alpha is: " + obj.getAlpha());

  // alpha cannot be accessed like this
  // obj.alpha = 10;

  // OK, because beta is a public member
  obj.beta = 22;
  }
}
