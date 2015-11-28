// Create a simple cypher program, to encode and decode a message

public class Encode {
  public static void main(String args[]) {
    // The message to encode
    String msg = "Emily";
    // Encoded message
    String encoded_msg = "";
    // Decoded message. Must be identical to the original
    String decoded_msg = "";
    // Key to de/encode the message with
    int key = 73;

    System.out.println("Original message: " + msg);

    // Encoding phase
    for (int i = 0; i < msg.length(); i++)
      encoded_msg = encoded_msg + (char) (msg.charAt(i) ^ key);
    System.out.println("Encoded message: " + encoded_msg);

    // Decoding phase
    for (int i = 0; i < encoded_msg.length(); i++)
      decoded_msg = decoded_msg + (char) (encoded_msg.charAt(i) ^ key);
    System.out.println("Decoded message:" + decoded_msg);  
  }
}
