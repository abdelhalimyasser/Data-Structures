#ifndef LINKEDLIST_H_INCLUDED
#define LINKEDLIST_H_INCLUDED

typedef int type;

typedef struct Node
{
    struct Node* next;
    type data;
} Node;

typedef struct
{
    Node* head;
    int size;
} list;

void CreateList(list* l);

void insert(list* l, type element, int index);

type retrieve(list* l, int index);

int isEmpty(list* l);

int size(list* l);

void destroy(list* l);

void printList(list* l);

#endif // LINKEDLIST_H_INCLUDED
