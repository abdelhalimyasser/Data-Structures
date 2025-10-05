package mypackage.MaxHeap;

public class MaxHeap {
	private int size;
	private int[] heap;
	private final int MAX_SIZE;

	public MaxHeap(int MAX_SIZE) {
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
		int largest = index;        // assign the largest index with the the index

		if(leftChild < size && heap[leftChild] > heap[largest])
			largest = leftChild;    // make the largest is the leftChild

		if(rightChild < size && heap[rightChild] > heap[largest])
			largest = rightChild;    // make the largest is the rightChild

		if(largest != index) {
			swap(largest, index);   // swap between the first index and the largest index
			heapify(largest);   // recursion to for the heap again with the new index (largest)
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

		// the (i - 1) to jump backward with one step and /2 to go to the node if it hve two children
		while(index > 0 && heap[(index - 1) / 2] < heap[index]) {
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

	// extract the maximum from the heap and delete if
	public int extractMax() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size <= 0)
			return -1;
		int max = heap[0];
		delete(0);
		return max;
	}

	// extract the minimum from the heap and delete if
	public int extractMin() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size <= 0)
			return -1;
		
		int minIndex = size / 2;
        for (int i = size / 2; i < size; i++) 
            if (heap[i] < heap[minIndex])
                minIndex = i;
        int min = heap[minIndex];
        delete(minIndex);
        return min;
	}

	// get the maximum from the heap without deleting it
	public int getMax() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size <= 0)
			return -1;
		return heap[0];
	}

	// get the minimum from the heap without deleting it
	public int getMin() {
		// condtion to check if the heap array is empty or not to avoid errors
		if(size <= 0)
			return -1;

		int min = heap[size / 2];
		// Find minimum among leaf nodes
		for(int i = size / 2; i < size; i++)
			if(min > heap[i])
				min = heap[i];
		return min;
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
