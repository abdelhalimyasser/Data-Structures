# 📦 Linked Stack

This project provides implementations of a **Linked Stack**, a dynamic data structure that follows the **Last-In-First-Out (LIFO)** principle, using a singly linked list. The stack is implemented in both **C** and **Java**, with operations performed at the top (head) for efficiency. The implementations are iterative, supporting key operations like push, pop, peek, size, isEmpty, isFull, print, and memory management (freeing in C, clearing in Java). This project is designed for educational purposes, demonstrating efficient stack operations in both languages.

This project is part of a larger **"Data Structures"** repository that includes other data structures like Linked List, Queue, etc.

---

## 🚀 Implementations

- **[Linked Stack in C](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Stack/Linked%20Stack/Implementation%20in%20C)**: Uses iterative methods with pointers for all operations.
- **[Linked Stack in Java](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Stack/Linked%20Stack/Implementation%20in%20Java)**: Uses iterative methods with object references for all operations.

---

## 🌐 Try it Online

You can try the **interactive Stack visualization** here:  
👉 **[Stack Live Demo](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Stack%20Visualizer.html)**

👉 **[Linked List Live Demo](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Linked%20List%20Visualizer.html)**

---

## 📌 About Linked Stack

A **Linked Stack** is a stack data structure implemented using a singly linked list, where elements are added and removed from the top. This allows for dynamic sizing without the need for a fixed array, making it efficient for scenarios with unknown or varying stack sizes. Linked stacks are commonly used in applications like function call stacks, expression evaluation, and backtracking algorithms.

### Main Operations:
- `push(element)` → Adds an element to the top of the stack.
- `pop()` → Removes and returns the top element from the stack.
- `peek()` → Returns the top element without removing it.
- `size()` → Returns the current number of elements in the stack.
- `isEmpty()` → Checks if the stack is empty.
- `isFull()` → Checks if the stack is full (based on memory availability).
- `print()` → Prints the stack elements with indices.
- `freeLinkedStack()` (C) / `clear()` (Java) → Frees or clears all nodes to manage memory.

💡 *The implementations handle integer values for simplicity. Duplicates are allowed. For additional functions (e.g., reverse stack, duplicate check), see the [Linked List](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Linked%20List/Linked%20List/Implementation%20of%20Linked%20List%20in%20C) or [Stack](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Stack/Implementation%20of%20Stack%20in%20C) implementations.*

---

## 📂 Project Structure

```
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
```

### Implementation in C:
- `LinkedStack.c`: Contains the Linked Stack operations (`createNode`, `push`, `pop`, `peek`, `size`, `print`, `isEmpty`, `isFull`, `freeLinkedStack`).
- `LinkedStack.h`: Contains the header file with structure definitions and function prototypes.
- `main.c`: Test program demonstrating the Linked Stack operations.
- `README.md`: Overview of the C implementation.

### Implementation in Java:
- `LinkedStack.java`: Contains the Linked Stack class with operations (`push`, `pop`, `peek`, `size`, `print`, `isEmpty`, `isFull`, `clear`).
- `Node.java`: Contains the Node class with structure definitions.
- `Main.java`: Test program demonstrating the Linked Stack operations.
- `README.md`: Overview of the Java implementation.

---

## 🧱 Example Usage

#### 🔁 Operations Output

```
Stack after pushes: 
[0] -> 4
[1] -> 3
[2] -> 2
[3] -> 1

Top element: 4
Popped element: 4

Stack after pop: 
[0] -> 3
[1] -> 2
[2] -> 1

Current size: 3
Is stack empty: No
Is stack full: No

After Free/Clear:
Current size: 0
Is stack empty: Yes
```
---

## 🛠️ Setup Instructions

### Run the C Implementation

#### Clone the Repository
```bash
git clone https://github.com/abdelhalimyasser/data-structures.git
cd Stack/Linked Stack/Implementation in C
```

#### Compile and Run
```bash
gcc main.c LinkedStack.c -o main
./main
```

**Note**: Ensure `LinkedStack.h` is included in `main.c` and `LinkedStack.c`.

---

### Run the Java Implementation

#### Clone the Repository
```bash
git clone https://github.com/abdelhalimyasser/data-structures.git
cd Stack/Linked Stack/Implementation in Java
```

#### Compile and Run
```bash
javac *.java
java Main
```

**Note**: Ensure all classes (`LinkedStack.java`, `Node.java`, `Main.java`) are compiled together.


---

## 🧾 Notes

- The implementations use `integers` for simplicity (not generic).
- Both C and Java implementations are iterative, with O(1) time and space complexity for `push`, `pop`, `peek`, `size`, `isEmpty`, and `isFull`.
- The C `pop` function handles underflow by returning -1 and printing a message, while Java throws an `IllegalStateException`.
- Memory management:
  - C: Uses `freeLinkedStack` to prevent memory leaks.
  - Java: Uses `clear` with Java’s garbage collector to manage memory.
- The `print` function provides an indexed representation for debugging.
- The `isFull` function checks for memory exhaustion (C: failed `malloc`; Java: `OutOfMemoryError`).
- Part of a larger Data Structures repository with implementations of Linked List, Queue, and more.


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
