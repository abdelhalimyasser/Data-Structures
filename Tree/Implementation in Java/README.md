# 🌳 Binary Tree in Java

This project implements a **binary tree data structure** in Java, focusing on tree traversal methods.  
It includes **pre-order, in-order, post-order, and level-order traversals**, with the level-order traversal optimized using a **Queue with ArrayDeque** for better time and space efficiency.  

This implementation is part of a larger **"Data Structures"** project that includes other data structures like Stack, Queue, etc.

---

# Folder Map

- **Tree.java**: Defines the Node and Tree classes with traversal methods.  
- **Main.java**: Contains example usage and testing of the tree implementation.  
- **README.md**: This file, documenting the Java implementation.  

---
## ✅ Features

### 🧱 Tree Basics

- **Node Class**: Represents a tree node with an integer value and left/right child pointers.  
- **Tree Class**:
  - `printPreOrder(Node node)` → Pre-order traversal (root → left → right).  
  - `printInOrder(Node node)` → In-order traversal (left → root → right).  
  - `printPostOrder(Node node)` → Post-order traversal (left → right → root).  
  - `printLevelOrder(Node node)` → Level-order traversal (breadth-first) using [ArrayDeque](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Queue/Double%20Ended%20Queue(Deque)/Implementation%20of%20Queue%20in%20Java) / [LinkedList](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Linked%20List/Linked%20List/Implementation%20of%20Linked%20List%20in%20Java).  

---

## 🚀 Example Usage

### 📂 The Tree Shape that we make 

```java
     //      1
		//      /  \
		//     2    3
		//    /\    /\
		//   4  5  6  7

// Create a Tree
Tree tree = new Tree();

// Create the Nodes
Node root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);
root.left.left = new Node(4);
root.left.right = new Node(5);
root.right.left = new Node(6);
root.right.right = new Node(7);
```
### 🔁 Traversals Functions

``` java
// Test traversals
System.out.println("PreOrder Traversal:");
tree.printPreOrder(root); // Output: 1 2 4 5 3 6 7 

System.out.println("InOrder Traversal:");
tree.printInOrder(root); // Output: 4 2 5 1 6 3 7 

System.out.println("PostOrder Traversal:");
tree.printPostOrder(root); // Output: 4 5 2 6 7 3 1

System.out.println("LevelOrder Traversal:");
tree.printLevelOrder(root); // Output: 1 2 3 4 5 6 7
```
### 📊 Statistical Functions

```java
// height
System.out.println("Height of the tree: " + tree.height(root));  // Output: 3

// size
System.out.println("Size of the tree: " + tree.size(root));  // Output: 7

// leaf count
System.out.println("Number of leaf nodes: " + tree.countLeaves(root));  // Output: 7

// search
int searchValue = 4;
System.out.println("Is " + searchValue + " found? " + tree.search(root, searchValue));  // Output: true
```

---

## 🧱 Algorithm Steps

1. Define a Node class with `integer data` and `left`/`right` child pointers.
2. Define a Tree class with methods for traversals.
3. Implement `recursive traversals` (`pre`, `in`, `post`) using DFS.
4. Implement `level-order traversal` using `ArrayDeque` / `LinkedList`.
5. Implement `recursive statistical Functions` (`height`, `size` , `leafCount`, `search`).
6. Handle edge cases `empty tree` / `null nodes`.

---

## 📂 Requirements

- Java 8 or higher.
- Basic knowledge of `binary trees` & `queues` & `linkedlist`.
- A Java IDE `IntelliJ IDEA`, `Eclipse` or `command-line compiler`.

---

## 🧾 Notes

- Implementation uses `integer values` only.
- Level-order traversal optimized with `ArrayDeque`.
- All code for `educational purposes`.
- Part of a larger `Data Structures repository`.

---

## 🛠️ Setup Instructions

### Clone the Repository

```
git clone https://github.com/abdelhalim-yasser/data-structures.git
cd data-structures/Tree/Implementation\ in\ Java
```
### Compile the Code

```
javac Main.java
```

### Run the Program

```
java Main
```
---

## 📬 Contact

For feedback or contributions:

- GitHub: [abdelhalim-yasser](https://github.com/abdelhalim-yasser)
- LinkedIn: [abdelhalim-yasser](https://www.linkedin.com/in/abdelhalim-yasser)

---

# Happy Coding! 🚀
