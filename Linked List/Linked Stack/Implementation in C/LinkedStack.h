#ifndef LinkedStack_H_INCLUDED
#define LinkedStack_H_INCLUDED

// Define the node
typedef struct Node{
    int data;
    Node* next;
}Node;

// createLinkedStack function to create the LinkedStack
Node* createLinkedStack(int data);

// push function to insert elements in the stack at the top
void push(Node* node, int element);

// pop function to remove the last element
int pop(Node* node);

// peek function to return the last element without removing it
int peek(Node* node);

// size function to return the size of the stack
int size(Node* node);

// isEmpty function to check if stack is full or not
bool isEmpty(Node* node);

// isFull function to check if stack is full or not
bool isFull(Node* node);

#endif // LinkedStack_H_INCLUDED
