#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "LinkedStack.h"

// Define the structure for a stack node
typedef struct Node {
	int data;
	int size;
	struct Node* next;
} Node;


// Function to create a new node
Node* createNode(int data) {
	Node* node = (Node*)malloc(sizeof(Node));
	if (!node) {
		printf("Memory allocation failed\n");
		return NULL;
	}
	node->data = data;
	node->size = -1;
	node->next = NULL;
	return node;
}

// push function to insert elements in the stack at the top
void push(Node** top, int* size, int element) {
	Node* temp  = createNode(element);   // temp node to store the first element

	temp->next = *top;      // make the assign the next to the temp
	(*top) = temp;           //  assign the temp to the top
	(*size)++;           // counter to increase the size of the Stack
}

// pop function to remove the last element
int pop(Node** top, int* size) {
	// condation to check if the stack is empty or not
	if (*top == NULL) {
		printf("Stack Underflow\n");
		return -1;
	}

	Node* temp  = *top;      // copy the top into temp node
	int popped = temp->data;   // copy the the popped element from the the temp
	*top = (*top)->next;    // assign the next of the top into top to make the pointer look at the next
	(*size)--; // decrease the counter after removing the element
    free(temp);     // free the temp to avoid memory leakege
	
	return popped;
}

// peek function to return the last element without removing it
int peek(Node* top) {
	// condation to check if the stack is empty or not
	if (top == NULL)
		return -1;
	return top->data;    // return the top element in the stack
}

// Print the stack elements
void print(Node* top) {
	// condation to check if the stack is empty or not
	if (top == NULL) {
		printf("Stack is empty\n");
		return;
	}
	int i = 0;
	Node* temp = top;
	while (temp != NULL) {
		printf("[%d] -> %d\n", (i++), temp->data);
		temp = temp->next;
	}
}

// isEmpty function to check if stack is full or not
bool isEmpty(Node* top) {
	// condation to check if the stack is empty or not
	if(top == NULL)
		return true;
	return false;        // return false if the stack is full
}

// isFull function to check if stack is full or not
bool isFull(Node* top) {
	// condation to check if the stack is empty or not
	if(top == NULL)
		return false;
	return true;            // return true if the stack is full
}

// freeLinkedStack function to free out the stack to avoid memory leakage
void freeLinkedStack(Node** top, int* size) {
    while (*top != NULL) {
        Node* temp = *top;
        *top = temp->next;
        free(temp);
    }
    *size = 0;
}
