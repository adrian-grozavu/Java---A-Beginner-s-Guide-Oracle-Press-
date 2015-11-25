class Bubble {
  public static void main(String[] args) {
    int nums[] = {2, 27, -1, 4, 9, 22, 14, 17, 11, 27};
    int a,b, t;
    int size;

    size = 10;  // number of elements to sort

    // display original array
    System.out.println("Original array is: ");
    for (int i =0; i < size; i++) {
      System.out.print(" " + nums[i]);
    }
    System.out.println();

    // Bubble Sort algorithm
    for (a = 1; a < size; a++) {
      for (b = size - 1; b >= a; b--) {
        if (nums[b - 1] > nums[b]) {
          // exchange elements
          t = nums[b - 1];
          nums[b - 1] = nums[b];
          nums[b] = t;
        }
      }
    }

    // display sorted array
    System.out.println("Sorted array is: ");
    for (int i =0; i < size; i++) {
      System.out.print(" " + nums[i]);
    }
    System.out.println();

  }
}
