class QDemo2 {
  public static void main(String[] args) {
      // construct a 10 element empty queue
      Queue q1 = new Queue(10);

      // construct queue from array
      char name[] = {'T', 'o', 'm'};
      Queue q2 = new Queue(name);

      int i;
      char ch;
      // Put characters into q1
      for (i = 0; i < 10; i++)
        q1.put((char) ('A' + i));

      // construct queue from another queue
      Queue q3 = new Queue(q1);

      // Show all the queues
      System.out.println("Contents of q1: ");
      for (i = 0; i < 10; i++) {
        ch = q1.get();
        System.out.print(ch);
      }
      System.out.println();
      //---------
      System.out.println("Contents of q2: ");
      for (i = 0; i < 3; i++) {
        ch = q2.get();
        System.out.print(ch);
      }
      System.out.println();
      //----------
      System.out.println("Contents of q3: ");
      for (i = 0; i < 10; i++) {
        ch = q3.get();
        System.out.print(ch);
      }
      System.out.println();
  }
}
