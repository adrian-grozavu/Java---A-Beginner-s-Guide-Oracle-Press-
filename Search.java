// Search for an element in an unsorted array using a for-each loop

class Search {
  public static void main(String args[]) {

    int nums[] = {7, 10, 3, 14, 22};
    int val = 7;
    boolean found = false;

    for (int x: nums) {
      if (x == val) found = true;
      break;
    }
    if (found) System.out.println("Value found");
  }
}
