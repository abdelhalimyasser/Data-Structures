#ifndef MAXHEAP_H_INCLUDED
#define MAXHEAP_H_INCLUDED


// swap function to swap two values
void swap(int* a, int* b);

// heapify main function to sort the indexes correct
void heapify(int* heap, int size, int i);

// building heap form array
void buildHeap(int* arr, int size);

// insert function to insert into the heap
void insert(int* heap, int* size, int element);

// delete function to delete element in the heap
void delete (int* heap, int* size, int index);

// Extract the maximum from the heap and delete it
int extractMax(int* heap, int* size);

// Extract the minimum from the heap and delete it
int extractMin(int* heap, int* size);

// Get the maximum from the heap without deleting it
int getMax(int* heap, int size);

// Get the minimum from the heap without deleting it
int getMin(int* heap, int size);

// function to print heap
void printHeap(int* heap, int size);


#endif // MAXHEAP_H_INCLUDED
