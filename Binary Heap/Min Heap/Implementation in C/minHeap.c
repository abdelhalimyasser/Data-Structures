#include <stdio.h>
#include"minHeap.h"

// swap function to swap two values
void swap(int* a, int* b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}

// heapify main function to sort the indexes correct
//             array   real size  index
//              !          !        !
void heapify(int* heap, int size, int i) {
	// prepare the index of the the next children
	int leftChild = 2*i + 1;
	int rightChild = 2*i + 2;

	int smallest = i;   // assign the smallest index with the the index

	// if the leftChild index less then the  used size and left child in the array less than the smallest
	if(leftChild < size && heap[leftChild] < heap[smallest])
		smallest = leftChild;    // make the smallest is the leftChild

	// if the rightChild index less then the used size and rightChild in the array less than the smallest
	if(rightChild < size && heap[rightChild] < heap[smallest])
		smallest = rightChild;    // make the smallest is the rightChild

	if(smallest != i) {
		swap(heap + i, heap + smallest);   // swap between the first index and the smallest index
		heapify(heap, size, smallest);   // recursion to for the heap again with the new index (smallest)
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

	heap[*size] = element;   // set the new element at the end
	(*size)++;            // increase the size
	int i = *size - 1;

	// check if the element is bigger that the node before or not
	// (the (i - 1) to jump backward with one step and /2 to go to the node if it hve two children)
	while (i > 0 && heap[(i - 1) / 2] > heap[i]) {
		swap(heap + (i - 1) / 2, heap + i);  // swap the last element with previos node
		i = (i - 1) / 2;               // update the index
	}
}

// delete function to delete element in the heap
void delete (int* heap, int* size, int index) {
	// condtion to check if the heap array is empty or not to avoid errors
	if (*size == 0 && index < 0 || index >= *size) {
		printf("Heap Underflow or Invalid Index\n");
		return;
	}

	heap[index] = heap[*size - 1];
	(*size)--;

	heapify(heap, *size, index);
}

// extract the mininmum from the heap and delete if
int extractMin(int* heap, int* size) {
	// condtion to check if the heap array is empty or not to avoid errors
	if (size == 0)
		return -1;
	int min = heap[0];
	delete (heap, size, 0);
	return min;
}

// extract the maximum from the heap and delete if
int extractMax(int* heap, int* size) {
	// condtion to check if the heap array is empty or not to avoid errors
	if (size == 0)
		return -1;

	// Find maximum among leaf nodes from (size/2 + 1) parent  to (size-1)
	int maxIndex = *size / 2;
	for (int i = *size / 2 + 1; i < *size; i++)
		if (heap[i] > heap[maxIndex])
			maxIndex = i;
	int max = heap[maxIndex];

	delete (heap, size, maxIndex);
	return max;
}

// get the mininmum from the heap without deleting it
int getMin(int* heap, int size) {
	// condtion to check if the heap array is empty or not to avoid errors
	if (size == 0)
		return -1;
	return heap[0];
}

// get the maximum from the heap without deleting it
int getMax(int* heap, int size) {
	// condtion to check if the heap array is empty or not to avoid errors
	if (size == 0)
		return -1;

	// Find maximum among leaf nodes
	int max = heap[size / 2];
	for (int i = size / 2 + 1; i < size; i++)
		if (heap[i] > max)
			max = heap[i];
	return max;
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
