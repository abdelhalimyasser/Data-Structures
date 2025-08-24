# 📦 Integer Queue in C

This project implements a **simple queue** data structure using a fixed-size integer array in C. It supports basic queue operations like `enqueue`, `dequeue`, and `peek`, designed for straightforward first-in, first-out (FIFO) functionality.

---

## 📂 Project Structure

- `Queue.h`: Header file declaring queue operations.
- `Queue.c`: Implementation of queue operations.
- `main.c`: Example usage and testing (see below).

---

## ✅ Features

### 🧱 Queue Basics
- `createQueue(Queue* queue)`: Initialize an empty queue.
- `enqueue(int data, Queue* queue)`: Add an element to the rear of the queue.
- `dequeue(Queue* queue)`: Remove and return the front element (returns `-1` if empty; check `isEmpty` first).
- `clear(Queue* queue)`: Remove all elements from the queue.
- `peek(Queue* queue)`: Return the front element without removing it (returns `-1` if empty; check `isEmpty` first).
- `isEmpty(Queue* queue)`: Check if the queue is empty.
- `isFull(Queue* queue)`: Check if the queue is full.
- `printQueue(Queue* queue)`: Print all elements in order (front to rear).

## 🚀 Example Usage

### 🧱 Basic Operations
```c
#include <stdio.h>
#include "Queue.h"

int main() {
    Queue queue;
    createQueue(&queue);

    enqueue(10, &queue);
    enqueue(20, &queue);
    enqueue(30, &queue);
    enqueue(40, &queue);

    printQueue(&queue);                                     // Output: Queue elements: 10 20 30 40
    printf("%d\n", dequeue(&queue));                       // Output: 10
    printf("%d\n", peek(&queue));                         // Output: 20
    printf("Is queue empty? %d\n", isEmpty(&queue));     // Output: 0 (false)
    clear(&queue);                                    
    printf("Is queue full? %d\n", isFull(&queue));     // Output: 0 (false)
    printQueue(&queue);                               // Output: Queue is empty

    return 0;
}
```
---

## 🧱 Algorithm Steps

1. Define a `Queue` struct with a fixed-size array, `front`, `rear`, `size`, and `capacity`.
2. Track front, rear, and size for queue operations.
3. Implement enqueue by adding elements at rear.
4. Implement dequeue by removing elements from front.
5. Handle edge cases (e.g., empty queue, full queue).
6. Provide a printQueue method for debugging.

---

## 📂 Requirements

- C compiler (e.g., GCC)
- Standard C libraries (stdio.h, stdbool.h)
- Basic understanding of arrays, pointers, and queue logic

---

## 🧾 Notes

- The queue has a fixed capacity of 100 elements, defined by `MAX_SIZE` in `Queue.c`. For dynamic sizing, consider a custom implementation.
- This queue uses a fixed-size array and is not circular, so space is not reused after dequeuing.
- It is limited to INTEGER values only (not generic).
- All operations are iterative for simplicity and performance.
- Useful for educational purposes and basic queue applications.
- For more functions and methods you can checkout the other implementations [Circular Queue](https://github.com/abdelhalimYasser/Queue/tree/8e42d94f9d38fe8ad611c5a911b5ebe333d3a8fd/Circular%20Queue/Implementation%20in%20C) or [Double Ended Queue(Deque)](https://github.com/abdelhalimYasser/Queue/tree/312eedffde383a642eebb5749152fe9a45e47782/Double%20Ended%20Queue(Deque))
  
---

## 📬 Contact

For feedback or contributions:

- GitHub: [abdelhalimYasser](https://github.com/abdelhalimYasser)
- LinkedIn: [abdelhalimyasser](https://www.linkedin.com/in/abdelhalimyasser)

---

# Happy Coding! 🚀




