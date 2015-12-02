// Implement a fail-soft-array

class FailSoftArray {
  private int a[];  // reference to array
  private int errval; // value to return in get() fails
  public int length;

  // Construct array given its size
  public FailSoftArray(int size, int errv) {
    a = new int[size];
    errval = errv;
    length = size;
  }
  // Return value at given index
  public int get(int index) {
    if (indexOK(index)) return a[index];
    return errval;
  }
  public boolean put(int index, int val) {
    if (indexOK(index)) {
      a[index] = val;
      return true;
    }
    return false;
  }
  // Returns true if index is within bounds
  private boolean indexOK(int index) {
    if (index >= 0 && index < length)
      return true;
    return false;
  }
}
// Demonstrate the fail-soft array
public class FSDemo {
  public static void main(String args[]) {
      FailSoftArray fs = new FailSoftArray(10, -1);
      int x;
      // Fail quietly
      for (int i = 0; i < (fs.length * 2); i++)
        fs.put(i, i * 2);
      for (int i = 0; i < (fs.length * 2); i++) {
        x = fs.get(i);
        if (x != -1)  System.out.println(x);
      }
  }
}
