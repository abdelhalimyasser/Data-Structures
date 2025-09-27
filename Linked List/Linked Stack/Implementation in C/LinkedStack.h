#ifndef LinkedStack_H_INCLUDED
#define LinkedStack_H_INCLUDED

// Define the structure for a stack node
typedef struct Node {
	int data;
	int size;
	struct Node* next;
} Node;

// Function to create a new node
Node* createNode(int data);

// push function to insert elements in the stack at the top
void push(Node** top, int* size, int element);

// pop function to remove the last element
int pop(Node** top, int* size);

// peek function to return the last element without removing it
int peek(Node* top);

// Print the stack elements
void print(Node* top);

// isEmpty function to check if stack is full or not
bool isEmpty(Node* top);

// isFull function to check if stack is full or not
bool isFull(Node* top);

// freeLinkedStack function to free out the stack to avoid memory leakage
void freeLinkedStack(Node** top, int* size);

#endif // LinkedStack_H_INCLUDED
