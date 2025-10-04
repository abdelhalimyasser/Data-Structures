#include <stdio.h>
#include"minHeap.h"
#define MAX_SIZE 100

int main()
{
	int heap[MAX_SIZE];
    int size = 0;

    // Insert elements
    insert(heap, &size, 10);
    insert(heap, &size, 5);
    insert(heap, &size, 20);
    insert(heap, &size, 2);
    insert(heap, &size, 15);

    printf("Heap after insertions:\n");
    printHeap(heap, size);

    printf("Minimum: %d\n", getMin(heap, size));
    printf("Maximum: %d\n", getMax(heap, size));

    printf("Extracted Min: %d\n", extractMin(heap, &size));
    printf("Heap after extracting min:\n");
    printHeap(heap, size);

    printf("Extracted Max: %d\n", extractMax(heap, &size));
    printf("Heap after extracting max:\n");
    printHeap(heap, size);

	return 0;
}
