# 📦 Integer Circular Queue in Java

This project implements a **circular queue** data structure using a fixed-size integer array in Java. It supports core queue operations as well as advanced utilities like sorting, reversing, duplicate removal, and more, leveraging the circular nature of the queue for efficient space usage.

---

## 📂 Project Structure

- `CircularQueue`: Main class implementing all queue operations.
- `Main`: Example usage and testing.

---

## ✅ Features

### 🧱 Queue Basics
- `enqueue(int data)` -Add an element to the rear of the queue.
- `dequeue()`- Remove and return the front element.
- `clear()`- Remove all elements from the queue.
- `isEmpty()`- Check if the queue is empty.
- `isFull()`- Check if the queue is full.
  
## 🚀 Example Usage

```java
CircularQueue queue = new CircularQueue(5);

queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);
queue.enqueue(40);

System.out.println(queue.dequeue());  // Output: 10
System.out.println(queue.getFront()); // Output: 20
System.out.println("Is queue empty? " + queue.isEmpty());  // Output: false
queue.clear();
System.out.println("Is queue full? " + queue.isFull());  // Output: false
``` 
---

### 🔍 Search
- `getFront()`- Return the front element without removing it.
- `getRear()`- Return the rear element without removing it.
- `getMiddle()`- Return the middle element.
- `getElement(int index)`- Return the element at a specific logical index.
- `getIndex(int data)`- Return the logical index of a given value.
- `isFound(int data)`- Check if a value exists in the queue.

## 🚀 Example Usage

```java
System.out.println("Front element: " + queue.getFront());             // Output: 10
System.out.println("Rear element: " + queue.getRear());              // Output: 40
System.out.println("Middle element: " + queue.getMiddle());         // Output: 30
System.out.println("Element at index 2: " + queue.getElement(2));  // Output: 30
System.out.println("Index of 20: " + queue.getIndex(20));         // Output: 1
System.out.println("Is 30 found? " + queue.isFound(30));         // Output: true
```  
---

### 📊 Statistics
- `getSize()`- Return the current number of elements.
- `sum()`- Return the sum of all elements.
- `average()`- Return the average value of elements.
- `repeated(int data)`- Return the number of occurrences of a value.
- `max()`- Return the maximum value.
- `min()`- Return the minimum value.

## 🚀 Example Usage

```java
System.out.println("Size: " + queue.getSize());              // Output: 4
System.out.println("Sum: " + queue.sum());                  // Output: 100
System.out.println("Average: " + queue.average());         // Output: 25.0
System.out.println("Repeated 20: " + queue.repeated(20)); // Output: 1
System.out.println("Max: " + queue.max());               // Output: 40
System.out.println("Min: " + queue.min());              // Output: 10
```  
---

### 🧹 Utilities
- `printQueue()`- Print all elements in logical order.
- `removeDuplicates()`- Remove duplicate values (sorts the queue).
- `reverse()`- Reverse the queue in-place.
- `sort()`- Sort the queue in ascending order.
- `randomize()`- Randomize the queue elements.
- `swapData(int data1, int data2)`- Swap two values in the queue (if both exist).
- `swapindex(int index1, int index2)`- Swap elements at two logical indices.
  
## 🚀 Example Usage

```java
queue.enqueue(10);  // Queue: 10 20 30 40 10
queue.removeDuplicates();
queue.printQueue();  // Output: Queue: 10 20 30 40

queue.reverse();
queue.printQueue();  // Output: Queue: 40 30 20 10

queue.randomize();
queue.printQueue();  // Output: Queue: (random permutation, e.g., 20 10 40 30)

queue.sort();
queue.printQueue();  // Output: Queue: 10 20 30 40

queue.swapData(10, 30);
queue.printQueue();  // Output: Queue: 30 20 10 40

queue.swapindex(0, 2);
queue.printQueue();  // Output: Queue: 10 20 30 40
```  
---
## 🧱 Algorithm Steps

1. Create a fixed-size array to hold elements.
2. Track front and rear indices for circular behavior.
3. Implement core operations (enqueue, dequeue) using modulo arithmetic for wrap-around.
4. Handle edge cases (e.g., empty queue, full queue).
5. Add utility methods (sort, reverse, removeDuplicates) with circular indexing.
   
---

## 📂 Requirements

- Java 8 or higher
- Basic understanding of arrays and queue logic

---

## 🧾 Notes

- This Queue uses fixed size arrays.
- It is limited to `INTEGER` values only (not generic).
- For simplicity, all operations are iterative (not recursive).
- Useful for educational purposes and basic queue applications.

---

## 📬 Contact

For feedback or contributions:

- GitHub: [abdelhalimYasser](https://github.com/abdelhalimYasser)
- LinkedIn: [abdelhalimyasser](https://www.linkedin.com/in/abdelhalimyasser)


---

# Happy Coding! 🚀
