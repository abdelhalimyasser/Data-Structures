# 📦 Queue

---

## 🚀 Implementations

- **[Queue in C](https://github.com/abdelhalimYasser/Queue/tree/b70946291db3ea963ff7962d8437a370a122b50f/Queue/Implementation%20in%20C)**
- **[Queue in Java](https://github.com/abdelhalimYasser/Queue/tree/b70946291db3ea963ff7962d8437a370a122b50f/Queue/Implementation%20in%20Java)**

---

## 🌐 Try it Online

You can try the **interactive queue visualization** here:  
👉 **[Live Demo](https://abdelhalimYasser.github.io/Queue/)**

---

## 📌 About Queue

A **Queue** is a linear data structure that follows the **FIFO** (First In, First Out) principle.  
The first element inserted is the first one to be removed.

**Main Operations:**
- `enqueue()` → Add an element to the rear of the queue
- `dequeue()` → Remove the element from the front of the queue
- `peek()` → View the front element without removing it
- `isEmpty()` → Check if the queue is empty
- `isFull()` → Check if the queue is full

💡 *Each implementation folder contains common functions and may include additional utilities, but the core FIFO logic is the same.*

---

## 📂 Project Structure
```
Queue
    ├── Implementation in C
        ├── Queue.c
        ├── Queue.h
        ├── Readme.md
        └── main.c
    ├── Implementation in Java
        ├── Main.java
        ├── Queue.java
        └── Readme.md
    └── Readme.md
```
---

## 📈 Performance

| Operation        | C Time Complexity | Java Time Complexity |
|------------------|-------------------|----------------------|
| `createQueue`    | O(1)             | O(1)                |
| `isFull`         | O(1)             | O(1)                |
| `isEmpty`        | O(1)             | O(1)                |
| `enqueue`        | O(1)             | O(1)                |
| `dequeue`        | O(1)             | O(1)                |
| `clear`          | O(1)             | O(1)                |
| `peek`           | O(1)             | O(1)                |
| `printQueue`     | O(n)             | O(n)                |

**Space Complexity**: O(1) for all operations (excluding the queue array, which is O(CAPACITY) in C and O(capacity) in Java).

---

💡 *This project is made for learning purposes and to demonstrate stack operations visually.*

