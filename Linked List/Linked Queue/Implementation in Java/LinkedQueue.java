import mypackage;

// The LinkedQueue Implementation
public class LinkedQueue {
	int size;          // the counter of LinkedQueue
	Node rear;
	Node front;
    
    // LinkedQueue constractor
	public LinkedQueue() {
		this.size = 0;
		this.rear = null;
		this.front = null;
	}

	// Adding element in the LinkedQueue
	public void enqueue(int element) {
		Node temp = new Node(element);

		if(rear == null) {   // if the list is empty make the rear and front node copy temp
			rear = front = temp;
			return;
		}

		rear.next = temp;       // assign the next to the temp 
		rear = temp;        //  assign the temp to the top
		size++;          // counter to increase the size
	}

	// Removing  first element from the top
	public int dequeue() {
	    // condation to check if the queue is empty or not
		if(front == null)
			return -1;

		int dequeued = front.data; 
		front = front.next;   // assign the next of the front into front to make the pointer look at the next
		size--;          // decrease the counter after removing the element

		// If Queue is Empty
		if (front == null)
			rear = null;

		return dequeued;
	}

	// peek function to return the last element without removing it
	public int peek() {
	    // condation to check if the queue is empty or not
		if(front == null)
			return -1;
		return this.front.data;     // return the data of the front
	}

	// size function to return the size of the stack
	public int size() {
	    // condation to check if the queue is empty or not
		if(front == null)
			return -1;
		return this.size;
	}

	// Prints the stack elements with indices
	public void print() {
	    // condation to check if the queue is empty or not
		if(front == null)
			return;
		Node temp = front;
		int i = 0;
		while(temp != null) {
			System.out.println("[" + (i++) + "]" + "->" + temp.data);
			temp = temp.next;
		}
	}

	// isEmpty function to check if stack is full or not
	public boolean isEmpty() {
	    // condation to check if the queue is empty or not
		if(front == null)
			return true;
		return false;
	}

	// isFull function to check if stack is full or not
	public boolean isFull() {
	    // condation to check if the queue is empty or not
		if(front == null)
			return false;
		return true;
	}

	// Clears all nodes in the stack
	public void clear() {
		this.size = 0;
		this.rear = null;
		this.front = null;
	}
}
