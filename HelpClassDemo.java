/* Build a simple Java Help System
  Convert the Help System into a Help class
*/
class Help {
  void helpOn(int what) {
    switch (what) {
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
      case '6':
      // BREAK syntax
        System.out.println("**************************\n");
        System.out.println("The break:\n");
        System.out.println("break; or break label;");
        break;
      // COntinue Syntax
      case '7':
        System.out.println("**************************\n");
        System.out.println("The continue:\n");
        System.out.println("continue; or continue label;");
        break;
  }
}
  void showMenu() {
    // Display menu | Choose control statement for which to show syntax
    System.out.println("Help on: \n 1. if \n 2. switch\n 3. for\n 4. while\n 5. do-while\n 6. break\n 7. continue");
    System.out.println("Choose one (q to quit) ");
  }
  boolean isValid(int ch) {
    if (ch < '1' | ch > '7' & ch != 'q') return false;
    else return true;
  }
}

class HelpClassDemo {
  public static void main(String args[]) throws java.io. IOException {
    char choice, ignore;  // The choice variable will hold the character entered
    Help hlpobj = new Help();
    // infinite loop
    for (;;) {
      do {
        hlpobj.showMenu();
        // Get user selection
        choice = (char) System.in.read();
        do {
          ignore = (char) System.in.read();
        } while (ignore != '\n');

      } while (!hlpobj.isValid(choice));
  //**********************************************
      if (choice == 'q') break;
      System.out.println("\n");
      hlpobj.helpOn(choice);
      }
    }
  }
