#include "Tree.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#define MAX_QUEUE_SIZE 10

// Create Tree
TreeNode* createTreeNode(int data) {
    TreeNode* node = (TreeNode*)malloc(sizeof(TreeNode));
    if (node == NULL) {
        printf("Memory allocation failed!\n");
        exit(1);
    }
    node->data = data;
    node->left = NULL;
    node->right = NULL;
    return node;
}

// Traversals Functions
// printPreOrder Function to print preorder traversal (root -> left -> right)
void printPreOrder(TreeNode* node){
    // Condition to check if the Tree Node is empty or not
		if (node == NULL)
			return;

	// Accessing the root first
    printf("%d ", node->data);
	// Accessing the lest
	printPreOrder(node->left);
	// Accessing the right
	printPreOrder(node->right);
}

// printInOrder Function to print inorder traversal (left -> root -> right)
void printInOrder(TreeNode* node){
    // Condition to check if the Tree Node is empty or not
		if (node == NULL)
			return;

	// Accessing the left first
    printInOrder(node->left);
	// Accessing the root
	printf("%d ", node->data);
	// Accessing the right
	printInOrder(node->right);
}

// printPostOrder Function to print inorder traversal (left -> right -> root)
void printPostOrder(TreeNode* node){
    // Condition to check if the Tree Node is empty or not
		if (node == NULL)
			return;

	// Accessing the left first
    printPostOrder(node->right);
	// Accessing the lest
	printPostOrder(node->left);
	// Accessing the root
	printf("%d ", node->data);
}

// Array-based queue for level-order traversal

// QUEUE_FUNCTIONS_#######################################
// Initialize an empty queue
Queue* createQueue() {
    Queue* queue = (Queue*)malloc(sizeof(Queue));
    if (queue == NULL) {
        printf("Memory allocation failed!\n");
        exit(1);
    }
    
    queue->front = 0;
    queue->rear = -1;
    return queue;
}

// Add a tree node to the queue
void enqueue(Queue* queue, TreeNode* treeNode) {
    if (queue->rear >= MAX_QUEUE_SIZE - 1)
        return;
        
    queue->items[++queue->rear] = treeNode;
}

// Remove a tree node from the queue
TreeNode* dequeue(Queue* queue) {
    if (queue->front > queue->rear)
        return NULL;
    
    return queue->items[queue->front++];
}

// Check if the queue is empty
bool isEmpty(Queue* queue) {
    return queue->front > queue->rear;
}

// #######################################
// Print level-order traversal
void printLevelOrder(TreeNode* root) {
    if (root == NULL)
        return;
    
    // Creating the Queue
    Queue* queue = createQueue();
    
    // Enqueue the root in the queue
    enqueue(queue, root);
    
    // Loop until the queue is empty
    while (!isEmpty(queue)) {
        TreeNode* current = dequeue(queue);
        // Print the current node's data
        printf("%d ", current->data);
        // If the current node has a left child, add it to the queue
        if (current->left != NULL)
            enqueue(queue, current->left);
        // If the current node has a right child, add it to the queue    
        if (current->right != NULL)
            enqueue(queue, current->right);
    }
    // Free the Queue to prevent MemoryLeaks
    free(queue);
}



// Statistical Functions
// height Function to get the height of the Tree
int height(TreeNode* node){
    // Condition to check if the Tree Node is empty or not
	if (node == NULL)
		return 0;
	
	// Count the left path	
	int leftHeight = height(node->left);
	// Count the right path
	int rightHeight = height(node->right);
	// Compare & Get the maximum path
	return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;  // +1 is for the root
}

// size Function to get the size of the Tree
int size(TreeNode* node){
    // Condition to check if the Tree Node is empty or not
	if (node == NULL)
		return 0;
		
	// Iterating over right and left Nodes
	return size(node->right) + size(node->left) + 1;  // +1 is for the root
}

//countLeaves Function counts the number of leaf nodes (nodes with no children)
int countLeaves(TreeNode* node){
    // Condition to check if the Tree Node is empty or not
	if (node == NULL)
		return 0;
		
	// Condition if the Tree doesn't have any left & right paths
	if (node->right == NULL && node->left == NULL)
	    return 1;
	
	// Count the number of the left & right paths
	return countLeaves(node->left) + countLeaves(node->right) + 1;  // +1 is for the root    
}

// search Function to search for element in the Tree Nodes
bool search(TreeNode* node, int element){
    // Condition to check if the Tree Node is empty or not
	if (node == NULL)
		return false;
	
	// Condition if the element is the Root
	if(node->data == element)
		return true;

	// Iterating over right and left Nodes
	return search(node->left, element) || search(node->right, element);	
}

// max Function to find the maximum value in the tree.
int max(TreeNode* node) {
	// Condition to check if the Tree Node is empty or not
    if (node == NULL)
        return 0; 
	
    int maxVal = node->data;
    if (node->left != NULL) {
        int leftMax = max(node->left);
        maxVal = (leftMax > maxVal) ? leftMax : maxVal;
    }
    if (node->right != NULL) {
        int rightMax = max(node->right);
        maxVal = (rightMax > maxVal) ? rightMax : maxVal;
    }
    return maxVal;
}

// min Function to find the minimum value in the tree
int min(TreeNode* node) {
	// Condition to check if the Tree Node is empty or not
    if (node == NULL)
        return 0; 
	
    int minVal = node->data;
    if (node->left != NULL) {
        int leftMin = min(node->left);
        minVal = (leftMin < minVal) ? leftMin : minVal;
    }
    if (node->right != NULL) {
        int rightMin = min(node->right);
        minVal = (rightMin < minVal) ? rightMin : minVal;
    }
    return minVal;
}

// sum Function to compute the sum of all node values
int sum(TreeNode* node) {
	// Condition to check if the Tree Node is empty or not
    if (node == NULL)
        return 0;
    return node->data + sum(node->left) + sum(node->right);
}

// Free the tree to prevent memory leaks
void freeTree(TreeNode* node) {
	// Condition to check if the Tree Node is empty or not
    if (node == NULL)
        return;
    freeTree(node->left);
    freeTree(node->right);
    free(node);
}
