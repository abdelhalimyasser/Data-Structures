#ifndef LinkedQueue_H_INCLUDED
#define LinkedQueue_H_INCLUDED

// Define node structure
typedef struct Node {
	int data;
	struct Node* next;
} Node;

// Define queue structure
typedef struct Queue {
	Node* front;
	Node* rear;
} Queue;

// Function to create a new node
Node* createNode(int data);

// Function to create an empty queue
Queue* createQueue();

// push function to insert elements in the queue at the rear
void enqueue(Queue** queue, int* size, int element);

// pop function to remove the front element
int dequeue(Queue* queue, int* size);

// peek function to return the front element without removing it
int peek(Queue* queue);

// Print the queue elements
void print(Queue* queue);

// isEmpty function to check if queue is full or not
bool isEmpty(Queue* queue);

// isFull function to check if Queue is full or not
bool isFull(Queue* queue);

// freeLinkedQueue function to free out the queue to avoid memory leakage
void freeLinkedQueue(Queue** queue, int* size);

#endif // LinkedQueue_H_INCLUDED
