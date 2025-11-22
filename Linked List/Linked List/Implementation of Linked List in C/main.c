#include <stdio.h>
#include "linkedlist.h"

int main()
{
    list* l;
    CreateList(l);

    insert(l, 10, 0);
    insert(l, 20, 1);
    insert(l, 30, 2);
    insert(l, 15, 1);

    printList(l);

    printf("Size: %d\n", size(l));
    printf("Element at index 2: %d\n", retrieve(l, 2));

    destroy(l);
    printf("Is Empty: %d\n", isEmpty(l));

    return 0;
}
