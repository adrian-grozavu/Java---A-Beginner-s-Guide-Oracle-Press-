class FDemo {

  int x;

  // COnstructor method
  FDemo(int i) {
    x = i;
  }
  // Finalize method. Called when object is recycled
  protected void finalize() {
    System.out.println("Finalizing " + x);
  }
  // Generate an oject that is immediately destroyed
  void generator(int i) {
    FDemo o = new FDemo(i);
  }

}

class FInalize {
  public static void main(String[] args) {
    int count;

    FDemo ob = new FDemo(0);

    // Generate a large number of objects
    for (count = 1; count < 1000000; count++)
    ob.generator(count);
  }
}
