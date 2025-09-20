#include "Tree.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
    // The Tree Shape
	//        1
	//      /  \
	//     2    3
	//    /\   /\
	//   4 5   6 7
    
    // Create the Nodes
    TreeNode* root = createTreeNode(1);
    root->left = createTreeNode(2);
    root->right = createTreeNode(3);
    root->left->left = createTreeNode(4);
    root->left->right = createTreeNode(5);
    root->right->left = createTreeNode(6);
	root->right->right = createTreeNode(7);
    
    // Test PreOrder traversal
    printf("PreOrder Traversal: ");
    printPreOrder(root);
    printf("\n");

    // Test InOrder traversal
    printf("InOrder Traversal: ");
    printInOrder(root);
    printf("\n");
    
    // Test PostOrder traversal
    printf("PostOrder Traversal: ");
    printPostOrder(root);
    printf("\n");
    
    // Test LevelOrder traversal
    printf("LevelOrder Traversal: ");
    printLevelOrder(root);
    printf("\n");
    
    // Test height
    printf("Height of the tree: %d\n", height(root));
    
    // Test size
    printf("Size of the tree: %d\n", size(root));
    
    // Test leaf count
    printf("Number of leaf nodes: %d\n", countLeaves(root));
	
	// Test max
    printf("Maximum value: %d\n", max(root));

	// Test min
    printf("Minimum value: %d\n", min(root));
    
	// Test Sum
    printf("Sum of all nodes: %d\n", sum(root));
    
	// Test search
    printf("Is 4 present? %s\n", search(root, 4) ? "true" : "false");
    printf("Is 6 present? %s\n", search(root, 10) ? "true" : "false");

    // Free the tree
    freeTree(root);

    return 0;
}
