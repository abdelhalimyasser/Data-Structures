#include <stdio.h>
#include"maxHeap.h"


// swap function to swap two values
void swap(int* a, int* b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}

// heapify main function to sort the indexes correct
void heapify(int* heap, int size, int i) {
	// prepare the index of the the next children
	int leftChild = 2*i + 1;
	int rightChild = 2*i + 2;
	int largest = i;   // assign the maximum index with the the index

	// if the leftChild index less then the  used size and left child in the array less than the smallest
	if (leftChild < size && heap[leftChild] > heap[largest])
        largest = leftChild;     // make the largest is the leftChild

	// if the rightChild index less then the used size and rightChild in the array less than the smallest
	if (rightChild < size && heap[rightChild] > heap[largest])
        largest = rightChild;    // make the largest is the rightChild
    
    // If largest is not the current node, swap and recurse
	if(largest != i) {
		swap(heap + i, heap + largest);   // swap between the first index and the smallest index
		heapify(heap, size, largest);   // recursion to for the heap again with the new index (smallest)
	}
}

// building heap form array
void buildHeap(int* arr, int size) {
	for(int i = (size/2 - 1); i >= 0; i--)    // loop begins from the parent to fit the array element in the heap sort
		heapify(arr, size, i);
}

// insert function to insert into the heap
void insert(int* heap, int* size, int element) {
	// condtion to check if the heap array is full or not to avoid errors
	if (*size >= MAX_SIZE) {
		printf("Heap Overflow!\n");
		return;
	}

	heap[*size] = element;      // set the new element at the end
	(*size)++;
	int i = *size - 1;

	// the (i - 1) to jump backward with one step and /2 to go to the node if it hve two children
    while (i > 0 && heap[(i - 1) / 2] < heap[i]) {
        swap(heap + (i - 1) / 2, heap + i); // Swap with parent
        i = (i - 1) / 2; // Update index to parent
    }
}

// delete function to delete element in the heap
void delete (int* heap, int* size, int index) {
	// condtion to check if the heap array is empty or not to avoid errors
	if (*size == 0 || index < 0 || index >= *size) {
		printf("Heap Underflow or Invalid Index\n");
		return;
	}

	heap[index] = heap[*size - 1];
	(*size)--;

	heapify(heap, *size, index);
}

// Extract the maximum from the heap and delete it
int extractMax(int* heap, int* size) {
	if (*size == 0) {
		printf("Heap Underflow\n");
		return -1;
	}
	int max = heap[0];
	delete(heap, size, 0);
	return max;
}

// Extract the minimum from the heap and delete it
int extractMin(int* heap, int* size) {
	if (*size == 0) {
		printf("Heap Underflow\n");
		return -1;
	}

	// Find minimum among leaf nodes (from size/2 to size-1)
	int minIndex = *size / 2;
	for (int i = *size / 2; i < *size; i++)
		if (heap[i] < heap[minIndex])
			minIndex = i;
	int min = heap[minIndex];

	delete(heap, size, minIndex);
	return min;
}

// Get the maximum from the heap without deleting it
int getMax(int* heap, int size) {
	if (size == 0) {
		printf("Empty Heap\n");
		return -1;
	}
	return heap[0];
}

// Get the minimum from the heap without deleting it
int getMin(int* heap, int size) {
	if (size == 0) {
		printf("Empty Heap\n");
		return -1;
	}

	// Find minimum among leaf nodes (from size/2 to size-1)
	int min = heap[size / 2];
	for (int i = size / 2; i < size; i++)
		if (heap[i] < min)
			min = heap[i];
	return min;
}

// function to print heap
void printHeap(int* heap, int size) {
	// condtion to check if the heap array is empty or not to avoid errors
	if (size == 0) {
		printf("Empty Heap\n");
		return;
	}
	for(int i = 0; i < size; i++)
		printf("[%d] -> %d\n", i, heap[i]);
}
