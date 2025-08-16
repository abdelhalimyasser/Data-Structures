#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>
#include "Stack.h"

int main() {
	Stack s1;
	creatStack(&s1);

	push(10, &s1);
	push(20, &s1);
	push(30, &s1);
	push(20, &s1);
	push(10, &s1);
	push(40, &s1);
	printStack(&s1);

	printf("Peek: %d\n", peek(&s1));
	printf("Index of 20: %d\n", getIndex(20, &s1));
	printf("Element at index 2: %d\n", getElement(2, &s1));
	printf("Middle element: %d\n", getMiddle(&s1));
	printf("Last element: %d\n", getLast(&s1));
	printf("Is 30 found? %s\n", isFound(30, &s1) ? "Yes" : "No");

	printf("Size: %d\n", size(&s1));
	printf("Sum: %d\n", sum(&s1));
	printf("Average: %.2f\n", average(&s1));
	printf("Repeated 20: %d\n", repeated(20, &s1));
	printf("Max: %d\n", max(&s1));
	printf("Min: %d\n", min(&s1));

	sort(&s1);
	printf("After sorting:\n");
	printStack(&s1);

	removeDuplicates(&s1);
	printf("After removing duplicates:\n");
	printStack(&s1);

	reverse(&s1);
	printf("After reversing:\n");
	printStack(&s1);

	printf("After randomizing:\n");
	randmomize(&s1);
	printStack(&s1);

	swapData(10, 40, &s1);
	printf("After swapping 10 and 40:\n");
	printStack(&s1);

	swapIndex(0, 1, &s1);
	printf("After swapping index 0 and 1:\n");
	printStack(&s1);

	Stack s2;
	creatStack(&s2);
	push(1, &s2);
	push(2, &s2);
	push(3, &s2);
	printf("s2 stack:\n");
	printStack(&s2);

	Stack *cloneS1 = clone(&s1);
	printf("Clone of s1:\n");
	printStack(cloneS1);

	printf("s1 equals s2? %s\n", equals(&s1, &s2) ? "Yes" : "No");
	printf("s1 equals clone? %s\n", equals(&s1, cloneS1) ? "Yes" : "No");

	return 0;
}
