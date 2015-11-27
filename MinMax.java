// Ch.5 FInd the minimum and maximum value in an array

class MinMax {
  public static void main(String[] args) {
    int nums[] = new int[10];
    int min, max;

    nums[0] = -77;
    nums[1] = 24;
    nums[2] = 33;
    nums[3] = 457;
    nums[4] = 0;
    nums[5] = -1;
    nums[6] = 112;
    nums[7] = 49;
    nums[8] = 12;
    nums[9] = 2016;

    min =  max = nums[0];
    for (int i = 1; i < 10; i++) {
      if (nums[i] < min) min = nums[i];
      if (nums[i] > max) max = nums[i];
    }
    System.out.println("Min and max: " + min + " " + max);
  }
}
