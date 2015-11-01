/* Build a simple Java Help System
  Version 2: Add syntax for the: for, while and do-while loops */

class Help2 {
  public static void main(String args[]) throws java.io. IOException {
    char choice, ignore;
    do {
      // Display menu | Choose control statement for which to show syntax
      System.out.println("Help on: \n 1. if \n 2. switch\n 3. for\n 4. while\n 5. do-while");
      System.out.println("Choose one: ");

      // Get user selection
      choice = (char) System.in.read();

      do {
        ignore = (char) System.in.read();
      } while (ignore != '\n');

    } while (choice < '1' | choice > '5');

    switch (choice) {
      case '1':
        System.out.println("**************************\n");
        System.out.println("The if control statement:\n");
        System.out.println("if (condition) statement\nelse statement");
        System.out.println("**************************\n");
        break;
      case '2':
        System.out.println("**************************\n");
        System.out.println("The switch control statement:\n");
        System.out.println("switch (expression) {\n case constant: statement sequence\nbreak;\n...}");
        System.out.println("**************************\n");
        break;
      default: System.out.println("Selection not found");
    } 
  }
}
