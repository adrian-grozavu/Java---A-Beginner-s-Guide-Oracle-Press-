// Use a string to control a switch statement

public class StringSwitch {
  public static void main(String args[]) {
    String command = "cancel";

    switch (command) {
        case "connect":
          System.out.println("COnnecting");
          break;
        case "cancel":
          System.out.println("Cancelling");
          break;
        case "disconnect":
          System.out.println("Disconnecting");
        default:
          System.out.println("command error");
          break;
    }
  }
}
