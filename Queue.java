class Queue {
  private char q[]; // array to hold the queue
  private int putloc, getloc; // put and get indices
  // putloc: the index where the next element will be stored
  // getloc: indicates the location of the next element to be retrieved.

  // constructor method
  Queue (int size) {
    q = new char[size];  // allocate memory for the queue
    putloc = getloc = 0;
  }
  // constructs a queue from a queue. The new queue will be an identical copy of the original
  Queue(Queue ob) {
    // Initialize to the values contained in the ob parameter
    putloc = ob.putloc;
    getloc = ob.getloc;
    q = new char[ob.q.length];
    // copy elements
    for (int i = getloc; i < putloc; i++)
      q[i] = ob.q[i];
  }
  // constructor that initializes the queue from a char array
  Queue(char[] a) {
      putloc = getloc = 0;
      q = new char[a.length];
      for (int i = 0; i < a.length; i++) put(a[i]);
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
