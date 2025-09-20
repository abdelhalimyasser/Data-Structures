# 🌳 Tree

This project provides implementations of a **binary tree data structure** in C and Java, focusing on tree traversal methods and statistical operations. It includes **pre-order, in-order, post-order, and level-order traversals**, along with functions to compute the tree's height, size, leaf count, and search for values. The implementations are optimized for memory efficiency, with the C version using an **array-based queue** and the Java version using a **Queue with ArrayDeque**.

This project is part of a larger **"Data Structures"** repository that includes other data structures like Stack, Queue, etc.

---

## 🚀 Implementations

- **[Tree in C](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Tree/Implementation%20in%20C)**
- **[Tree in Java](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Tree/Implementation%20in%20Java)**

---

## 🌐 Try it Online

Explore the **interactive binary tree visualization** to see traversals and operations in action:  
👉 **[Live Demo](https://abdelhalim-yasser.github.io/Tree/)** *(Coming soon!)*

---

## 📌 About Tree

A **tree** is a hierarchical data structure where each node has at most two children, referred to as the **left child** and **right child**. It is widely used in applications like expression trees, binary search trees, and hierarchical data representation.

**Main Operations:**
- `createTreeNode(data)` → Create a new tree node with the given data.
- `printPreOrder(node)` → Traverse the tree in pre-order (root → left → right).
- `printInOrder(node)` → Traverse the tree in in-order (left → root → right).
- `printPostOrder(node)` → Traverse the tree in post-order (left → right → root).
- `printLevelOrder(node)` → Traverse the tree level by level (breadth-first).
- `height(node)` → Compute the height of the tree.
- `size(node)` → Count the total number of nodes.
- `countLeaves(node)` → Count the number of leaf nodes (nodes with no children).
- `search(node, value)` → Check if a value exists in the tree.

💡 *Each implementation folder contains the same core functionality, with language-specific optimizations and additional features.*

---

## 📂 Project Structure

```
Tree
├── Implementation in C
│   ├── README.md
│   ├── Tree.c
│   ├── Tree.h
│   └── main.c
├── Implementation in Java
│   ├── Main.java
│   ├── README.md
│   └── Tree.java
└── README.md
```

- **Implementation in C**:
  - `Tree.h`: Header file defining the `TreeNode` structure and function prototypes.
  - `Tree.c`: Implementation of tree operations (traversals, statistical functions).
  - `main.c`: Test program demonstrating the tree operations.
  - `README.md`: Documentation for the C implementation.
- **Implementation in Java**:
  - `Tree.java`: Defines the `Node` and `Tree` classes with traversal and statistical methods.
  - `Main.java`: Test program demonstrating the tree operations.
  - `README.md`: Documentation for the Java implementation.
- **README.md**: This file, providing an overview of the binary tree project.

---

## 🧱 Example Usage

### 🌲 Sample Tree

Both implementations use the following binary tree for testing:

```
       1
      / \
     2   3
    / \ / \
   4   5 6  7
```

### 🔁 Traversals Output

- **Pre-order**: `1 2 4 5 3 6 7`
- **In-order**: `4 2 5 1 6 3 7`
- **Post-order**: `4 5 2 6 7 3 1`
- **Level-order**: `1 2 3 4 5 6 7`

### 📊 Statistical Output

- **Height**: `3`
- **Size**: `7`
- **Leaf Count**: `4` (nodes 4, 5, 6, 7)
- **Search for 4**: `true`

---

## 🛠️ Setup Instructions

### Run the C Implementation
#### Clone the Repository

```bash
git clone https://github.com/abdelhalim-yasser/data-structures.git
cd data-structures/Tree/Implementation\ in\ C
```

#### Compile the Code

```bash
gcc main.c -o tree
```

#### Run the Program

```bash
./tree
```


### Run the Java Implementation

#### Clone the Repository

```bash
git clone https://github.com/abdelhalim-yasser/data-structures.git
cd data-structures/Tree/Implementation\ in\ Java
```
#### Compile the Code

```bash
javac Main.java
```

#### Run the Program

```bash
java Main
```

---

## 🧾 Notes

- Both implementations use **integer values** for simplicity (not generic).
- The C implementation uses an **array-based queue** (~8 bytes per node) for level-order traversal, optimizing memory usage and cache locality.
- The Java implementation uses **ArrayDeque** (~8 bytes per node) for level-order traversal, leveraging Java's efficient collections.
- All code is designed for **educational purposes** to demonstrate binary tree operations.
- Part of a larger **Data Structures repository** with implementations of Stack, Queue, and more.

---


## 📬 Contact

For feedback or contributions:

- GitHub: [abdelhalimyasser](https://github.com/abdelhalimyasser)
- LinkedIn: [abdelhalimyasser](https://www.linkedin.com/in/abdelhalimyasser)

---

# Happy Coding! 🚀
