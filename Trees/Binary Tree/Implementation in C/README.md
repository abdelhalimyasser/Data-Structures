# 🌳 Binary Tree in C

This project implements a **binary tree data structure** in C, focusing on tree traversal methods and statistical operations.  
It includes **pre-order, in-order, post-order, and level-order traversals**, with the level-order traversal optimized using an **array-based queue** for better time and space efficiency.  

This implementation is part of a larger **"Data Structures"** project that includes other data structures like Stack, Queue, etc.

---

# 📂 Folder Map

- **main.c**: Contains the `TreeNode` structure, queue implementation, tree operations, and a test program.  
- **README.md**: This file, documenting the C implementation.  

---

## ✅ Features

### 🧱 Tree Basics

- **TreeNode Structure**: Represents a tree node with an integer value and left/right child pointers.  
- **Tree Operations**:
  - `createTreeNode(int data)` → Creates a new tree node with the given data.  
  - `printPreOrder(TreeNode* node)` → Pre-order traversal (root → left → right).  
  - `printInOrder(TreeNode* node)` → In-order traversal (left → root → right).  
  - `printPostOrder(TreeNode* node)` → Post-order traversal (left → right → root).  
  - `printLevelOrder(TreeNode* node)` → Level-order traversal (breadth-first) using an array-based queue.  
  - `freeTree(TreeNode* node)` → Frees the tree to prevent memory leaks.

### 📊 Statistical Functions

- `height(TreeNode* node)` → Computes the height of the tree.  
- `size(TreeNode* node)` → Counts the total number of nodes.  
- `countLeaves(TreeNode* node)` → Counts the number of leaf nodes (nodes with no children).
- `max(node)` → Find the maximum value in the tree.
- `min(node)` → Find the minimum value in the tree.
- `sum(node)` → Compute the sum of all node values.
- `search(TreeNode* node, int element)` → Checks if a value exists in the tree.

---

## 🚀 Example Usage

### 🌲 The Tree Shape that We Make 

```c
         //      1
         //     /  \
         //    2    3
         //   / \  / \
         //  4   5 6  7

// Create a Tree
TreeNode* root = createTreeNode(1);
root->left = createTreeNode(2);
root->right = createTreeNode(3);
root->left->left = createTreeNode(4);
root->left->right = createTreeNode(5);
root->right->left = createTreeNode(6);
root->right->right = createTreeNode(7);
```

### 🔁 Traversal Functions

```c
printf("PreOrder Traversal: ");
printPreOrder(root); // Output: 1 2 4 5 3 6 7
printf("\n");

printf("InOrder Traversal: ");
printInOrder(root); // Output: 4 2 5 1 6 3 7
printf("\n");

printf("PostOrder Traversal: ");
printPostOrder(root); // Output: 4 5 2 6 7 3 1
printf("\n");

printf("LevelOrder Traversal: ");
printLevelOrder(root); // Output: 1 2 3 4 5 6 7
printf("\n");
```

### 📊 Statistical Functions

```c
// height
printf("Height of the tree: %d\n", height(root)); // Output: 3

// size
printf("Size of the tree: %d\n", size(root)); // Output: 7

// leaf count
printf("Number of leaf nodes: %d\n", countLeaves(root)); // Output: 4

// Test max
printf("Maximum value: %d\n", max(root));  // Output: 7

// Test min
printf("Minimum value: %d\n", min(root));  // Output: 1
    
// Test Sum
printf("Sum of all nodes: %d\n", sum(root));  // Output: 28

// search
int searchValue = 4;
printf("Is %d found? %s\n", searchValue, search(root, searchValue) ? "true" : "false"); // Output: true
```

---

## 🧱 Algorithm Steps

1. Define a `TreeNode` structure with `integer data` and `left`/`right` child pointers.
2. Implement `createTreeNode` to allocate and initialize nodes using `malloc`.
3. Implement `recursive traversals` (`pre`, `in`, `post`) using depth-first search (DFS).
4. Implement `level-order traversal` using an array-based queue for FIFO operations.
5. Implement `recursive statistical functions` (`height`, `size`, `countLeaves`, `search`).
6. Handle edge cases (`empty tree`/`null nodes`) and memory management with `freeTree`.

---

## 📂 Requirements

- A C compiler (e.g., GCC, Clang).
- Standard C libraries (`stdio.h`, `stdlib.h`, `stdbool.h`).
- Basic knowledge of `binary trees`, `queues`, and `pointers`.

---

## 🧾 Notes

- Implementation uses `integer values` only.
- Level-order traversal is optimized with an `array-based queue` for memory efficiency.
- All code is designed for `educational purposes`.
- Part of a larger `Data Structures repository`.

---

## 🛠️ Setup Instructions

### Clone the Repository

```bash
git clone https://github.com/abdelhalim-yasser/data-structures.git
cd data-structures/Tree/Implementation\ in\ C
```

### Compile the Code

```bash
gcc main.c -o tree
```

### Run the Program

```bash
./tree
```

---

## 📬 Contact

For feedback or contributions:

- GitHub: [abdelhalimyasser](https://github.com/abdelhalimyasser)
- LinkedIn: [abdelhalimyasser](https://www.linkedin.com/in/abdelhalimyasser)

---

# Happy Coding! 🚀
