#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "LinkedQueue.h"

// Function to create an empty queue
Queue* createQueue() {
	Queue* queue = (Queue*)malloc(sizeof(Queue));
	queue->front = queue->rear = NULL;
	return queue;
}

// push function to insert elements in the queue at the rear
void enqueue(Queue** queue, int* size, int element) {
	Node* temp = createNode(element);

	if((*queue)->rear == NULL) {
		(*queue)->rear = (*queue)->front = temp;
		return;
	}

	(*queue)->rear->next = temp;
	(*queue)->rear = temp;
	(*size)++;
}

// pop function to remove the front element
int dequeue(Queue* queue, int* size) {
	// If the queue is empty
	if (queue->front == NULL) {
		printf("Queue Underflow!\n");
		return -1;
	}

	Node* temp = queue->front;
	int dequeued = queue->front->data;
	queue->front = queue->front->next;
	(*size)--;

	if (queue->front == NULL) // If the queue becomes empty, update rear to NULL
		queue->rear = NULL;

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
	int i = 0;
	Node* temp = queue->front;
	while(temp != NULL) {
		printf("[%d] -> %d\n", (i++), temp->data);
		temp = temp->next;
	}
}

// isEmpty function to check if queue is full or not
bool isEmpty(Queue* queue) {
	// Condtion to check if it is empty or not
	if(queue->front == NULL || queue == NULL)
		return true;
	return false;
}

// isFull function to check if Queue is full or not
bool isFull(Queue* queue) {
	// Condtion to check if it is full or not
	if(queue->front == NULL || queue == NULL)
		return false;
	return true;
}

// freeLinkedQueue function to free out the queue to avoid memory leakage
void freeLinkedQueue(Queue** queue, int* size) {
	if (queue == NULL || *queue == NULL)
		return;

	Node* current = (*queue)->front;
	while (current != NULL) {
		Node* temp = current;
		current = current->next;
		free(temp);
	}
	free(*queue);
	*queue = NULL;
	*size = 0;
}
