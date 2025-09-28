# 🌟 Linked Queue (C Implementation)

This project provides a C implementation of a Linked Queue, a dynamic data structure that follows the First-In-First-Out (FIFO) principle, implemented using a singly linked list. Each node in the list represents an element in the queue, with enqueue operations at the rear (tail) and dequeue at the front (head) for efficiency. The implementation is iterative, supporting key operations like enqueue, dequeue, peek, print, isEmpty, isFull, and freeing the queue to manage memory. The project is designed for educational purposes, demonstrating efficient queue operations in C.

This project is part of a larger "Data Structures" repository that includes other data structures like Linked List, Stack, etc.

---

## 📌 About Linked Queue

A Linked Queue is a queue data structure implemented using a linked list, where elements are added to the rear and removed from the front. This allows for dynamic sizing without the need for a fixed array, making it efficient for scenarios with unknown or varying queue sizes. Linked queues are commonly used in applications like task scheduling, breadth-first search, and buffering in computer systems.

### Main Operations:
- `createNode(data)` → Creates a new node with the given data.
- `createQueue()` → Creates an empty queue.
- `enqueue(queue, size, element)` → Adds an element to the rear of the queue.
- `dequeue(queue, size)` → Removes and returns the front element from the queue.
- `peek(queue)` → Returns the front element without removing it.
- `print(queue)` → Prints the queue elements with indices.
- `isEmpty(queue)` → Checks if the queue is empty.
- `isFull(queue)` → Checks if the queue is full (based on memory availability).
- `freeLinkedQueue(queue, size)` → Frees all nodes in the queue to prevent memory leaks.

💡 *This implementation handles integer values for simplicity. Duplicates are allowed. If you want more functions (e.g., reverse queue, duplicate check), you can go to the [Linked List](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Linked%20List/Linked%20List/Implementation%20of%20Linked%20List%20in%20C) or [Queue](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Queue/Implementation%20of%20Queue%20in%20C) implementations.*

---

## 📂 Project Structure
```
├── Implementation in C
│   ├── linked_queue.c
│   ├── linked_queue.h
|   ├── main.c
│   └── README.md
```
---

### Implementation in C:
- `linked_queue.c`: Contains the Linked Queue implementation with operations (`enqueue`, `dequeue`, `peek`, `print`, `isEmpty`, `isFull`, `freeLinkedQueue`).
- `linked_queue.h`: Contains the structure definitions (`Node`, `Queue`) and function prototypes.
- `README.md`: This file, providing an overview of the Linked Queue project in C.

---

## 🧱 Example Usage

### 🌲 Sample Queue

The implementation is tested with the following Linked Queue:

```c
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "linked_queue.h"

int main() {
    Queue* queue = createQueue();
    int size = 0;

    // Enqueuing elements
    enqueue(&queue, &size, 1);
    enqueue(&queue, &size, 2);
    enqueue(&queue, &size, 3);
    enqueue(&queue, &size, 4);

    printf("Queue after enqueues:\n");
    print(queue);

    printf("\nFront element: %d\n", peek(queue));

    // Dequeuing one element
    printf("Dequeued element: %d\n", dequeue(&queue, &size));

    printf("\nQueue after dequeue:\n");
    print(queue);

    // Checking current size
    printf("\nCurrent size: %d\n", size);

    // Checking if queue is empty
    printf("Is queue empty: %s\n", isEmpty(queue) ? "Yes" : "No");

    // Checking if queue is full
    printf("Is queue full: %s\n", isFull(queue) ? "Yes" : "No");

    freeLinkedQueue(&queue, &size);
    printf("\nAfter Clear:\n");
    
    // Checking current size
    printf("\nCurrent size: %d\n", size);
    
    // Checking if queue is empty
    printf("Is queue empty: %s\n", isEmpty(queue) ? "Yes" : "No");

    return 0;
}
```
## 🔁 Operations Output

```c
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
Is queue full: Yes

After Clear:
Current size: 0
Is queue empty: Yes
```
---
# 🛠️ Setup Instructions
## Run the C Implementation
### Clone the Repository
```bash
git clone https://github.com/abdelhalimyasser/data-structures.git
cd Linked List/Linked Queue
```
### Compile and Run the Implementation
```bash
cd Implementation in C
gcc main.c -o main
./main
```

*Note: Ensure linked_queue.c and linked_queue.h are in the same directory. The main.c file contains the test program.*

---
# 🧾 Notes

- The implementation uses `integers` for simplicity (not generic).
- The `iterative implementation` uses `pointers` and `loops`, with `O(1)` time and space complexity for `enqueue`, `dequeue`, `peek`, `isEmpty`, and `isFull`.
- The `dequeue` function handles underflow by returning `-1` and `printing a message`.
- The `freeLinkedQueue` function ensures proper `memory deallocation` to prevent leaks.
- The `print` function provides an indexed representation for debugging.
- Part of a larger Data Structures repository with implementations of `Linked List`, `Trees`, and `etc.`
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
