package mypackage;
import java.util.Random;


// Circular Queue Class
public class CircularQueue {
	protected int size;
	protected int rear;
	protected int front;
	protected int[] array;

	// Define the Queue
	public CircularQueue(int size) {
		this.rear = -1;
		this.front = -1;
		this.size = size;
		this.array = new int[size];
	}

	// Insertion functions
	// Queue enqueue function to append the element in the queue
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue overflow.");
			return;
		}

		if(isEmpty())
			front = rear = 0;
		else
			rear = (rear + 1) % size;

		array[rear] = data;
	}

	// Deletion functions
	// Queue dequeue function to delete the first element in the queue
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue underflow.");
			return -999;
		}

		int data = array[front];

		if(front == rear)
			front = rear = -1;
		else
			front = (front + 1) % size;

		return data;
	}

	// Queue clear function to clear all the queue elements
	public void clear() {
		front = rear = -1;
	}



	// Search functions
	// Queue getFront to get the front of the Queue
	public int getFront() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -999;
		}

		return array[front];
	}

	// Queue getRear to get the rear of the Queue
	public int getRear() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -999;
		}

		return array[rear];
	}

	// Queue getMiddle to get the middle of the Queue
	public int getMiddle() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -999;
		}
		int middle = (front + (getSize() - 1) / 2) % size;
		return array[middle];
	}

	// Queue getSize to get the size of the Queue
	public int getSize() {
		if(isEmpty())
			return 0;

		if(rear >= front)
			return rear - front + 1;
		else
			return size - front + rear + 1;
	}

	// Queue getElement to get the specific element from the index in the Queue
	public int getElement(int index) {
		if (index < 0 || index >= getSize()) {
			System.out.println("Index out of boundries.");
			return -1;
		}

		return array[((front + index) % size)];
	}

	// Queue getIndex to get the index of specific element in the Queue
	public int getIndex(int element) {
		if (isEmpty())
			return -1;

		for(int i = 0; i < getSize(); i++) {
			int index = (front + i) % size;
			if(array[index] == element)
				return i;
		}

		return -1;
	}

	// Queue isFound to check the Queue's element is found or not
	public boolean isFound(int element) {
		if (isEmpty())
			return false;

		for(int i = front; i < getSize(); i++) {
			int index = (front + i) % size;
			if(array[index] == element)
				return true;
		}

		return false;
	}

	//Stats functions
	//Queue sum function to get the sum of the Queue
	public int sum() {
		if(isEmpty())
			return -1;

		int sum = 0;

		for(int i = 0; i < getSize(); i++) {
			int index = (front + i) % size;
			sum += array[index];
		}

		return sum;
	}

	// Queue average function to get the average of the Queue
	public double average() {
		if(isEmpty())
			return -1;

		// return (double) sum() / getSize();  cancel the code below


		int sum = 0;

		for(int i = 0; i < getSize(); i++) {
			int index = (front + i) % size;
			sum += array[index];
		}

		return (double)sum / getSize();
	}

	// Queue repeated function to return number of repetion of num in the Queue
	public int repeated(int data) {
		if (isEmpty())
			return -1;

		int repeation = 0 ;

		for(int i = 0; i < getSize(); i++) {
			int index = (front + i) % size;
			if(array[index] == data)
				repeation++;
		}

		return repeation;
	}

	// Queue max function to return the maxmuim element
	public int max() {
		if(isEmpty())
			return -999;

		int max = array[front];

		for(int i = 0; i < getSize(); i++) {
			int index = (front + i) % size;
			if(max < array[index])
				max = array[index];
		}

		return max;
	}

	// Queue min function to return the minimuim element
	public int min() {
		if(isEmpty())
			return -999;

		int min = array[front];

		for(int i = 0; i < getSize(); i++) {
			int index = (front + i) % size;
			if(min > array[index])
				min = array[index];
		}

		return min;
	}



	//Utilities functions
	// Queue printQueue function to print all the Queue elements
	public void printQueue() {
		if(isEmpty())
			return;

		for(int i = 0; i < getSize(); i++) {
			int index = (front + i) % size;
			System.out.println("[" + i + "]" + " -> " + array[index]);
		}
	}

	// Queue removeDuplicates function to remove the duplictaes in the Queue
	public void removeDuplicates() {
		if(isEmpty())
			return;

		sort();

		int j = 0;
		int[] temp = new int[getSize()];
		temp[j] = array[front];
		j++;


		for(int i = 1; i < getSize(); i++) {
			int index = (front + i) % size;

			if(array[index] != temp[j - 1])
				temp[j++] = array[index];
		}

		clear();

		for(int i = 0; i < j; i++)
			enqueue(temp[i]);
	}

	// Queue reverse function to reverse the Queue
	public void reverse() {
		if(isEmpty())
			return;

		int currentSize = getSize();

		for(int i = 0; i < currentSize / 2; i++) {
			int index = (front + i) % size;
			int index2 = (rear - i + size) % size;
			int temp = array[index];
			array[index] = array[index2];
			array[index2] = temp;
		}
	}

	//Queue sort function to sort the Queue
	public void sort() {
		if(isEmpty())
			return;

		boolean swapped;

		for(int i = 0; i < getSize() - 1; i++) {
			swapped = false;

			for(int j = 0; j < getSize() - i - 1; j++) {
				int index = (front + j) % size;
				int nextIndex = (front + j + 1) % size;

				if(array[index] > array[nextIndex]) {
					int temp = array[index];
					array[index] = array[nextIndex];
					array[nextIndex] = temp;
					swapped = true;
				}
			}

			if(!swapped)
				break;
		}
	}

	// Queue randomize to randomize the Queue
	public void randomize() {
		if(isEmpty())
			return;

		Random rand = new Random();

		for (int i = getSize() - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);
			int index1 = (front + i) % size;
			int index2 = (front + j) % size;
			int temp = array[index1];
			array[index1] = array[index2];
			array[index2] = temp;
		}
	}

	// Queue swapData to swap two elements in the Queue
	public void swapData(int data1, int data2) {
		if(isEmpty())
			return;

		int index1 = -1;
		int index2 = -1;

		for(int i = 0; i < getSize(); i++) {
			int index = (front + i) % size;
			if(data1 == array[index])
				index1 = index;
			else if(data2 == array[index])
				index2 = index;
		}

		if(index1 != -1 && index2 != -1) {
			int temp = array[index1];
			array[index1] = array[index2];
			array[index2] = temp;
			return;
		}
		else
			return;
	}

	// Queue swapindex to swap the elements in the given index in the Queue
	public void swapindex(int index1, int index2) {
		if(isEmpty())
			return;

		if (index1 < 0 && index1 >= getSize() || index2 < 0 && index2 >= getSize()) {
			System.out.println("Index out of boundries.");
			return;
		}

		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	// Queue isEmpty to check if the queue is empty
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	// Queue isFull to check if the queue is full
	public boolean isFull() {
		return (rear + 1) % size == front || (front == 0 && rear == size - 1);
	}
}
