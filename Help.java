/* Build a simple Java Help System */

class Help {
  public static void main(String args[]) throws java.io. IOException {
    // Display menu | Choose control statement for which to show syntax
    System.out.println("Help on: \n 1. if \n 2. switch");
    System.out.println("Choose one: ");

    // Get user selection
    char choice = (char) System.in.read();

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
