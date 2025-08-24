package mypackage;


// Implementation of the Queue
public class Queue {
	protected int[] array;
	protected int capacity;
	protected int front;
	protected int rear;
	protected int size;

	// Constructor that defines the Queue
	public Queue(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}


	// Queue Basic Functions
	// Queue enqueue function that add element in the last index
	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue overflow.");
			return;
		}

		rear++;
		array[rear] = data;
		size++;
	}

	// Queue dequeue function that returns and remove the first element
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue underflow.");
			return -1;
		}

		int data = array[front];
		front++;
		size--;
		return data;
	}

	// Queue clear function to clear the Queue
	public void clear() {
		front = size = 0;
		rear = -1;
	}

	// Queue peek function that returns the first(front) element
	public int peek() {
		if (isEmpty())
			return -1;

		return array[front];
	}

	// Queue isFull function to check if queue is full
	public boolean isFull() {
		return size == capacity;
	}

	// Queue isEmpty function to check if queue is empty
	public boolean isEmpty() {
		return size == 0;
	}


	// Queue printQueue function that prints all Queue elements
	public void printQueue() {
		if (isEmpty())
			return;

		for (int i = front; i <= rear; i++)
			System.out.print("[" + i + "]" + " -> " + array[i]);	
	}
}
