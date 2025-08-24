package mypackage;

// Implementation of Deque using circular array
class Deque {
	protected int size;            // The size index of the Deque
	protected int rear;           // The rear of the Deque
	protected int front;         // The front of the Deque
	protected int[] array;      // The circular array of the Deque
	protected int capacity;    // The maxmuim size of the Deque

	// Constractor to create the Deque
	public Deque(int capacity) {
		this.size = 0;
		this.rear = 0;
		this.front = -1;
		this.capacity = capacity;
		this.array = new int[capacity];
	}

	// Insertation functions
	// Deque insertFront to insert at the front of the Deque
	public void insertFront(int data) {
		if(size == capacity) {
			System.out.println("Deque overflow.");
			return;
		}

		if(size == 0)
			front = 0;
		else
			front = (front + capacity - 1) % capacity;

		array[front] = data;
		size++;
	}

	// Deque insertRear to insert at the rear of the Deque
	public void insertRear(int data) {
		if(size == capacity) {
			System.out.println("Deque overflow.");
			return;
		}

		if(size == 0)
			front = rear = 0;
		else
			rear = (rear + 1) % capacity;

		array[rear] = data;
		size++;
	}



	// Deletion functions
	// Deque deleteFront to delete the front of the Deque
	public int deleteFront() {
		if(size == 0) {
			System.out.println("Deque underflow.");
			return -1;
		}

		int data = array[front];

		if(size == 1) {
			rear = 0;
			front = -1;
		}
		else
			front = (front + 1) % capacity;

		size--;

		return data;
	}

	// Deque deleteRear to delete the rear of the Deque
	public int deleteRear() {
		if(size == 0) {
			System.out.println("Deque underflow.");
			return -1;
		}

		int data = array[rear];

		if(size == 1) {
			rear = 0;
			front = -1;
		}
		else
			rear = (rear - 1 + capacity) % capacity;

		size--;

		return data;
	}

	// Deque clear to clear the Queue
	public void clear() {
		if(size == 0)
			return;

		size = rear = 0;
		front = -1;
	}


	// Search functions
	// Deque getFront to get the front of the Deque
	public int getFront() {
		if(size == 0)
			return -999;

		return array[front];
	}

	// Deque getRear to get the rear of the Deque
	public int getRear() {
		if(size == 0)
			return -999;

		return array[rear];
	}

	// Deque getMiddle to get the middle element of the Deque
	public int getMiddle() {
		if(size == 0)
			return -999;

		int middle = (front + (size - 1) / 2) % capacity;

		return array[middle];
	}

	// Deque isFound function to check is the element found
	public boolean isFound(int data) {
		if(size == 0)
			return false;

		for(int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			if(array[index] == data)
				return true;
		}

		return false;
	}

	// Deque getIndex function to get the index of specific element
	public int getIndex(int element) {
		if(size == 0)
			return -1;

		for(int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			if(array[index] == element)
				return i;
		}

		return -1;
	}

	// Deque getElement function to get an element in specific index
	public int getElement(int index) {
		if(size == 0 || index < 0 || index >= size)
			return -999;

		int currentIndex = (front + index) % capacity;

		return array[currentIndex];
	}

	// Deque isFull to check is the Queue is full or not
	public boolean isFull() {
		return size == capacity;
	}

	// Deque isEmpty to check is the Queue is Empty or not
	public boolean isEmpty() {
		return size == 0;
	}


	// Stats functions
	// Deque getSize to get the size of the Queue
	public int getSize() {
		return size;
	}


	// Deque sum function to get the sum of the Queue
	public int sum() {
		if(size == 0)
			return -999;

		int sum = 0;

		for(int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			sum += array[index];
		}

		return sum;
	}

	// Deque average function to get the average of the Queue
	public double average() {
		if(size == 0)
			return -999;

		return (double)sum() / size;
	}

	// Deque repeated function to return number of repetion of num in the Queue
	public int repeated(int data) {
		if(size == 0)
			return -1;

		int repeation = 0;

		for(int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			if(array[index] == data)
				repeation++;
		}

		return repeation;
	}

	// Deque max function to return the maxmuim num
	public int max() {
		if(size == 0)
			return -999;

		int max = array[front];

		for(int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			if(max < array[index])
				max = array[index];
		}

		return max;
	}

	// Deque min function to return the minimuim num
	public int min() {
		if(size == 0)
			return -999;

		int min = array[front];

		for(int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			if(min > array[index])
				min = array[index];
		}

		return min;
	}

	//Utilities functions
	// Deque printDeque function to print all the Queue elements
	public void printDeque() {
		if(size == 0)
			return;

		for(int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			System.out.println("[" + i + "]" + " -> " + array[index]);
		}
	}

	// Deque removeDuplicates function to remove the duplictaes in the Queue
	public void removeDuplicates() {
		if(size == 0)
			return;

        sort();
        
		int j = 0;
		int[] temp = new int[capacity];
		temp[0] = array[front];
		j++;

		for(int i = 1; i < size; i++) {
			int index = (front + i) % capacity;
			if(array[index] != temp[j - 1])
				temp[j++] = array[index];
		}

		clear();

		for (int i = 0; i < j; i++)
			insertRear(temp[i]);
	}

	// Deque reverse function to reverse the Queue
	public void reverse() {
		if(size == 0)
			return;

		sort();

		for(int i = 0; i < (size / 2); i++) {
			int index = (front + i) % capacity;
			int index2 = (rear - i + capacity) % capacity;
			int temp = array[index];
			array[index] = array[index2];
			array[index2] = temp;
		}
	}

	// Deque sort function to sort the Queue
	public void sort() {
		if(size == 0)
			return;

		boolean swapped;

		for(int i = 0; i < size - 1; i++) {
			swapped = false;

			for(int j = 0; j < size - i - 1; j++) {
				int index = (front + j) % capacity;
				int nextIndex = (front + j + 1) % capacity;

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

	// Deque randomize to randomize the Queue
	public void randomize() {
		if(size == 0)
			return;

		Random rand = new Random();

		for(int i = size - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);
			int index = (front + i) % capacity;
			int randIndex = (front + j) % capacity;
			int temp = array[index];
			array[index] = array[randIndex];
			array[randIndex] = temp;
		}
	}

	// Deque swapData to swap two elements in the Queue
	public void swapData(int data1, int data2) {
		if(size == 0)
			return;

		int index1 = -1;
		int index2 = -1;

		for(int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
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

	// Deque swapIndex to swap the elements in the given index in the Queue
	public void swapIndex(int index1, int index2) {
		if(size == 0)
			return;

		if (index1 < 0 || index1 >= size || index2 < 0 || index2 >= size) {
			System.out.println("Index out of boundries.");
			return;
		}

		int currentIndex1 = (front + index1) % capacity;
        int currentIndex2 = (front + index2) % capacity;
        int temp = array[currentIndex1];
        array[currentIndex1] = array[currentIndex2];
        array[currentIndex2] = temp;
	}



	// Extra Operations
	// Deque clone function to return clone of the Deque
	public Deque clone() {
		Deque copy = new Deque(capacity);

		for(int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			copy.insertRear(array[index]);
		}

		return copy;
	}

	// Deque equals function to check if the two Queues are equal or not
	public boolean equals(Deque deque) {
		if (this.size == 0 || deque.size == 0) {
			System.out.println("One or both of two Deques is empty");
			return false;
		}

		if (this.size != deque.size)
			return false;

		for(int i = 0; i < size; i++) {
			int index = (this.front + i) % this.capacity;
			int index2 = (deque.front + i) % deque.capacity;

			if(this.array[index] != deque.array[index])
				return false;
		}

		return true;
	}

	// Deque concat function to append another deque to the current one
	public Deque concat(Deque deque) {
		if (this.size == 0 && deque.size == 0) {
			System.out.println("One or both of two Queues is empty");
			return null;
		}


		Deque copy = new Deque((this.size + deque.size));

		for(int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			copy.insertRear(this.array[index]);
		}

		for(int i = 0; i < size; i++) {
			int index = (deque.front + i) % deque.capacity;
			copy.insertRear(deque.array[index]);
		}

		return copy;
	}



	// Conversion functions
	// Deque toArray function to convert the Deque into array
	public int[] toArray() {
		if (size == 0)
			return null;

		int[] result = new int[size];

		for (int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			result[i] = array[index];
		}

		return result;
	}

	// Deque toDeque function to convert array into Deque
	public Deque toDeque(int[] array) {
		Deque deque = new Deque(capacity);

		for (int value : array)
			deque.insertRear(value);

		return deque;
	}
}
