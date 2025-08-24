#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>
#include "Deque.h"


int main()
{
	Deque deque;
	createDeque(&deque);
	printf("=== Testing Basic Operations ===\n");

	// Test insertions
	insertRear(&deque, 10);
	insertRear(&deque, 20);
	insertFront(&deque, 30);
	insertFront(&deque, 40);
	printDeque(&deque);  
	printf("Size: %d\n", getSize(&deque));  
	printf("Is empty? %d\n", isEmpty(&deque));  
	printf("Is full? %d\n", isFull(&deque));    

	// Test deletions
	printf("Delete front: %d\n", deleteFront(&deque));  
	printf("Delete rear: %d\n", deleteRear(&deque));    
	printDeque(&deque);  
	printf("Size: %d\n", getSize(&deque));  

	// Test clear
	clear(&deque);
	printDeque(&deque);  
	printf("Is empty? %d\n", isEmpty(&deque));  

	//Testing Search Operations
	insertRear(&deque, 10);
	insertRear(&deque, 20);
	insertRear(&deque, 10);
	printDeque(&deque);  
	printf("Front: %d\n", getFront(&deque));   
	printf("Rear: %d\n", getRear(&deque)); 
	printf("Middle: %d\n", getMiddle(&deque));
	printf("Is 20 found? %d\n", isFound(&deque, 20));
	printf("Is 50 found? %d\n", isFound(&deque, 50));
	printf("Index of 20: %d\n", getIndex(&deque, 20));
	printf("Element at index 1: %d\n", getElement(&deque, 1));
	printf("Element at invalid index: %d\n", getElement(&deque, 5));

	//Testing Statistics
	printf("Sum: %d\n", sum(&deque));             
	printf("Average: %.2f\n", average(&deque));  
	printf("Repeated 10: %d\n", repeated(&deque, 10)); 
	printf("Max: %d\n", max(&deque)); 
	printf("Min: %d\n", min(&deque));

	//Testing Utilities
  printf("After removing duplicates:\n");
	removeDuplicates(&deque);
	printDeque(&deque);
  printf("After reversing:\n");
	reverse(&deque);
	printDeque(&deque); 
	printf("After randomize:\n");
  randomize(&deque);
	printDeque(&deque);  
	printf("After sorting:\n");	
	sort(&deque);
	printDeque(&deque);  
	printf("Swap data 10 and 20\n");
	swapData(&deque, 10, 20);
	printDeque(&deque); 
	printf("Swap indices 0 and 1\n"); 
  swapIndex(&deque, 0, 1);
	printDeque(&deque); 
	

	//Testing Extra Operations
  Deque deque2;
  createDeque(&deque2);
  insertRear(&deque2, 10);
  insertRear(&deque2, 20);
  printf("Are deques equal? %d\n", equals(&deque, &deque2)); 
  Deque deque3;
  createDeque(&deque3);
  insertRear(&deque3, 30);
  printf("Are deques equal? %d\n", equals(&deque, &deque3)); 
  printf("Concatenate deque3 to deque:\n");
  printf("Concat success: %d\n", concat(&deque, &deque3));
  printDeque(&deque);  
    
    
	return 0;
}
