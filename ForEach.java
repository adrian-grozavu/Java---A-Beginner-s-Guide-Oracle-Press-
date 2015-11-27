// Demonstrate the Enhanced for loop in Java

class ForEach {
  public static void main(String args[]) {
    int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;

    // For each loop to display and sum the values
    for (int x: nums) {
      System.out.println(" Value is: " + x);
      sum += x;
    }
    System.out.println("Sum is: " + sum);
  }
}
