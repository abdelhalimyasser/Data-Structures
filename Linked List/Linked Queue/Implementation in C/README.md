#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>


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
Node* createNode(int data) {
	Node* node = (Node*)malloc(sizeof(Node));
	if (node == NULL) {
		printf("Memory allocation failed!\n");
		return NULL;
	}
	node->data = data;
	node->next = NULL;
	return node;
}

// Function to create an empty queue
Queue* createQueue() {
	Queue* queue = (Queue*)malloc(sizeof(Queue));
	queue->front = queue->rear = NULL;
	return queue;
}

// push function to insert elements in the queue at the rear
void enqueue(Queue* queue, int* size, int element) {
	Node* temp = createNode(element);

	if(queue->rear == NULL) {
		queue->rear = queue->front = temp;
		return;
	}

	queue->rear->next = temp;
	queue->rear = temp;
}

// pop function to remove the front element
int dequeue(Queue** queue, int* size) {
	// If the queue is empty
	if ((*queue)->front == NULL) {
		printf("Queue Underflow!\n");
		return -1;
	}

	Queue temp = queue->front;
	int dequeued = queue->front->data;
	queue->front = queue->front->next;

	if (q->front == NULL) // If the queue becomes empty, update rear to NULL
		q->rear = NULL;

	free(temp);

	return dequeued;
}

// peek function to return the front element without removing it
int peek(Queue* queue) {
	// condation to check if the queue is empty or not
	if(queue->front == NULL)
		return -1;
	return queue->front->data;
}

// Print the queue elements
void print(Queue* queue) {
	// condation to check if the queue is empty or not
	if(queue->front == NULL)
		return;
	Node* temp = queue->front;
	while(temp != NULL) {
		printf("[%d] -> %d", (i++), temp->data);
		temp = temp->next;
	}
}

// isEmpty function to check if queue is full or not
bool isEmpty(Queue* queue) {
	// Condtion to check if it is empty or not
	if(queue->front == NULL)
		return true;
	return false;
}

// isFull function to check if Queue is full or not
bool isFull(Queue* queue) {
	// Condtion to check if it is full or not
	if(queue->front == NULL)
		return false;
	return true;
}

// freeLinkedQueue function to free out the queue to avoid memory leakage
void freeLinkedQueue(Queue** queue, int* size) {
    free(queue);
}


int main()
{
    Queue* queue = createQueue();
    int size = 0;

    // Enqueuing elements
    enqueue(&queue, &size, 1);
    enqueue(&queue, &size, 2);
    enqueue(&queue, &size, 3);
    enqueue(&queue, &size, 4);

    printf("Queue after enqueues:\n");
    print(queue);

    printf("\nFront element: %d\n", peek(queue));

    // Dequeuing one element
    printf("Dequeued element: %d\n", dequeue(&queue, &size));

    printf("\nQueue after dequeue:\n");
    print(queue);

    // Checking current size
    printf("\nCurrent size: %d\n", size);

    // Checking if queue is empty
    printf("Is queue empty: %s\n", isEmpty(queue) ? "Yes" : "No");

    // Checking if queue is full
    printf("Is queue full: %s\n", isFull(queue) ? "Yes" : "No");

    freeLinkedQueue(&queue, &size);
    printf("\nAfter Clear:\n");
    
    // Checking current size
    printf("\nCurrent size: %d\n", size);
    
    // Checking if queue is empty
    printf("Is queue empty: %s\n", isEmpty(queue) ? "Yes" : "No");
	return 0;
}

