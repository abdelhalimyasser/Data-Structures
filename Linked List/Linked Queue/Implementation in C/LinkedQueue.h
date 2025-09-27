#ifndef LinkedQueue_H_INCLUDED
#define LinkedQueue_H_INCLUDED

// Define the structure for a Queue node


// Function to create a new node
Node* createNode(int data);

// push function to insert elements in the queue at the rear
void push(Node** , int* size, int element);

// pop function to remove the front element
int pop(Node** , int* size);

// peek function to return the front element without removing it
int peek(Node* );

// Print the queue elements
void print(Node* );

// isEmpty function to check if queue is full or not
bool isEmpty(Node* );

// isFull function to check if Queue is full or not
bool isFull(Node* );

// freeLinkedQueue function to free out the queue to avoid memory leakage
void freeLinkedQueue(Node** , int* size);

#endif // LinkedQueue_H_INCLUDED
