// Ch5. Implement a queue data structure

class Queue {
  char q[]; // array to hold the queue
  int putloc, getloc; // put and get indices
  // putloc: the index where the next element will be stored
  // getloc: indicates the location of the next element to be retrieved.

  // constructor method
  Queue (int size) {
    q = new char[size];  // allocate memory for the queue
    putloc = getloc = 0;
  }
  // Get method
  void put(char ch) {
    if (putloc == q.length) {
      System.out.println("Queue is full");
      return;
    }
    q[putloc++] = ch;
  }
  // Put method
  char get() {
    if (getloc == putloc) {
      System.out.println("Queue is empty");
        return (char) 0;
    }
    return q[getloc++];
  }
}
// Demonstrate the Queue class

class QDemo {
  public static void main(String[] args) {
    char ch;
    int i;
    // Declare and instantiate 2 queue objects
    Queue bigQ = new Queue(100);
    Queue smallQ = new Queue(4);

    System.out.println("Using bigQ to store the alphabet");
    for (i = 0; i < 26; i++)
      bigQ.put((char) ('A' + i));

    // rETRIEVE AND DISPLAY elements from bigQ
    System.out.println("Contents of bigQ");
    for (i = 0; i < 26; i++) {
      ch = bigQ.get();
      if (ch != (char) 0) System.out.print(ch);
    }
    System.out.println("\n");
  }
}
