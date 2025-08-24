#include <stdio.h>
#include <stdbool.h>
#include "Queue.h"

// Queue Basic Functions
// Queue createQueue function to creat the Queue
void createQueue(Queue* queue) {
	queue->front = 0;
	queue->rear = -1;
	queue->size = 0;
}

// Queue isFull function to check if queue is full
bool isFull(Queue* queue) {
	return queue->size == CAPACITY;
}

// Queue isEmpty function to check if queue is empty
bool isEmpty(Queue* queue) {
	return queue->size == 0;
}

// Queue enqueue function that add element in the last index
void enqueue(int data, Queue* queue) {
	if (isFull(queue)) {
		printf("Queue overflow.\n");
		return;
	}

	queue->rear++;
	queue->array[queue->rear] = data;
	queue->size++;
}

// Queue dequeue function that returns and remove the first element
int dequeue(Queue* queue) {
	if (isEmpty(queue)) {
		printf("Queue underflow.\n");
		return -1;
	}

	int data = queue->array[queue->front];
	queue->front++;
	queue->size--;

	return data;
}

// Queue clear function to clear the Queue
void clear(Queue* queue) {
	queue->front = 0;
	queue->rear = -1;
	queue->size = 0;
}

// Queue peek function that returns the first(front) element
int peek(Queue* queue) {
	if (isEmpty(queue))
		return -1;

	return queue->array[queue->front];
}

// Queue printQueue function that prints all Queue elements
void printQueue(Queue* queue) {
	if (isEmpty(queue))
		return;

	for (int i = queue->front; i <= queue->rear; i++)
		printf("[%d] -> %d\n", i, queue->array[i]);
}

