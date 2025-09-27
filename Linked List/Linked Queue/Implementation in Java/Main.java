import mypackage;

public class Main
{
	public static void main(String[] args) {
		LinkedQueue qeueue = new LinkedQueue();

		qeueue.enqueue(10);
		qeueue.enqueue(20);
		qeueue.enqueue(30);
		qeueue.print(); // Output: Queue: 10 20 30

		System.out.println("Dequeued: " + qeueue.dequeue()); // Output: Dequeued: 10

		qeueue.enqueue(40);
		qeueue.enqueue(50);
		qeueue.print(); // Output: Queue: 20 30 40

		System.out.println("Front item: " + qeueue.peek()); // Output: Front item: 20
		System.out.println("Size: " + qeueue.size()); // Output: Size: 3

		// checking if Queue is empty
		System.out.println("Is Queue empty: " + (qeueue.isEmpty() ? "Yes" : "No"));

		// checking if Queue is full
		System.out.println("Is Queue full: " + (qeueue.isFull() ? "Yes" : "No"));

		qeueue.clear();
		qeueue.print();
    System.out.println("\nAfter Clear:");
		// checking if Queue is empty
		System.out.println("Is Queue empty: " + (qeueue.isEmpty() ? "Yes" : "No"));

		// checking if Queue is full
		System.out.println("Is Queue full: " + (qeueue.isFull() ? "Yes" : "No"));
	}
}
