#include "BST.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>


int main() {
    Node* root = createTreeNode(10);;

    // Test inserting nodes: 10, 5, 15, 3, 7
    root = insert(root, 5);
    root = insert(root, 15);
    root = insert(root, 3);
    root = insert(root, 7);
    root = insert(root, 7); // To check how it will deal with duplicates

    printf("BST Preorder: ");
    printPreOrder(root);
    printf("\n");

    // Test searching
    printf("\n=== Search Tests ===\n");
    printf("BST Search 7: %d\n", search(root, 7)); // Expected: 1 (true)
    printf("BST Search 8: %d\n", search(root, 8)); // Expected: 0 (false)
    printf("\n");

    // Test deletions
    printf("=== Deleting 3 ===\n");
    root = delete(root, 3);
    printf("BST Preorder after deleting 3: ");
    printPreOrder(root);
    printf("\n");

    printf("=== Deleting 5 ===\n");
    root = delete(root, 5);
    printf("BST Preorder after deleting 5: ");
    printPreOrder(root);
    printf("\n");
    
    printf("=== Deleting 10 ===\n");
    root = delete(root, 10);
    printf("BST Preorder after deleting 10: ");
    printPreOrder(root);
    printf("\n");

    root = delete(root, 8);
    printf("BST Preorder after deleting 8 (not found): ");
    printPreOrder(root); 
    printf("\n");

    // Free the tree
    freeTree(root);
    return 0;
}

