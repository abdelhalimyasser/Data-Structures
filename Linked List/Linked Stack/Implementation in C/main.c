#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
	Node* stack = createNode(1);
    int size = 1;
    
    // pushing elements
	push(&stack, &size, 2);
	push(&stack, &size, 3);
	push(&stack, &size, 4);

	printf("Stack after pushes: \n");
	print(stack);

	printf("\nTop element: %d\n", peek(stack));
    
    // popping one element
	printf("Popped element: %d\n", pop(&stack, &size));

	printf("\nStack after pop: \n");
	print(stack);
	
	// checking current size
    printf("\nCurrent size: %d\n" , size);
	
	// checking if stack is empty
    printf("Is stack empty: %d\n", isEmpty(stack));
        
    // checking if stack is full
    printf("Is stack full: %d\n", isFull(stack));
    
    freeLinkedStack(&stack, &size);
    
    printf("\nAfter Free:\n");
    // checking current size
    printf("Current size: %d\n" , size);
	
	// checking if stack is empty
    printf("Is stack empty: %d\n", isEmpty(stack));
    
	return 0;
}
