#ifndef TREE_H_INCLUDED
#define TREE_H_INCLUDED

// Node structure for the tree
typedef struct{
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
}TreeNode;

// Create Tree
void createTree(int root);

// Traversals Functions
// printPreOrder Function to print preorder traversal (root -> left -> right)
void printPreOrder(Node node);

// printInOrder Function to print inorder traversal (left -> root -> right)
void printInOrder(Node node);

// printPostOrder Function to print inorder traversal (left -> right -> root)
void printPostOrder(Node node);

// printLevelOrder Function to print Level-order traversal
void printLevelOrder(Node node);


// Statistical Functions
// height Function to get the height of the Tree
int height(Node node);

// size Function to get the size of the Tree
int size(Node node);

//countLeaves Function counts the number of leaf nodes (nodes with no children)
int countLeaves(Node node);

// search Function to search for element in the Tree Nodes
bool search(Node node, int element);

#endif // TREE_H_INCLUDED
