#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"

void CreateList(list* l)
{
	l->head = NULL;
	l->size = 0;
}

void insert(list* l, type element, int index)
{
	if (index < 0 || index > l->size) {
		printf("Invalid index: %d (current size: %d)\n", index, l->size);
		return;
	}

	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->data = element;

	if(index == 0)
	{
		newNode->next = l->head;
		l->head = newNode;
		l->size++;
	}
	else
	{
		Node* temp = l->head;

		for(int i=0; i < index - 1; i++)
			temp = temp->next;

		newNode->next = temp->next;
		temp->next = newNode;
		l->size++;
	}
}

type retrieve(list* l, int index)
{
	if(index < 0 || index > l->size)
	{
		printf("Invalid index: %d (current size: %d)\n", index, l->size);
		return -999999;
	}

	Node* temp = l->head;

	for(int i = 0; i < index; i++)
		temp = temp->next;

	l->size--;

	return temp->data;

}

int isEmpty(list* l)
{
	return l->size == 0;
}

int size(list* l)
{
	return l->size;
}

void destroy(list* l)
{
	Node* temp = l->head;

	while(temp != NULL)
	{
		temp = temp->next;
		free(temp);
	}

	l->head = NULL;
	l->size = 0;
}

void printList(list* l)
{
	Node* temp = l->head;

	while(temp != NULL) {
		printf("%d ", temp->data);
		temp = temp->next;
	}

	printf("\n");
}
