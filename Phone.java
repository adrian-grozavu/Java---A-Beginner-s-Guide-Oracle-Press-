// A simple automated telephone directory
// Pass a name as a command-line argument, and return its phone number, if found.

public class Phone {
  public static void main(String[] args) {
      // 2D array
      String numbers[][] = {
        {"Carcetti", "516-7777"},
        {"McNulty", "516-4393"},
        {"Bodie", "336-8927"}
      };
      int i;

      if (args.length != 1)
        System.out.println("Usage: java Phone <name>");
      else {
        for (i = 0; i < numbers.length; i++) {
          if (numbers[i][0].equals(args[0])) {
            System.out.println(numbers[i][1]);
            break;
          }
        }
        if (i == numbers.length)
          System.out.println("Name not found");

      }
  }
}
