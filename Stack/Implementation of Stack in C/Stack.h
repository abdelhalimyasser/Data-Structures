#ifndef STACK_H_INCLUDED
#define STACK_H_INCLUDED
#define MAX 10

typedef struct
{
    int top;
    int array[MAX];
}Stack;


// Insertion function
// Stack push function to insert at first
void push(int data, Stack* s); 

// Deletion function
// Stack pop function to delete the first
int pop(Stack* s);

// Stack function to clear all the stack
void clear(Stack* s);


// Search function
// Stack peek function to get the first element without deleting it
int peek(Stack* s); 

// Stack getIndex function to get the index of specific element in stack
int getIndex(int data, Stack* s); 

// Stack getElement function to get the element of specific index in stack
int getElement(int index, Stack* s); 	

// Stack getMiddle function to get the middle element
int getMiddle(Stack* s); 	

// Stack getLast function to get the last element
int getLast(Stack* s); 

// Stack isFound function to check if the specific element is found or not
boolean isFound(int data, Stack* s);


// Stats functions
// Stack size function to get the size of the stack
int size(Stack* s); 
	
// Stack sum function to get the sum of the stack
int sum(Stack* s); 

// Stack average function to get the average of the stack
double average(Stack* s); 
	
// Stack repeated function to get the number of repeation of element in the stack
int repeated(int data, Stack* s); 
	
// Stack max function to get the max num in the stack
int max(Stack* s);
	
// Stack min function to get the min elemet in the stack
int min(Stack* s);
	

//Utility functions
// Stack printStack function to print all the stack element
void printStack(Stack* s);
	
// Stack sort function to sort the stack using bubble sort algrothim
void sort(Stack* s);
  
// Stack removeDuplicates function to remove all duplicates and works only when the list is "SORTED"
void removeDuplicates(Stack* s);

// Stack reverse function to reverse the Stack
void reverse(Stack* s);

// Stack randmomize function to randmomize the stack
void randmomize(Stack* s);

// Stack swap function to swap data1 with data2
void swapData(int data1, int data2, Stack* s);
	
// Stack swap function to swap index1 with index2
void swapIndex(int index1, int index2, Stack* s);
	

// Extra Operations
// Stack clone function to return clone of the stack
Stack clone(Stack stack, Stack* s);
	
// Stack equals function to check if the stacks are equal or not
boolean equals(Stack stack, Stack* s);

// Stack concat function to append another stack to the current one
Stack concat(Stack stack, Stack* s);

// Stack isEmpty function to get if the stack is empty of full
boolean isEmpty(Stack* s);


#endif // STACK_H_INCLUDED
