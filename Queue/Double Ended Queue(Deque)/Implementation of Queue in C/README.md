# 📦 Integer Deque in C

This project implements a **double-ended queue (Deque)** data structure in C using a fixed-size circular array with a capacity of 10 elements. A deque supports insertion and deletion at both the front and rear, offering versatile functionality for first-in, first-out (FIFO) or last-in, first-out (LIFO) operations.

---

## 📂 Project Structure

- `Deque.c`: Implementation of deque operations and a `main` function for testing.

---

## ✅ Features

### 🧱 Deque Basics
- `createDeque(Deque* deque)`: Initialize an empty deque.
- `insertFront(Deque* deque, int data)`: Add an element to the front.
- `insertRear(Deque* deque, int data)`: Add an element to the rear.
- `deleteFront(Deque* deque)`: Remove and return the front element (returns `-1` if empty).
- `deleteRear(Deque* deque)`: Remove and return the rear element (returns `-1` if empty).
- `clear(Deque* deque)`: Remove all elements.
## 🚀 Example Usage

```c
insertRear(&deque, 10);
insertRear(&deque, 20);
insertFront(&deque, 30);
insertFront(&deque, 40);

printf("%d\n", deleteFront(&deque));        // Output: 40
printf("%d\n", getRear(&deque));           // Output: 20

clear(&deque);
```
---

### 🔍 Search Operations
- `getFront(Deque* deque)`: Return the front element (returns `-1` if empty).
- `getRear(Deque* deque)`: Return the rear element (returns `-1` if empty).
- `getMiddle(Deque* deque)`: Return the middle element (returns `-1` if empty).
- `isFound(Deque* deque, int data)`: Check if an element exists.
- `getIndex(Deque* deque, int element)`: Return the logical index of an element (returns `-1` if not found).
- `getElement(Deque* deque, int index)`: Return the element at a logical index (returns `-1` if invalid).
- `isEmpty(Deque* deque)`: Check if the deque is empty.
- `isFull(Deque* deque)`: Check if the deque is full.
## 🚀 Example Usage

```c
printf("Front: %d\n", getFront(&deque));     // Output: 10
printf("Rear: %d\n", getRear(&deque));       // Output: 10
printf("Middle: %d\n", getMiddle(&deque));   // Output: 20
printf("Is 20 found? %d\n", isFound(&deque, 20));  // Output: 1
printf("Is 50 found? %d\n", isFound(&deque, 50));  // Output: 0
printf("Index of 20: %d\n", getIndex(&deque, 20)); // Output: 1
printf("Element at index 1: %d\n", getElement(&deque, 1)); // Output: 20
printf("Element at invalid index: %d\n", getElement(&deque, 5)); // Output: -999
printf("Is empty? %d\n", isEmpty(&deque));  // Output: 0
printf("Is full? %d\n", isFull(&deque));    // Output: 0
```
---

### 📊 Statistics
- `getSize(Deque* deque)`: Return the number of elements.
- `sum(Deque* deque)`: Return the sum of elements (returns `-1` if empty).
- `average(Deque* deque)`: Return the average of elements (returns `-1` if empty).
- `repeated(Deque* deque, int data)`: Count occurrences of an element (returns `0` if empty).
- `max(Deque* deque)`: Return the maximum element (returns `-1` if empty).
- `min(Deque* deque)`: Return the minimum element (returns `-1` if empty).
## 🚀 Example Usage

```c
printf("Size: %d\n", getSize(&deque));  // Output: 2
printf("Sum: %d\n", sum(&deque));             // Output: 40
printf("Average: %.2f\n", average(&deque));   // Output: 13.33
printf("Repeated 10: %d\n", repeated(&deque, 10)); // Output: 2
printf("Max: %d\n", max(&deque));             // Output: 20
printf("Min: %d\n", min(&deque));             // Output: 10
```
---

### 🧹 Utilities
- `printDeque(Deque* deque)`: Print all elements in order (front to rear).
- `sort(Deque* deque)`: Sort elements in ascending order.
- `removeDuplicates(Deque* deque)`: Remove duplicate elements.
- `reverse(Deque* deque)`: Reverse the order of elements.
- `randomize(Deque* deque)`: Randomly shuffle elements.
- `swapData(Deque* deque, int data1, int data2)`: Swap the first occurrences of two elements.
- `swapIndex(Deque* deque, int index1, int index2)`: Swap elements at two logical indices.
## 🚀 Example Usage

```c
printf("After removing duplicates:\n");
removeDuplicates(&deque);
printDeque(&deque);  // Output: Deque elements: 10 20

printf("After reversing:\n");
reverse(&deque);
printDeque(&deque);  // Output: Deque elements: 20 10

printf("After randomize:\n");
randomize(&deque);
printDeque(&deque);  // Output: Random order (e.g., 20 10 or 10 20)

printf("After sorting:\n");	
sort(&deque);
printDeque(&deque);  // Output: Deque elements: 10 20

printf("Swap data 10 and 20\n"); // Expected: 1
swapData(&deque, 10, 20);
printDeque(&deque);  // Output: Deque elements: 20 10

swapIndex(&deque, 0, 1);
printf("Swap indices 0 and 1\n"); // Expected: 1
printDeque(&deque);  // Output: Deque elements: 10 20
```
---

### 🧪 Extra Operations
- `equals(Deque* deque1, Deque* deque2)`: Check if two deques have identical elements in the same order.
- `concat(Deque* deque1, Deque* deque2)`: Append `deque2`’s elements to `deque1` (modifies `deque1`).
## 🚀 Example Usage

```c
Deque deque2;
createDeque(&deque2);
insertRear(&deque2, 10);
insertRear(&deque2, 20);
printf("Are deques equal? %d\n", equals(&deque, &deque2)); // Output: 1

Deque deque3;
createDeque(&deque3);
insertRear(&deque3, 30);
printf("Are deques equal? %d\n", equals(&deque, &deque3)); // Output: 0

printf("Concatenate deque3 to deque:\n");
printf("Concat success: %d\n", concat(&deque, &deque3)); // Output: 1
printDeque(&deque);  // Expected: Deque elements: 10 20 30 
```
---

## 🧱 Algorithm Steps

1. Define a Deque struct with a fixed-size array `CAPACITY = 10`, `front`, `rear`, and `size`.
2. Use a `circular array` to efficiently manage `insertions` and `deletions` at both ends.
3. Track `front` and `rear` indices using modulo arithmetic `% CAPACITY` for circular behavior.
4. Implement insertion (`insertFront`, `insertRear`) by updating indices and checking for overflow.
5. Implement deletion (`deleteFront`, `deleteRear`) by updating indices and checking for underflow.
6. Provide utility functions (`sort`, `reverse`, etc.) for additional operations.
7. Handle edge cases: `empty deque`, `full deque`, `invalid indices`, and `concatenation overflow`.
8. Use `printf for error messages` or return `-1` or `-999` or `false` for invalid operations.

---

## 📂 Requirements

- C compiler (e.g., GCC)
- Standard C libraries (`stdio.h`, `stdlib.h`, `stdbool.h`, `time.h`)
- Basic understanding of `arrays`, `pointers`, and `deque logic`

---

## 🧾 Notes

- The deque has a fixed capacity of `10` elements, defined by `CAPACITY` in `Deque.h`.
- Uses a circular array to reuse space efficiently after deletions.
- Limited to integer values only `(not generic)`.
- All operations are iterative for simplicity and performance.
- Avoids dynamic memory allocation (malloc, free) to keep the implementation straightforward.
- Error handling uses printf for messages (e.g., `overflow`, `underflow`, `invalid indices`) and returns `-1` or `-999` or `false`.
- The `randomize function` uses `srand(time(NULL))` in main for varied shuffling.
- Useful for educational purposes and applications requiring flexible queue operations.

---

## 📬 Contact

For feedback or contributions:

- GitHub: [abdelhalimYasser](https://github.com/abdelhalimYasser)
- LinkedIn: [abdelhalimyasser](https://www.linkedin.com/in/abdelhalimyasser)

---

# Happy Coding! 🚀

