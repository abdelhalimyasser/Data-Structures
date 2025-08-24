# 📦 Integer Queue in Java

This project implements a **simple queue** data structure using a fixed-size integer array in Java. It supports basic queue operations like enqueue, dequeue, and peek, designed for straightforward first-in, first-out (FIFO) functionality.

---

## 📂 Project Structure

- `Queue`: Main class implementing all queue operations.
- `Main`: Example usage and testing (see below).

---

## ✅ Features

### 🧱 Queue Basics
- `enqueue(int data)`- Add an element to the rear of the queue.
- `dequeue()`- Remove and return the front element.
- `clear()` - Clear the Queue and Delete all the elements.
- `peek()`- Return the front element without removing it.
- `isEmpty()`- Check if the queue is empty.
- `isFull()`- Check if the queue is full.
- `printQueue()`- Print all elements in order (front to rear).

## 🚀 Example Usage

### 🧱 Basic Operations
```java
Queue queue = new Queue(5);

queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);
queue.enqueue(40);

queue.printQueue();  // Output: Queue elements: 10 20 30 40
System.out.println(queue.dequeue());  // Output: 10
System.out.println(queue.peek());     // Output: 20
System.out.println("Is queue empty? " + queue.isEmpty());  // Output: false
queue.clear();
System.out.println("Is queue full? " + queue.isFull());    // Output: false
```
---

## 🧱 Algorithm Steps

1. Create a fixed-size array to hold elements.
2. Track front, rear, and size for queue operations.
3. Implement enqueue by adding elements at rear.
4. Implement dequeue by removing elements from front.
5. Handle edge cases (e.g., empty queue, full queue).
6. Provide a printQueue method for debugging.

---

## 📂 Requirements

- Java 8 or higher
- Basic understanding of arrays and queue logic

---

## 🧾 Notes

- This queue uses a fixed-size array and is not circular, so space is not reused after dequeuing.
- It is limited to INTEGER values only (not generic).
- All operations are iterative for simplicity and performance.
- Useful for educational purposes and basic queue applications.
- For more functions and methods you can checkout the other implementations [Circular Queue](https://github.com/abdelhalimYasser/Queue/tree/8e42d94f9d38fe8ad611c5a911b5ebe333d3a8fd/Circular%20Queue/Implementation%20in%20Java) or [Double Ended Queue(Deque)](https://github.com/abdelhalimYasser/Queue/tree/8e42d94f9d38fe8ad611c5a911b5ebe333d3a8fd/Double%20Ended%20Queue(Deque)/Implementation%20in%20Java)
  
---

## 📬 Contact

For feedback or contributions:

- GitHub: [abdelhalimYasser](https://github.com/abdelhalimYasser)
- LinkedIn: [abdelhalimyasser](https://www.linkedin.com/in/abdelhalimyasser)

---

# Happy Coding! 🚀
