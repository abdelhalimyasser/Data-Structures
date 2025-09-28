# 🌲 Trees

## 📌 About Trees

A **Tree** is a hierarchical data structure consisting of nodes connected by edges, with a single root node and no cycles. Each node may have zero or more child nodes. This folder contains various tree-based data structures, including **AVL Tree**, **Binary Heap**, **Binary Search Tree (BST)**, and **Binary Tree**, each designed to serve specific purposes such as balanced searching, priority queuing, or general hierarchical organization. These implementations are optimized for educational purposes, demonstrating tree operations in both `C` and `Java`.

**Main Operations (Common Across Implementations):**
- `insert/add` → Add a node to the tree (position varies by tree type).
- `delete/remove` → Remove a node from the tree (position varies by tree type).
- `search/find` → Find a node with a given value.
- `isEmpty` → Check if the tree is empty.
- `traverse` → Traverse the tree (`inorder`, `preorder`, `postorder` for `BST`/`Binary Tree`, `level-order`).

💡 *Each implementation folder contains common functions and some unique ones (e.g., balancing for AVL, heapify for Binary Heap), but the core logic of tree operations is consistent. The implementations are designed for learning purposes.*

---

## 🚀 Implementations

- **[AVL Tree](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Trees/AVL%20Tree)**: A self-balancing binary search tree where the height difference between left and right subtrees is at most 1.
- **[Binary Heap](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Trees/Binary%20Heap)**: A complete binary tree that satisfies the heap property, used for priority queues.
- **[Binary Search Tree (BST)](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Trees/Binary%20Search%20Tree)**: A binary tree where each node's left subtree contains smaller values and right subtree contains larger values.
- **[Binary Tree](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Trees/Binary%20Tree)**: A general tree where each node has at most two children, used for hierarchical data representation.

---

## 🌐 Try it Online

You can try the **interactive tree visualizations** here:  
**👉 [Binary Search Tree Live Demo](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Binary%20Tree%20Visualizer.html)** 

---

## 📂 Project Structure

```
├── Trees
    ├── AVL Tree
    │   ├── Implementation in C
    │   │   ├── AVLTree.c
    │   │   ├── AVLTree.h
    │   │   ├── main.c
    │   │   └── README.md
    │   ├── Implementation in Java
    │   │   ├── AVLTree.java
    │   │   ├── Node.java
    │   │   ├── Main.java
    │   │   └── README.md
    ├── Binary Heap
    │   ├── Implementation in C
    │   │   ├── BinaryHeap.c
    │   │   ├── BinaryHeap.h
    │   │   ├── main.c
    │   │   └── README.md
    │   ├── Implementation in Java
    │   │   ├── BinaryHeap.java
    │   │   ├── Node.java
    │   │   ├── Main.java
    │   │   └── README.md
    ├── Binary Search Tree
    │   ├── Implementation in C
    │   │   ├── BST.c
    │   │   ├── BST.h
    │   │   ├── main.c
    │   │   └── README.md
    │   ├── Implementation in Java
    │   │   ├── BST.java
    │   │   ├── Node.java
    │   │   ├── Main.java
    │   │   └── README.md
    ├── Binary Tree
    │   ├── Implementation in C
    │   │   ├── BinaryTree.c
    │   │   ├── BinaryTree.h
    │   │   ├── main.c
    │   │   └── README.md
    │   ├── Implementation in Java
    │   │   ├── BinaryTree.java
    │   │   ├── Node.java
    │   │   ├── Main.java
    │   │   └── README.md
    └── README.md
```

---

💡 *This project is made for learning purposes and to demonstrate tree operations visually.*
