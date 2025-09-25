#include "BST.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>


// Create Tree
Node* createBST {
	Node* node = (Node*)malloc(sizeof(Node));
	if (node == NULL) {
		printf("Memory allocation failed!\n");
		exit(1);
	}
	node->data = data;
	node->left = NULL;
	node->right = NULL;
	return node;
}

// Insert Function to insert elements in the tree
Node* insert(Node* node, int element) {
	
}

// Delete Function to delete element in the tree
Node* delete(Node* node, int element) {
	
}

// search Function to search about specific element in the tree
bool search(Node* node, int element) {
	
}

// Traversals Function
// printPreOrder Function to print preorder traversal (root -> left -> right)
void printPreOrder(Node* node) {
	// Condition to check if the Tree Node is empty or not
	if (node == NULL)
		return;
	// Accessing the root first
	printf("%d ", node->data);
	// Accessing the left
	printPreOrder(node->left);
	// Accessing the right
	printPreOrder(node->right);
}

// Free the tree to prevent memory leaks
void freeTree(Node* node) {
	// Condition to check if the Tree Node is empty or not
	if (node == NULL)
		return;
	freeTree(node->left);
	freeTree(node->right);
	free(node);
}
