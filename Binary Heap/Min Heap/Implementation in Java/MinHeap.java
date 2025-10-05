package mypackage.MinHeap;

public class MinHeap {
	private int size;
	private int[] heap;
	private final int MAX_SIZE;

	public MinHeap(int MAX_SIZE) {
		this.size = 0;
		this.MAX_SIZE = MAX_SIZE;
		this.heap = new int[MAX_SIZE];
	}

	// swap function to swap two values
	private void swap(int a, int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}

	// heapify main function to sort the indexes correct
	public void heapify(int index) {
		// prepare the index of the the next children
		int leftChild = 2*index + 1;
		int rightChild = 2*index + 2;
		int smallest = index;        // assign the smallest index with the the index

		// Check if left child exists and is smaller than current smallest
		if(leftChild < size && heap[leftChild] < heap[smallest])
			smallest = leftChild;    // make the smallest is the leftChild

		// Check if right child exists and is smaller than current smallest
		if(rightChild < size && heap[rightChild] < heap[smallest])
			smallest = rightChild;    // make the smallest is the rightChild

		if(smallest != index) {
			swap(smallest, index);   // swap between the first index and the smallest index
			heapify(smallest);   // recursion to for the heap again with the new index (smallest)
		}
	}

	// building heap form array
	public void buildHeap(int[] arr) {
		size = arr.length;
		System.arraycopy(arr, 0, heap, 0, size);
		for(int i = (size / 2) - 1; i >= 0; i--)    // loop begins from the parent to fit the array element in the heap sort
			heapify(i);
	}

	// insert function to insert into the heap
	public void insert(int element) {
		if(size >= MAX_SIZE) {
			System.out.println("Heap Overflow!");
			return;
		}

		heap[size] = element;
		size++;
		int index = size - 1;

		// check if the element is bigger that the node before or not
		// (the (i - 1) to jump backward with one step and /2 to go to the node if it hve two children)
		while(index > 0 && heap[(index - 1) / 2] > heap[index]) {
			swap((index - 1) / 2, index);
			index = (index - 1) / 2;
		}
	}

	// delete function to delete element in the heap
	public void delete(int index) {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size <= 0 || index < 0 || index >= size) {
			System.out.println("Heap Underflow!");
			return;
		}

		heap[index]  = heap[size - 1];
		size--;

		heapify(index);
	}

	// extract the mininmum from the heap and delete if
	public int extractMin() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size <= 0)
			return -1;
		int min = heap[0];
		delete(0);
		return min;
	}

	// extract the maximum from the heap and delete if
	public int extractMax() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size <= 0)
			return -1;

		int maxIndex = size / 2;
		int max = heap[maxIndex];

		// Find maximum among leaf nodes from (size/2 + 1) parent  to (size-1)
		for(int i = maxIndex; i < size; i++)
			if(heap[maxIndex] < heap[i])
				max = heap[i];

		delete(maxIndex);
		return max;
	}

	// get the mininmum from the heap without deleting it
	public int getMin() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size <= 0)
			return -1;
		return heap[0];
	}

	// get the maximum from the heap without deleting it
	public int getMax() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size <= 0)
			return -1;

		int max = heap[size / 2];
		// Find maximum among leaf nodes
		for(int i = size / 2; i < size; i++)
			if(max < heap[i])
				max = heap[i];
		return max;
	}

	// function to print heap
	public void printHeap() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size <= 0) {
			System.out.println("Empty Heap!");
			return;
		}

		for(int i = 0; i < size; i++)
			System.out.println("[" + i + "]" + " -> " + heap[i]);
	}
}
