package mypackage;


public class Main
{
	public static void main(String[] args) {
		Queue queue = new Queue(5);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		queue.printQueue();  
		System.out.println(queue.dequeue());  
		System.out.println(queue.peek());     
		System.out.println("Is queue empty? " + queue.isEmpty());  
		queue.clear();
		System.out.println("Is queue full? " + queue.isFull());   
	}
}
