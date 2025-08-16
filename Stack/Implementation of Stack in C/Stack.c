#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>
#include "Stack.h"


// Creating the Stack
void creatStack(Stack* s) {
	s->top = -1;
}

// Insertion function
// Stack push function to insert at first
void push(int data, Stack* s) {
	if(s->top == MAX - 1)
		return;

	s->array[++(s->top)] = data;
}

// Deletion function
// Stack pop function to delete the first
int pop(Stack* s) {
	if(s->top == -1)
		return -1;

	int popped = s->array[s->top];
	s->array[s->top] = 0;
	s->top--;

	return popped;
}

// Stack function to clear all the stack
void clear(Stack* s) {
	if(s->top == -1)
		return;

	for(int i = 0; i <= s->top; i++)
		s->array[i] = 0;
	
	s->top = -1;
}


// Search function
// Stack peek function to get the first element without deleting it
int peek(Stack* s) {
	return s->array[s->top];
}

// Stack getIndex function to get the index of specific element in stack
int getIndex(int data, Stack* s) {
	if(s->top == -1)
		return -1;

	for(int i = 0; i <= s->top; i++)
		if(s->array[i] == data)
			return i;

	return -1;
}

// Stack getElement function to get the element of specific index in stack
int getElement(int index, Stack* s) {
	if(s->top == -1 || index >= MAX)
		return -1;

	return s->array[index];
}

// Stack getMiddle function to get the middle element
int getMiddle(Stack* s) {
	if(s->top == -1)
		return -1;

	return s->array[(int)(s->top / 2)];
}

// Stack getLast function to get the last element
int getLast(Stack* s) {
	if(s->top == -1)
		return -1;

	return s->array[s->top];
}

// Stack isFound function to check if the specific element is found or not
bool isFound(int data, Stack* s) {
	if(s->top == -1)
		return false;

	for(int i = 0; i <= s->top; i++)
		if(s->array[i] == data)
			return true;

	return false;
}


// Stats functions
// Stack size function to get the size of the stack
int size(Stack* s) {
	if(s->top == -1)
		return 0;

	return s->top + 1;
}

// Stack sum function to get the sum of the stack
int sum(Stack* s) {
	if(s->top == -1)
		return -1;

	int sum = 0;

	for(int i = 0; i <= s->top; i++)
		sum += s->array[i];

	return sum;
}

// Stack average function to get the average of the stack
float average(Stack* s) {
	if(s->top == -1)
		return -1;

	int sum = 0;

	for(int i = 0; i <= s->top; i++)
		sum += s->array[i];

	return sum / (float)(s->top + 1);
}

// Stack repeated function to get the number of repeation of element in the stack
int repeated(int data, Stack* s) {
	if(s->top == -1)
		return -1;

	int count = 0;

	for(int i = 0; i <= s->top; i++)
		if(s->array[i] == data)
			count++;

	return count;
}

// Stack max function to get the max num in the stack
int max(Stack* s) {
	if(s->top == -1)
		return -1;

	int max = s->array[0];

	for(int i = 0; i <= s->top; i++)
		if(max < s->array[i])
			max = s->array[i];

	return max;
}

// Stack min function to get the min elemet in the stack
int min(Stack* s) {
	if(s->top == -1)
		return -1;

	int min = s->array[0];

	for(int i = 0; i <= s->top; i++)
		if(min > s->array[i])
			min = s->array[i];

	return min;
}


//Utility functions
// Stack printStack function to print all the stack element
void printStack(Stack* s) {
	if(s->top == -1)
		return;

	for(int i = 0; i <= s->top; i++)
		printf("[%d] -> %d\n", i, s->array[i]);
}

// Stack sort function to sort the stack using bubble sort algrothim
void sort(Stack* s) {
	if(s->top == -1)
		return ;

	bool swapped;

	for(int i = 0; i <= s->top; i++) {
		swapped = false;

		for(int j = 0; j < s->top - i; j++)
			if(s->array[j] > s->array[j + 1]) {
				int temp = s->array[j];
				s->array[j] = s->array[j + 1];
				s->array[j + 1] = temp;
				swapped = true;
			}

		if(!swapped)
			break;
	}
}

// Stack removeDuplicates function to remove all duplicates and works only when the list is "SORTED"
void removeDuplicates(Stack* s) {
	if(s->top == -1)
		return;

	sort(s);

	int j = 0;

	for(int i = 0; i <= s->top; i++)
		if(s->array[i] != s->array[i + 1])
			s->array[j++] = s->array[i];

	s->array[j++] = s->array[s->top];

	s->top = j - 1;
}

// Stack reverse function to reverse the Stack
void reverse(Stack* s) {
	if(s->top == -1)
		return;

	for(int i = 0; i <= (s->top / 2); i++) {
		int temp = s->array[(s->top) - i];
		s->array[(s->top) - i] = s->array[i];
		s->array[i] = temp;
	}
}

// Stack randmomize function to randmomize the stack
void randmomize(Stack* s) {
    srand(time(NULL));

    for (int i = s->top - 1; i > 0; i--) {
        int j = rand() % (i + 1);
        int temp = s->array[i];
        s->array[i] = s->array[j];
        s->array[j] = temp;
    }
}

// Stack swap function to swap data1 with data2
void swapData(int data1, int data2, Stack* s) {
	if(s->top == -1)
		return;

	int index1 = -1;
	int index2 = -1;

	for(int i = 0; i <= s->top; i++) {
		if(s->array[i] == data1)
			index1 = i;
		if(s->array[i] == data2)
			index2 = i;
	}

	if(index1 != -1 && index2 != -1) {
		int temp = s->array[index1];
		s->array[index1] = s->array[index2];
		s->array[index2] = temp;
	} else
		printf("One or both values not found in the stack\n");
}

// Stack swap function to swap index1 with index2
void swapIndex(int index1, int index2, Stack* s) {
	if(s->top == -1)
		return;

	if(index1 <= s->top && index2 <= s->top && index1 != index2) {
		int temp = s->array[index1];
		s->array[index1] = s->array[index2];
		s->array[index2] = temp;
	} 
	else
		printf("Indices out of bounds.\n");
}


// Extra Operations
// Stack clone function to return clone of the stack
Stack* clone(Stack* s) {
    if(s->top == -1)
		return NULL;
	
	Stack* s2 = malloc(sizeof(Stack));
	
	creatStack(s2);
		
	for(int i = 0; i <= s->top; i++)
	    push(s->array[i], s2);
	    
	return s2;    
}

// Stack equals function to check if the stacks are equal or not
bool equals(Stack* s1, Stack* s2) {
    if(s1->top != s2->top)
        return false;

    if(s1->top == -1 && s2->top == -1)
		return true;
    
    for(int i = 0; i <= s1->top; i++)
        if(s1->array[i] != s2->array[i])
           return false;
    
    return true;
}

// Stack isEmpty function to get if the stack is empty of full
bool isEmpty(Stack* s) {
    return s->top == -1;
}
