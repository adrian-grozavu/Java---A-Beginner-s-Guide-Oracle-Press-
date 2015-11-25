class Pwr {
  double b;
  int e;
  double val;

  Pwr(double base, int exp) {
    this.b = base;
    this.e = exp;
    this.val = 1;
    if (exp == 0) return;
    for ( ; exp > 0; exp--) val = val * base;
  }

  double get_pwr() {
    return this.val;
  }
}

class PwrDemo {
  public static void main(String[] args) {
    Pwr x = new Pwr(4.0, 2);
    Pwr y = new Pwr(2.5, 1);
    Pwr z = new Pwr(5.7, 0);

    System.out.println(x.b + "raised to the " + x.e + "is " + x.get_pwr());
    System.out.println(y.b + "raised to the " + y.e + "is " + y.get_pwr());
    System.out.println(x.b + "raised to the " + z.e + "is " + z.get_pwr());
  }
}
