import mypackage.Queue;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(6);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(10);
		queue.enqueue(30);
		System.out.println("Original queue:");
		queue.printQueue();
		queue.removeDuplicates();
		System.out.println("After removing duplicates:");
		queue.printQueue(); 
		queue.reverse();
		System.out.println("After reversing:");
		queue.printQueue();
		queue.randomize();
		System.out.println("After randomizing:");
		queue.printQueue(); 
		queue.swapData(20, 30);
		System.out.println("After swapping 20 and 30:");
		queue.printQueue(); 
		queue.swapindex(0, 2);
		System.out.println("After swapping indices 0 and 2:");
		queue.printQueue(); 
		queue.sort();
		System.out.println("After sorting:");
		queue.printQueue();
		System.out.println("Sum: " + queue.sum());
		System.out.println("Average: " + queue.average());
		System.out.println("Repeated 20: " + queue.repeated(20));
	}
}
