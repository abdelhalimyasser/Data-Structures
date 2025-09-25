#include "BST.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

// Create Tree
Node* createBST(int data) {
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
	if (node == NULL)             // if the tree node is empty
		return createTreeNode(element);
	else if (element < node->data)  // else if the element is less than the tree root
		node->left = insert(node->left, element);
	else if (element > node->data)   // else if the the element is more than the tree root
		node->right = insert(node->right, element);
	return node;
}

// Delete Function to delete element in the tree
Node* delete(Node* node, int element) {
	// Condition to check if the Tree Node is empty or not
	if (node == NULL)
		return NULL;
	if (element < node->data)  // Delete the left as it is less than the tree root
		node->left = delete(node->left, element);
	else if (element > node->data) // Delete the right as it is more than the tree root
		node->right = delete(node->right, element);
	else {        // The node which have the wanted element
		// Case 1: 0 or 1 child
		if (node->left == NULL) {
			Node* temp = node->right;
			free(node);
			return temp;
		}
		if (node->right == NULL) {
			Node* temp = node->left;
			free(node);
			return temp;
		}

		// Case 2: 2 children
		Node* succParent = node;
		Node* succ = node->right;
		while(succ->left != NULL) {
			succParent = succ;
			succ = succ->left;
		}
		// Copy minimum value to the node to delete it
		node->data = succ->data;
		// Delete the successor
		if(succParent == node)
			succParent->right = succ->right;
		else
			succParent->left = succ->right;
		free(succ);
	}
	return node;
}

// search Function to search about specific element in the tree
bool search(Node* node, int element) {
	// Condition to check if the Tree Node is empty or not
	if (node == NULL)
		return false;
	// Check if the element is the root or not
	if (node->data == element)
		return true;
	// Check if the element is less that the root then check the left path
	if (element < node->data)
		return search(node->left, element);
	// Then if it not one of the other Conditions then check the right path
	return search(node->right, element);
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




