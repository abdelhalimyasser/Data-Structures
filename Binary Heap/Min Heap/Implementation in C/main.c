#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 100


// swap function to swap two values
void swap(int* a, int* b)
{
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
	int parent = size/2 - 1;  // set the parent fit the heap rule
	for(int i = parent; i >= 0; i--)    // loop begins from the parent to fit the array element in the heap sort
		heapify(arr, size, i);
}

// get the mininmum from the heap without deleting it
int getMin(int* heap, int* size) {
	return heap[0];
}

// extract the mininmum from the heap and delete if
int extractMin(int* heap, int* size) {
	int min = heap[0];
	delete (heap, size, 0);
	return min;
}

// insert function to insert into the heap
void insert(int* heap, int* size, int element){
    
}

// delete function to delete element in the heap
void delete (int* heap, int* size, int index)

// function to print heap
void printHeap(int* heap, int size) {
	for(int i = 0; i < size; i++)
		printf("[%d] -> %d\n", i, heap[i]);
}



int main()
{
	printf("Hello World");

	return 0;
}
