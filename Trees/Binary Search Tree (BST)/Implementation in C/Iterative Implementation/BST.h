#ifndef BST_H_INCLUDED
#define BST_H_INCLUDED

// Create Tree
TreeNode* createTreeNode(int data);

// Insert Function to insert elements in the tree
Node insert(Node node, int element);

// Delete Function to delete element in the tree
TreeNode* delete(Node node, int element);

// search Function to search about specific element in the tree
bool search(Node node, int element);

// Traversals Function
// printPreOrder Function to print preorder traversal (root -> left -> right)
void printPreOrder(Node node);

#endif // BST_H_INCLUDED
