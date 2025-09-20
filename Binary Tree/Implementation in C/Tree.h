#ifndef TREE_H_INCLUDED
#define TREE_H_INCLUDED

// Node structure for the tree
typedef struct TreeNode{
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
}TreeNode;

// Queue structure
typedef struct Queue{
    TreeNode* items[MAX_QUEUE_SIZE];
    int front;
    int rear;
} Queue;

// Create Tree
TreeNode* createTreeNode(int data);

// Traversals Functions
// printPreOrder Function to print preorder traversal (root -> left -> right)
void printPreOrder(TreeNode* node);

// printInOrder Function to print inorder traversal (left -> root -> right)
void printInOrder(TreeNode* node);

// printPostOrder Function to print inorder traversal (left -> right -> root)
void printPostOrder(TreeNode* node);

// printLevelOrder Function to print Level-order traversal
void printLevelOrder(Node node);

// Array-based queue for level-order traversal
// QUEUE_FUNCTIONS_#######################################
// Initialize an empty queue
Queue* createQueue();

// Add a tree node to the queue
void enqueue(Queue* queue, TreeNode* treeNode);

// Remove a tree node from the queue
TreeNode* dequeue(Queue* queue);

// Check if the queue is empty
bool isEmpty(Queue* queue);

// #######################################

// Print level-order traversal
void printLevelOrder(TreeNode* root);

// Statistical Functions
// height Function to get the height of the Tree
int height(TreeNode* node);

// size Function to get the size of the Tree
int size(TreeNode* node);

//countLeaves Function counts the number of leaf nodes (nodes with no children)
int countLeaves(TreeNode* node);

// search Function to search for element in the Tree Nodes
bool search(TreeNode* node, int element);

// Free the tree to prevent memory leaks
void freeTree(TreeNode* node);


#endif // TREE_H_INCLUDED
