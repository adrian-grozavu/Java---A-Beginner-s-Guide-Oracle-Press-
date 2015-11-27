// Play with the String class

class StringDemo {
  public static void main(String args[]) {
    // Create 3 string objects in different ways
    String str1 = new String("Java strings are objects");
    String str2 = "They are constructed in different ways.";
    String str3 = new String(str2);

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
  }
}
