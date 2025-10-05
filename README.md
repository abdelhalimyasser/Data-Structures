# 📚 Data Structures

## 📌 Overview

This repository is a comprehensive collection of fundamental **data structures** implemented in **C** and **Java**, designed for educational purposes. It includes implementations of **Linked Lists**, **Queues**, **Stacks**, **Trees**, and **Binary Heaps**, each organized into subfolders with detailed code, documentation, and test programs. The repository aims to provide clear, efficient, and well-documented implementations to help learners understand the mechanics of data structures and their applications in computer science, such as searching, sorting, and task scheduling.

Each data structure is implemented iteratively (and recursively where applicable, e.g., Binary Search Tree), with a focus on clarity and performance. The repository includes both C (using pointers and manual memory management) and Java (using object-oriented principles and garbage collection) implementations to cater to different programming paradigms.

---

## 🚀 Features

- **Multiple Data Structures**: Includes Linked Lists (`Singly`, `Doubly`, `Queue`, `Stack`), Queues (`Array-based`, `Circular`, `Deque`), Stacks, Trees (`Binary`, `BST`), and Binary Heaps (`Max Heap`, `Min Heap`).
- **Dual Implementations**: Each data structure is implemented in both `C` and `Java`, showcasing language-specific approaches.
- **Educational Focus**: Well-commented code, detailed READMEs in each subfolder, and test programs to demonstrate functionality.
- **Interactive Visualizations**: Links to online tools for visualizing data structure operations.
- **Open Source**: Licensed under the included [LICENSE](./LICENSE) file.

---

## 📂 Project Structure

```
├── Binary Heap
    ├── Max Heap
    │   ├── Implementation in C
    │   │   ├── main.c
    │   │   ├── maxHeap.c
    │   │   └── maxHeap.h
    │   ├── Implementation in Java
    │   │   ├── Main.java
    │   │   └── MaxHeap.java
    │   └── README.md
    ├── Min Heap
    │   ├── Implementation in C
    │   │   ├── README.md
    │   │   ├── main.c
    │   │   ├── minHeap.c
    │   │   └── minHeap.h
    │   ├── Implementation in Java
    │   │   ├── Main.java
    │   │   ├── MinHeap.java
    │   │   └── README.md
    │   └── README.md
    └── README.md
├── LICENSE
├── Linked List
    ├── Doubly Linked List
    │   └── README.md
    ├── Linked List
    │   ├── Implementation of Linked List in C
    │   │   └── Readme.md
    │   ├── Implementation of Linked List in Java
    │   │   ├── LinkedList.java
    │   │   ├── Main.java
    │   │   └── Readme.md
    │   └── README.md
    ├── Linked Queue
    │   ├── Implementation in C
    │   │   ├── LinkedQueue.c
    │   │   ├── LinkedQueue.h
    │   │   ├── README.md
    │   │   └── main.c
    │   ├── Implementation in Java
    │   │   ├── LinkedQueue.java
    │   │   ├── Main.java
    │   │   ├── Node.java
    │   │   └── README.md
    │   └── README.md
    ├── Linked Stack
    │   ├── Implementation in C
    │   │   ├── LinkedStack.c
    │   │   ├── LinkedStack.h
    │   │   ├── README.md
    │   │   └── main.c
    │   ├── Implementation in Java
    │   │   ├── LinkedStack.java
    │   │   ├── Main.java
    │   │   ├── Node.java
    │   │   └── README.md
    │   └── README.md
    └── Readme.md
├── Queue
    ├── Circular Queue
    │   ├── Implementation of Circular Queue in C
    │   │   ├── Circular Queue.c
    │   │   ├── Circular Queue.h
    │   │   ├── Main.c
    │   │   └── Readme.md
    │   ├── Implementation of Circular Queue in Java
    │   │   ├── Circular Queue.java
    │   │   ├── Main.java
    │   │   └── Readme.md
    │   └── README.md
    ├── Double Ended Queue(Deque)
    │   ├── Implementation of Queue in C
    │   │   ├── Deque.c
    │   │   ├── Deque.h
    │   │   ├── Main.c
    │   │   └── README.md
    │   ├── Implementation of Queue in Java
    │   │   ├── Deque.java
    │   │   ├── Main.java
    │   │   └── Readme.md
    │   └── Readme.md
    ├── Queue
    │   ├── Implementation of Queue in C
    │   │   ├── Queue.c
    │   │   ├── Queue.h
    │   │   ├── Readme.md
    │   │   └── main.c
    │   ├── Implementation of Queue in Java
    │   │   ├── Main.java
    │   │   ├── Queue.java
    │   │   └── Readme.md
    │   └── Readme.md
    └── README.md
├── Stack
    ├── Implementation of Stack in C
    │   ├── Readme.md
    │   ├── Stack.c
    │   ├── Stack.h
    │   └── main.c
    ├── Implementation of Stack in Java
    │   ├── Main.java
    │   ├── Readme.md
    │   └── Stack.java
    └── Readme.md
└── Trees
    ├── Binary Search Tree (BST)
        ├── Implementation in C
        │   ├── Iterative Implementation
        │   │   ├── BST.c
        │   │   ├── BST.h
        │   │   └── main.c
        │   ├── README.md
        │   └── Recursive Implementation
        │   │   ├── BST.c
        │   │   ├── BST.h
        │   │   └── main.c
        └── Implementation in Java
        │   ├── Iterative Implementation
        │       ├── BST.java
        │       ├── Main.java
        │       └── Node.java
        │   ├── README.md
        │   └── Recursive Implementation
        │       ├── BST.java
        │       ├── Main.java
        │       └── Node.java
    ├── Binary Tree
        ├── Implementation in C
        │   ├── README.md
        │   ├── Tree.c
        │   ├── Tree.h
        │   └── main.c
        ├── Implementation in Java
        │   ├── Main.java
        │   ├── Node.java
        │   ├── README.md
        │   └── Tree.java
        └── README.md
    └── README.md
```

---

## 📌 Data Structures Overview

This repository organizes data structures into five main categories, each with multiple implementations:

- **Binary Heap**: A complete binary tree used for priority queues.
  - **Max Heap**: Parent nodes are greater than or equal to children.
  - **Min Heap**: Parent nodes are less than or equal to children.
- **Linked List**: Linear data structures using nodes with dynamic memory allocation.
  - **Singly Linked List**: `Nodes` link to the next node, optimized for sequential access.
  - **Doubly Linked List**: `Nodes` link to both next and previous nodes for bidirectional traversal.
  - **Linked Queue**: A `FIFO` queue implemented using a singly linked list.
  - **Linked Stack**: A `LIFO` stack implemented using a singly linked list.
- **Queue**: `FIFO` data structures for ordered processing.
  - **Array-based Queue**: A fixed-size queue using an `array`.
  - **Circular Queue**: An `array-based` queue with wrap-around for efficient space usage.
  - **Double Ended Queue (Deque)**: Allows insertion and deletion at both ends.
- **Stack**: `LIFO` data structure for applications like function call stacks.
  - Implemented using arrays in both C and Java.
- **Trees**: Hierarchical data structures for efficient searching and organization.
  - **Binary Tree**: `Nodes` with at most two children for general hierarchical data.
  - **Binary Search Tree (BST)**: `Nodes` organized by value for efficient searching, with both `iterative` and `recursive` implementations.

Each subfolder contains `C` and `Java` implementations (where applicable), with source code, header/class files, test programs (`main.c` or `Main.java`), and a dedicated `README.md` for detailed documentation.

---

## 🌐 Try it Online

Explore interactive visualizations for the data structures:  
- 👉 **[Linked List Visualizer](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Linked%20List%20Visualizer.html)**  
- 👉 **[Queue Visualizer](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Queue%20Visualizer.html)**  
- 👉 **[Stack Visualizer](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Stack%20Visualizer.html)**   
- 👉 **[Binary Search Tree Visualizer](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Binary%20Tree%20Visualizer.html)**

---

## 🛠️ Setup Instructions

### Prerequisites
- **C**: A C compiler (e.g., `gcc`).
- **Java**: Java Development Kit (JDK) 8 or higher.
- **Git**: For cloning the repository.

### Clone the Repository
```bash
git clone https://github.com/abdelhalimyasser/data-structures.git
cd data-structures
```

### Run C Implementations
1. Navigate to the desired subfolder (e.g., `Linked List/Linked Queue/Implementation in C`).
2. Compile and run:
   ```bash
   gcc main.c <SourceFile>.c -o main
   ./main
   ```
   *Note*: Ensure the corresponding header file (e.g., `LinkedQueue.h`) is included.

### Run Java Implementations
1. Navigate to the desired subfolder (e.g., `Linked List/Linked Queue/Implementation in Java`).
2. Compile and run:
   ```bash
   javac *.java
   java Main
   ```
   *Note*: Ensure all Java files (e.g., `LinkedQueue.java`, `Node.java`, `Main.java`) are compiled together.

---

## 📝 Notes

- **Implementations**: Most data structures are implemented in both C (using pointers and manual memory management) and Java (using object-oriented principles). Some subfolders may currently have partial implementations; check subfolder READMEs for details.
- **Performance**: Core operations (e.g., insert, delete, search) are designed for efficiency, typically O(1) for stack/queue operations and O(log n) or O(n) for tree operations, depending on the structure.
- **Error Handling**:
  - C: Handles underflow/overflow with error messages and return values (e.g., -1 or -999 for empty dequeue).
- **Memory Management**:
  - C: Uses `free` functions to prevent memory leaks.
  - Java: Relies on garbage collection, with explicit `clear` methods where applicable.
- **Extensibility**: Implementations use integers for simplicity but can be extended to generic types.
- **Subfolder Documentation**: Each implementation folder contains a `README.md` with specific details, example usage, and output.

---

## 📜 License

This project is licensed under the terms specified in the [LICENSE](./LICENSE) file.

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

## 🚀 Happy Learning!

**This repository is a resource for students, educators, and developers to explore and master data structures. Contributions are welcome feel free to fork, submit pull requests, or open issues!**

---

## **IF THERE IS ANY ISSUE OR BUG PLEASE GIVE PULL REQUEST THE PROJECT MAY HAVE MISSING FILE AS IT IS UNDER CONSTRACTION AND IT WILL BE THERE ADVANCED DATA STRUCTURES WILL BE UPLOADED LIKE AVL TREES, GRAPHS, ETC...**
