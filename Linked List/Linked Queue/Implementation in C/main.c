#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "LinkedQueue.h"

int main()
{
	Queue* queue = createQueue();
	int size = 1;

	// Enqueuing elements
	enqueue(&queue, &size, 1);
	enqueue(&queue, &size, 2);
	enqueue(&queue, &size, 3);
	enqueue(&queue, &size, 4);

	printf("Queue after enqueues:\n");
	print(queue);

	printf("\nFront element: %d\n", peek(queue));

	// Dequeuing one element
	printf("Dequeued element: %d\n", dequeue(queue, &size));

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
	printf("Current size: %d\n", size);

	// Checking if queue is empty
	printf("Is queue empty: %s\n", isEmpty(queue) ? "Yes" : "No");

	return 0;
}
