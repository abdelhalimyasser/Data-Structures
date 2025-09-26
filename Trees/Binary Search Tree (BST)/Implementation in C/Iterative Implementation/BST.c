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
	// make temp node to store the new element
	Node* temp = createBST(element);
	// check if the tree is null or not
	if(node == NULL)
		return temp;
	// use current to traverse in the tree safely instead of using node
	Node* current = node;
	// loop in all the tree
	while(true) {
	    // condtion to check duplicates
	    if (element == current->data) { 
            free(temp); // Free the unused node
            return node;
        }
		// condtion if the element is more than the current one or not
		else if(element > current->data) {
			// make the new element node in the right path to be the right child
			if(current->right == NULL) {
				current->right = temp;
				break;
			}
			current = current->right;   // change the current to be in the right path
		}
		// condtion if the element is less than the current one or not
		else if(element < current->data) {
			// make the new element node in the left path to be the left child
			if(current->left == NULL) {
				current->left = temp;
				break;
			}
			current = current->left;   // change the current to be in the left path
		}
		// if the element already exists exit the loop
		else
			return node;
	}
	return node;
}

// Delete Function to delete element in the tree
Node* delete(Node* node, int element) {
	// Condition to check if the Tree Node is empty or not
	if (node == NULL)
		return NULL;

	Node* prev = NULL;
	Node* current = node;

	// Check if the element is actually present
	while(current != NULL && current->data != element) {
		prev = current;
		current = (element < current->data) ? current->left : current->right;
	}

	// Check if current is empty or not
	if(current == NULL)
		return node;

	// Case 1: 0 or 1 child, Check if the node to be deleted has at most one child
	if(current->left == NULL || current->right == NULL) {
		Node* replacement = (current->left != NULL) ? current->left : current->right;
		// Check if the node to be deleted is the root
		if (prev == NULL) {
            free(current);
            return replacement;
        }
		// Check if the left child is not exist
		if(prev->left == current)
			prev->left = replacement;
		else
			prev->right = replacement;
		free(current);	
	}

	// Case 2: 2 children, Check if the node to be deleted is prev's left or right child and then replace this with newCurr
	else {
		Node* succ = current->right;
		Node* succParent = current;

		while(succ->left != NULL) {
			succParent = succ;
			succ = succ->left;
		}
		// Copy successor's data
		current->data = succ->data;
		// Delete successor has at most 1 child: right
		if(succParent == current)
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
	// use current to traverse in the tree safely instead of using node
	Node* current = node;
	// loop in all the tree
	while(current != NULL) {
		if(current->data == element)       // check if the element is equal to the root
			return true;
		else if(current->data < element) // if the element is more than root then shift to the right path
			current = current->right;
		else                         // else the element is less than root then shift to the left path
			current = current->left;
	}
	return false;     // if not found return false
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
