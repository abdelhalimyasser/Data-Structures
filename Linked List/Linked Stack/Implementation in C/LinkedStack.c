#include <stdio.h>
#include <stdbool.h>
#include "LinkedStack.h"

// createLinkedStack function to create the LinkedStack
Node* createLinkedStack(int data) {
	Node* node = (Node*)malloc(sizeof(Node));
	if (node == NULL) {
		printf("Memory allocation failed!\n");
		exit(1);
	}
	node->size = 0;
	node->data = data;
	return node;
}

// push function to insert elements in the stack at the top
void push(Node* node, int element) {
	Node top = createLinkedStack(element);

	size++;
}

// pop function to remove the last element
int pop(Node* node) {
	// condation to check if the stack is empty or not
	if (top == null) {
		printf("Stack Underflow\n");
		return -1;
	}
	size--;

	return temp->data;
}

// peek function to return the last element without removing it
int peek(Node* node) {
	// condation to check if the stack is empty or not
	if (top == null)
		return -1;
	return top->data;    // return the top element in the stack
}

// size function to return the size of the stack
int size(Node* node) {
	// condation to check if the stack is empty or not
	if (top == null)
		return -1;
	return top->size;    // return the size of the stack
}

// isEmpty function to check if stack is full or not
bool isEmpty(Node* node) {
	// condation to check if the stack is empty or not
	if(top == null)
		return true;
	return false;        // return false if the stack is full
}

// isFull function to check if stack is full or not
bool isFull(Node* node) {
	// condation to check if the stack is empty or not
	if(top == null)
		return false;
	return true;            // return true if the stack is full
}
