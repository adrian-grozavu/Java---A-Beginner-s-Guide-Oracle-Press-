// String operations in Java

class StrOps {
  public static void main(String args[]) {
    String str1 =  "When it comes to programming, Java is no. 1";
    String str2 = new String(str1);
    String str3  = "Java strings are powerful";

    // Length method - obtains the length of a string
    System.out.println("Length of str1: " + str1.length());

    // Display str1, one character at a times
    for (int i = 0; i < str1.length(); i++) {
      System.out.print(str1.charAt(i) + " ");
    }
    System.out.println();

    // isEquals
    if (str1.equals(str2))
      System.out.println("str1 and str2 are equal");
    else
      System.out.println("str1 and str2 are not equal");
  }
}
