# 📦 Linked Queue

This project provides implementations of a **Linked Queue**, a dynamic data structure that follows the **First-In-First-Out (FIFO)** principle, using a singly linked list. The queue is implemented in both **C** and **Java**, with enqueue operations at the rear (tail) and dequeue at the front (head) for efficiency. The implementations are iterative, supporting key operations like enqueue, dequeue, peek, size, isEmpty, isFull, print, and memory management (freeing in C, clearing in Java). This project is designed for educational purposes, demonstrating efficient queue operations in both languages.

This project is part of a larger **"Data Structures"** repository that includes other data structures like Linked List, Stack, etc.

---

## 🚀 Implementations

- **[Linked Queue in C](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Queue/Linked%20Queue/Implementation%20in%20C)**: Uses iterative methods with pointers for all operations.
- **[Linked Queue in Java](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Queue/Linked%20Queue/Implementation%20in%20Java)**: Uses iterative methods with object references for all operations.

---

## 🌐 Try it Online

You can try the **interactive Queue visualization** here:  
👉 **[Queue Live Demo](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Queue%20Visualizer.html)**

👉 **[Linked List Live Demo](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Linked%20List%20Visualizer.html)**

---

## 📌 About Linked Queue

A **Linked Queue** is a queue data structure implemented using a singly linked list, where elements are added to the rear and removed from the front. This allows for dynamic sizing without the need for a fixed array, making it efficient for scenarios with unknown or varying queue sizes. Linked queues are commonly used in applications like task scheduling, breadth-first search, and buffering in computer systems.

### Main Operations:
- `enqueue(element)` → Adds an element to the rear of the queue.
- `dequeue()` → Removes and returns the front element from the queue.
- `peek()` → Returns the front element without removing it.
- `size()` → Returns the current number of elements in the queue.
- `isEmpty()` → Checks if the queue is empty.
- `isFull()` → Checks if the queue is full (based on memory availability).
- `print()` → Prints the queue elements with indices.
- `freeLinkedQueue()` (C) / `clear()` (Java) → Frees or clears all nodes to manage memory.

💡 *The implementations handle integer values for simplicity. Duplicates are allowed. For additional functions (e.g., reverse queue, duplicate check), see the [Linked List](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Linked%20List/Linked%20List/Implementation%20of%20Linked%20List%20in%20C) or [Queue](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Queue/Implementation%20of%20Queue%20in%20C) implementations.*

---

## 📂 Project Structure
```
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
└── Readme.md
```


### Implementation in C:
- `LinkedQueue.c`: Contains the Linked Queue operations (`createNode`, `enqueue`, `dequeue`, `peek`, `size`, `print`, `isEmpty`, `isFull`, `freeLinkedQueue`).
- `LinkedQueue.h`: Contains the header file with structure definitions and function prototypes.
- `main.c`: Test program demonstrating the Linked Queue operations.
- `README.md`: Overview of the C implementation.

### Implementation in Java:
- `LinkedQueue.java`: Contains the Linked Queue class with operations (`enqueue`, `dequeue`, `peek`, `size`, `print`, `isEmpty`, `isFull`, `clear`).
- `Node.java`: Contains the Node class with structure definitions.
- `Main.java`: Test program demonstrating the Linked Queue operations.
- `README.md`: Overview of the Java implementation.

---

## 🧱 Example Usage

### 🔁 Operations Output
```
Queue after enqueues:
[0] -> 1
[1] -> 2
[2] -> 3
[3] -> 4
Front element: 1
Dequeued element: 1
Queue after dequeue:
[0] -> 2
[1] -> 3
[2] -> 4
Current size: 3
Is queue empty: No
Is queue full: No
After Free/Clear:
Current size: 0
Is queue empty: Yes
```
---

# 🛠️ Setup Instructions

## Run the C Implementation

### Clone the Repository
```bash
git clone https://github.com/abdelhalimyasser/data-structures.git
cd Linked list/Linked Queue/Implementation in C
```
### Compile and Run
```bash
gcc main.c LinkedQueue.c -o main
./main
```
*Note: Ensure LinkedQueue.h is included in main.c and LinkedQueue.c.*

---
## Run the Java Implementation
### Clone the Repository
```bash
git clone https://github.com/abdelhalimyasser/data-structures.git
cd Linked List/Linked Queue/Implementation in Java
```
### Compile and Run
```bash
javac *.java
java Main
```
*Note: Ensure all classes (LinkedQueue.java, Node.java, Main.java) are compiled together.*

---

# 🧾 Notes

- The implementations use `integers` for simplicity (not generic).
- Both `C` and `Java` implementations are `iterative`, with `O(1)` time and space complexity for `enqueue`, `dequeue`, `peek`, `size`, `isEmpty`, and `isFull`.
- The C dequeue function handles underflow by returning `-1` and `printing a message`.
- Memory management:

    - `C`: Uses `freeLinkedQueue` to prevent memory leaks.
    - `Java`: Uses `clear` with Java’s garbage collector to manage memory.


- The `print` function provides an indexed representation for debugging.
- Part of a larger Data Structures repository with implementations of `Linked List`, `Stack`, and `more.`

---

# 📬 Contact with me

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
