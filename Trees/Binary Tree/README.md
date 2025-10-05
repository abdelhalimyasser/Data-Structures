# 🌳 Binary Tree

This project provides implementations of a **tree data structure** in C and Java, focusing on tree traversal methods and statistical operations. It includes **pre-order (VLR), in-order (LVR), post-order (LRV), and level-order traversals**, along with functions to compute the tree's height, size, leaf count, and search for values. The implementations are optimized for memory efficiency, with the C version using an **array-based queue** and the Java version using a **Queue with ArrayDeque**.

This project is part of a larger **"Data Structures"** repository that includes other data structures like Stack, Queue, etc.

---

## 🚀 Implementations

- **[Binary Tree in C](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Trees/Binary%20Tree/Implementation%20in%20C)**
- **[Binary Tree in Java](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Trees/Binary%20Tree/Implementation%20in%20Java)**

---

## 🌐 Try it Online

Explore the **interactive binary tree visualization** to see traversals and operations in action:  
👉 **[Live Demo](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Binary%20Tree%20Visualizer.html)**

---

## 📌 About Tree

A **Binary Tree** is a hierarchical data structure where each node has at most two children, referred to as the **left child** and **right child**. It is widely used in applications like expression trees, binary search trees, and hierarchical data representation.

**Main Operations:**
- `createTreeNode(data)` → Create a new tree node with the given data.
- `printPreOrder(node)` → Traverse the tree in pre-order (root → left → right).
- `printInOrder(node)` → Traverse the tree in in-order (left → root → right).
- `printPostOrder(node)` → Traverse the tree in post-order (left → right → root).
- `printLevelOrder(node)` → Traverse the tree level by level (breadth-first).
- `height(node)` → Compute the height of the tree.
- `size(node)` → Count the total number of nodes.
- `countLeaves(node)` → Count the number of leaf nodes (nodes with no children).
- `max(node)` → Find the maximum value in the tree.
- `min(node)` → Find the minimum value in the tree.
- `sum(node)` → Compute the sum of all node values.
- `search(node, value)` → Check if a value exists in the tree.

💡 *Each implementation folder contains the same core functionality, with language-specific optimizations and additional features.*

---

## 📂 Project Structure

```
Binary Tree
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

## 📈 Performance

| Operation             | C Time Complexity | Java Time Complexity |
|-----------------------|-------------------|----------------------|
| `createTreeNode`      | O(1)             | O(1)                |
| `printPreOrder`       | O(n)             | O(n)                |
| `printInOrder`        | O(n)             | O(n)                |
| `printPostOrder`      | O(n)             | O(n)                |
| `printLevelOrder`     | O(n)             | O(n)                |
| `height`              | O(n)             | O(n)                |
| `size`                | O(n)             | O(n)                |
| `countLeaves`         | O(n)             | O(n)                |
| `max`                 | O(n)             | O(n)                |
| `min`                 | O(n)             | O(n)                |
| `sum`                 | O(n)             | O(n)                |
| `search`              | O(n)             | O(n)                |
| `freeTree` (C only)   | O(n)             | N/A                 |

**Space Complexity**: 
- O(h) for recursive operations (`printPreOrder`, `printInOrder`, `printPostOrder`, `height`, `size`, `countLeaves`, `max`, `min`, `sum`, `search`, `freeTree`), where `h` is the height of the tree, due to the recursion stack. In a balanced tree, `h = O(log n)`; in a skewed tree, `h = O(n)`.
- O(w) for `printLevelOrder`, where `w` is the maximum width of the tree (maximum number of nodes at any level), due to the queue. In a balanced tree, `w = O(n/2) ≈ O(n)`; in a skewed tree, `w = O(1)`.
- `createTreeNode` uses O(1) auxiliary space (excluding the node itself).
- The tree structure itself requires O(n) space for `n` nodes.

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
- **Maximum Value**: `7`
- **Minimum Value**: `1`
- **Sum of Nodes**: `28`
- **Search for 4**: `true`

---

## 🛠️ Setup Instructions

### Run the C Implementation
#### Clone the Repository

```bash
git clone https://github.com/abdelhalim-yasser/data-structures.git
cd Trees/Binary Tree/Implementation in C
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
cd Trees/Binary Tree/Implementation in C
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

For questions, suggestions, or collaboration, reach out via:  
<p align="left">
  <a href="https://linkedin.com/in/abdelhalimyasser"><img src="https://skillicons.dev/icons?i=linkedin" alt="LinkedIn" /></a>&nbsp;
  <a href="mailto:abdelhalimyasser88@gmail.com?subject=Collaboration&body=hi%2C%20abdelhalim%20-%20I%20want%20to%20collaborate%20with%20you%20in..."><img src="https://skillicons.dev/icons?i=gmail" alt="Gmail" /></a>&nbsp;
  <a href="https://instagram.com/abdelhalim__yasser"><img src="https://skillicons.dev/icons?i=instagram" alt="Instagram" /></a>&nbsp;
  <a href="https://x.com/abdelhalimyass"><img width="48" height="48" src="https://github.com/user-attachments/assets/e21830c6-ccff-4860-a839-02b817a519b8" alt="X" /></a>&nbsp;
  <a href="https://discord.com/abdelhalimyasser"><img src="https://skillicons.dev/icons?i=discord" alt="Discord" /></a>&nbsp;
  <a href="https://wechat.com/abdelhalimyasser"><img width="48" height="48" src="https://github.com/user-attachments/assets/ac94c75c-1efe-4aff-aefc-e62a806f86e6" alt="Wechat" /></a>&nbsp;
  <a href="https://vk.com/abdelhalimyasser"><img width="48" height="48" src="https://github.com/user-attachments/assets/c22a431c-b8b3-43de-a8a1-d2f20d55ad9c" alt="Vk" /></a>
</p>

---

# Happy Coding! 🚀
