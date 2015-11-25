/* Build a simple Java Help System
  Version 2: Add syntax for the: for, while and do-while loops
  Uses a do-while construct to process a menu selection */
  
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
//**********************************************
    switch (choice) {
      // IF syntax
      case '1':
        System.out.println("**************************\n");
        System.out.println("The if control statement:\n");
        System.out.println("if (condition) statement\nelse statement");
        System.out.println("**************************\n");
        break;
      // SWITCH syntax
      case '2':
        System.out.println("**************************\n");
        System.out.println("The switch control statement:\n");
        System.out.println("switch (expression) {\n case constant: statement sequence\nbreak;\n...}");
        System.out.println("**************************\n");
        break;
      // FOR syntax
      case '3':
      System.out.println("**************************\n");
      System.out.println("The for loop:\n");
      System.out.println("for (initialization; condition; iteration)");
      System.out.println("\t statement;");
        break;
      // WHILE syntax
      case '4':
      System.out.println("**************************\n");
      System.out.println("The while loop:\n");
      System.out.println("while (condition) statement;");
        break;
      // DO-WHILE Syntax
      case '5':
      System.out.println("**************************\n");
      System.out.println("The do-while loop:\n");
      System.out.println("do {\n statement");
      System.out.println("while (condition);");
        break;
    }
  }
}
