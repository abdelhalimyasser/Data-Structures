class maxHeap {
	int size;
	int MAX_SIZE;

	maxHeap(int MAX_SIZE) {
		this.size = 0;
		this.MAX_SIZE = MAX_SIZE;
		int [] heap = new int(MAX_SIZE)
	}

	// swap function to swap two values
	public void swap(int a, int b) {
		int temp = a;
		this.a = b;
		this.b = temp;
	}

	// heapify main function to sort the indexes correct
	public void heapify(int index) {
		// prepare the index of the the next children
		int leftChild = 2*index + 1;
		int rightChild = 2*index + 2;
	}

	// building heap form array
	public void buildHeap(int arr) {
		for(int i = (size / 2) - 1; i >= 0; i--)    // loop begins from the parent to fit the array element in the heap sort
			heapify(i);
	}

	// insert function to insert into the heap
	public void insert(int element) {
		if(size >= MAX_SIZE) {
			System.out.println("Heap Overflow!");
			return;
		}
	}

	// delete function to delete element in the heap
	public void delete(int index) {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size >= 0 || index < 0 || index >= size) {
			System.out.println("Heap Underflow!")
			return;
		}
	}

	// extract the mininmum from the heap and delete if
	public int extractMin() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size >= 0)
			return -1;
	}

	// extract the maximum from the heap and delete if
	public int extractMax() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size >= 0)
			return -1;
	}

	// get the mininmum from the heap without deleting it
	public int getMin() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size >= 0)
			return -1;
	}

	// get the maximum from the heap without deleting it
	public int getMax() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size >= 0)
			return -1;
	}

	// function to print heap
	public void printHeap() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size >= 0) {
			System.out.println("Empty Heap!");
			return;
		}

		for(int i = 0; i < size; i++)
			System.out.println("[" + i + "]" + " -> " + heap[i]);
	}
}
