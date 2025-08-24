#include <stdio.h>
#include <stdbool.h>
#include "Queue.h"


int main()
{
	Queue queue;
	createQueue(&queue);

	enqueue(10, &queue);
	enqueue(20, &queue);
	enqueue(30, &queue);

	printQueue(&queue);

	printf("Dequeued: %d\n", dequeue(&queue));
	printf("Front element: %d\n", peek(&queue));

	printQueue(&queue);

	clear(&queue);
	
	printQueue(&queue);


	return 0;
}
