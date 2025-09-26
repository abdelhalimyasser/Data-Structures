# 🌳 Binary Search Tree

This project provides a **C implementation** of a **Binary Search Tree (BST)**, a hierarchical data structure where each node has at most two children, with the left child containing values less than the parent and the right child containing values greater. The implementation is **iterative**, supporting key operations like insertion, deletion, searching, preorder traversal, and tree visualization. The project is designed for educational purposes, demonstrating efficient BST operations in C.

This project is part of a larger **"Data Structures"** repository that includes other data structures like Stack, Queue, etc.

---

## 🚀 Implementations

- **[BST Recursive Implementation](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Trees/Binary%20Search%20Tree%20(BST)/Implementation%20in%20C/Recursive%20Implementation)**: Uses recursive methods for all operations.
- **[BST Iterative Implementation](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Trees/Binary%20Search%20Tree%20(BST)/Implementation%20in%20C/Iterative%20Implementation)**: Uses iterative methods with loops.


---

## 📌 About Binary Search Tree

A **Binary Search Tree (BST)** is a tree data structure where each node has at most two children, and the left subtree contains only nodes with values less than the parent node, while the right subtree contains only nodes with values greater. BSTs are widely used for efficient searching, insertion, and deletion in applications like databases and file systems.

**Main Operations:**
- `createBST(data)` → Creates a new node with the given data.
- `insert(node, element)` → Inserts a new element into the BST, maintaining the BST property.
- `delete(node, element)` → Removes an element from the BST, handling cases for 0, 1, or 2 children.
- `search(node, element)` → Checks if an element exists in the BST.
- `printPreOrder(node)` → Traverses the tree in preorder (root → left → right).
- `freeTree(node)` → Frees the tree to prevent memory leaks.

💡 *This implementation handles integer values, with duplicates ignored during insertion. Any other functions check [this repo](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Trees/Binary%20Tree/Implementation%20in%20C)*

---

## 📂 Project Structure

```
Binary Search Tree (BST)
├── Implementation in C
│   ├── Iterative Implementation
│   │   ├── BST.c
│   │   ├── BST.h
│   │   └── main.c
│   ├── Recursive Implementation
│   │   ├── BST.c
│   │   ├── BST.h
│   │   └── main.c
|   └── README.md
```

- **Iterative Implementation**:
  - `main.c`: Contains the BST operations (`createBST`, `insert`, `delete`, `search`, `printPreOrder`, `freeTree`) and a test program.

- **Iterative**:
  - `BST.c`: Contains the BST operations in iterative implementation (`createBST`, `insert`, `delete`, `search`, `printPreOrder`, `freeTree`)
  - `BST.h`: Contains the BST header file.
  - `main.c`: Test program for both iterative BST.
- **Recursive**:
  - `BST.c`: Contains the BST operations in recursive implementation (`createBST`, `insert`, `delete`, `search`, `printPreOrder`, `freeTree`)
  - `BST.h`: Contains the BST header file.
  - `main.c`: Test program for both recursive BST. 
- **README.md**: This file, providing an overview of the BST project in C.

---

## 🧱 Example Usage

### 🌲 Sample Tree

The implementation is tested with the following BST:

- **Construction**: Insert 10, 5, 15, 3, 7, and a duplicate 7 (ignored).
- **Preorder Traversal**: `10 5 3 7 15`
- **Visual Representation**:
  ```
       15
    10
       5
          7
       3
  ```

### 🔁 Operations Output

- **Preorder Traversal**: `10 5 3 7 15`
- **Search**:
  - Search for 7: `1` (true)
  - Search for 8: `0` (false)
- **Delete Operations**:
  - Delete 3 (leaf): Preorder: `10 5 7 15`
  - Delete 5 (one child): Preorder: `10 7 15`
  - Delete 10 (two children): Preorder: `15 7`
  - Delete 8 (non-existent): Preorder: `15 7`

---

## 🛠️ Setup Instructions

### Run the C Implementation

#### Clone the Repository

```bash
git clone https://github.com/abdelhalimyasser/data-structures.git
cd Trees/Binary Search Tree (BST)/Implementation in C
```

#### Compile the Code

```bash
gcc main.c -o bst
```

#### Run the Program

```bash
./bst
```

**Note**: Ensure all code is in `main.c` or adjust to include a separate `BST.h` if split. The `main.c` file tests the implementation.

---

## 🧾 Notes

- The implementation uses **integer values** for simplicity (not generic).
- The iterative implementation uses loops, with O(1) space complexity for most operations (except `printPreOrder`, which use recursion).
- The `delete` function handles all cases: leaf nodes, nodes with one child, nodes with two children, and non-existent nodes.
- Memory leaks are prevented with `freeTree` and proper node deallocation in `insert` and `delete`.
- The `printTreeVisual` function provides a rotated ASCII representation of the tree for debugging.
- Part of a larger **Data Structures repository** with implementations of Stack, Queue, and more.

---

## 📬 Contact with me
<p align="left">
  <a href="https://linkedin.com/in/abdelhalimyasser"><img src="https://skillicons.dev/icons?i=linkedin" alt="LinkedIn" /></a>&nbsp;
  <a href="mailto:abdelhalimyasser88@gmail.com?subject=Collaboration&body=hi%2C%20abdelhalim%20-%20I%20want%20to%20collaborate%20with%20you%20in..."><img src="https://skillicons.dev/icons?i=gmail" alt="gmail" /></a>&nbsp;
  <a href="https://instagram.com/abdelhalim__yasser"><img src="https://skillicons.dev/icons?i=instagram" alt="Instagram" /></a>&nbsp;
  <a href="https://x.com/abdelhalimyass"><img width="48" height="48" alt="image" src="https://github.com/user-attachments/assets/e21830c6-ccff-4860-a839-02b817a519b8" alt="X" /></a>&nbsp;
  <a href="https://discord.com/abdelhalimyasser"><img src="https://skillicons.dev/icons?i=discord" alt="Discord" /></a>&nbsp;
  <a href="https://wechat.com/abdelhalimyasser"><img width="48" height="48" alt="image" src="https://github.com/user-attachments/assets/ac94c75c-1efe-4aff-aefc-e62a806f86e6" alt="Wechat" /></a>&nbsp;
  <a href="https://vk.com/abdelhalimyasser"><img width="48" height="48" alt="image" src="https://github.com/user-attachments/assets/c22a431c-b8b3-43de-a8a1-d2f20d55ad9c" alt="Vk" /></a>
</p>

---

# Happy Coding! 🚀
