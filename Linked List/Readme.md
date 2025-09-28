# 🚂 Linked List

## 📌 About Linked List

A **Linked List** is a linear data structure where elements are stored in nodes, each containing data and a reference (or link) to the next node (or previous node in the case of a doubly linked list). Unlike arrays, linked lists allow for dynamic memory allocation and efficient insertions/deletions. This folder contains various linked list-based data structures, including **Singly Linked List**, **Doubly Linked List**, **Linked Queue**, and **Linked Stack**, each following their respective principles (e.g., FIFO for queues, LIFO for stacks).

**Main Operations (Common Across Implementations):**
- `insert/add/enqueue/push` → Add an element to the list (position varies by structure).
- `delete/remove/dequeue/pop` → Remove an element from the list (position varies by structure).
- `peek` → View the head/top/front element without removing it (for queue/stack).
- `isEmpty` → Check if the list is empty.
- `print` → Display the list elements.

💡 *Each implementation folder contains common functions and some unique ones, but the core logic of linked list operations is consistent. The implementations are designed for educational purposes.*

---

## 🚀 Implementations

- **[Doubly Linked List](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Linked%20List/Doubly%20Linked%20List)**: A linked list where each node has links to both the next and previous nodes, allowing bidirectional traversal.
- **[Linked List](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Linked%20List/Linked%20List)**: A singly linked list where each node links to the next, optimized for sequential access.
- **[Linked Queue](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Linked%20List/Linked%20Queue)**: A queue implemented using a singly linked list, following the FIFO principle.
- **[Linked Stack](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Linked%20List/Linked%20Stack)**: A stack implemented using a singly linked list, following the LIFO principle.

---

## 🌐 Try it Online

You can try the **interactive linked list visualizations** here:  
👉 **[Linked List Live Demo](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Linked%20List%20Visualizer.html)**  
👉 **[Queue Live Demo](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Queue%20Visualizer.html)**  
👉 **[Stack Live Demo](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Stack%20Visualizer.html)**

---

## 📂 Project Structure

```
├── Linked List
    ├── Doubly Linked List
    │   ├── Implementation in C
    │   │   ├── DoublyLinkedList.c
    │   │   ├── DoublyLinkedList.h
    │   │   ├── main.c
    │   │   └── README.md
    │   ├── Implementation in Java
    │   │   ├── DoublyLinkedList.java
    │   │   ├── Node.java
    │   │   ├── Main.java
    │   │   └── README.md
    ├── Linked List
    │   ├── Implementation in C
    │   │   ├── LinkedList.c
    │   │   ├── LinkedList.h
    │   │   ├── main.c
    │   │   └── README.md
    │   ├── Implementation in Java
    │   │   ├── LinkedList.java
    │   │   ├── Node.java
    │   │   ├── Main.java
    │   │   └── README.md
    ├── Linked Queue
    │   ├── Implementation in C
    │   │   ├── LinkedQueue.c
    │   │   ├── LinkedQueue.h
    │   │   ├── main.c
    │   │   └── README.md
    │   ├── Implementation in Java
    │   │   ├── LinkedQueue.java
    │   │   ├── Node.java
    │   │   ├── Main.java
    │   │   └── README.md
    ├── Linked Stack
    │   ├── Implementation in C
    │   │   ├── LinkedStack.c
    │   │   ├── LinkedStack.h
    │   │   ├── main.c
    │   │   └── README.md
    │   ├── Implementation in Java
    │   │   ├── LinkedStack.java
    │   │   ├── Node.java
    │   │   ├── Main.java
    │   │   └── README.md
    └── README.md
```

---

💡 *This project is made for learning purposes and to demonstrate linked list operations visually.*
