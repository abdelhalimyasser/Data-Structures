#ifndef LinkedStack_H_INCLUDED
#define LinkedStack_H_INCLUDED

// Define the node
typedef struct Node{
    int data;
    Node* next;
}Node;

// createLinkedStack function to create the LinkedStack
Node* createLinkedStack();

// push function to insert elements in the stack at the top
void push(int element);

// pop function to remove the last element
int pop();

// peek function to return the last element without removing it
int peek();

// size function to return the size of the stack
int size();

// isEmpty function to check if stack is full or not
bool isEmpty();

// isFull function to check if stack is full or not
bool isFull();

#endif // LinkedStack_H_INCLUDED
