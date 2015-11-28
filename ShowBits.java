// Display the bits within a byte in binary format

public class ShowBits {
  public static void main(String args[]) {
    int t;
    byte val = 123;

    // Succesively test each bit in val starting from MSB to LSB, to determine whether it's on or off
    for (t = 128; t > 0; t/=2) {
      if ((val & t) != 0)
        System.out.print("1");
      else
        System.out.print("0");
    }
  }
}
