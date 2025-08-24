#ifndef QUEUE_H_INCLUDED
#define QUEUE_H_INCLUDED
#define CAPACITY 10


typedef struct {
	int front;
	int rear;
	int size;
	int array[CAPACITY];
} Queue;


// Queue Basic Functions
// Queue createQueue function to creat the Queue
void createQueue(Queue* queue);

// Queue isFull function to check if queue is full
bool isFull(Queue* queue);

// Queue isEmpty function to check if queue is empty
bool isEmpty(Queue* queue);

// Queue enqueue function that add element in the last index
void enqueue(int data, Queue* queue);

// Queue dequeue function that returns and remove the first element
int dequeue(Queue* queue);

// Queue clear function to clear the Queue
void clear(Queue* queue);

// Queue peek function that returns the first(front) element
int peek(Queue* queue);

// Queue printQueue function that prints all Queue elements
void printQueue(Queue* queue);


#endif // QUEUE_H_INCLUDED
