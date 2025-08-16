# 📦 Integer Stack in C

This project implements a **stack** data structure using a fixed-size integer array in C.  
It supports core stack operations as well as advanced utilities like sorting, reversing, duplication removal, conversion, and more.

---

## 📂 Project Structure

- `Stack.h` → The header of all stack functions.
- `Stack.c` → Implementation of all stack functions.
- `main.c` → Example usage and testing.

---

## ✅ Features

### 🧱 Stack Basics
- `push(Stack* s, int data)` → Add an element on top of the stack.
- `pop(Stack* s)` → Remove and return the top element.
- `peek(Stack* s)` → Return the top element without removing it.
- `isEmpty(Stack* s)` → Check if the stack is empty.

**Example:**
```c
Stack s1;
initStack(&s1, 5);

push(&s1, 10);
push(&s1, 20);
push(&s1, 30);
push(&s1, 40);

printf("%d\n", pop(&s1)); // 40
printf("%d\n", peek(&s1)); // 30
printf("Is stack empty? %d\n", isEmpty(&s1)); // 0 (false)
```
---

### 🔍 Search
- `isFound(Stack* s, int data)` → Check if a value exists.
- `getIndex(Stack* s, int data)` → Return the index of a given value.
- `getElement(Stack* s, int index)` → Get the value at a specific index.
- `getMiddle(Stack* s)` → Return the middle element.
- `getLast(Stack* s)` → Return the last element.

**Example:**
```c
printf("Index of 20: %d\n", getIndex(&s1, 20));
printf("Element at index 2: %d\n", getElement(&s1, 2));
printf("Middle element: %d\n", getMiddle(&s1));
printf("Last element: %d\n", getLast(&s1));
printf("Is 30 found? %d\n", isFound(&s1, 30));
```
---

### 📊 Statistics
- `sum(Stack* s)` → Return the sum of all elements.
- `average(Stack* s)` → Return the average value.
- `max(Stack* s)` → Return the maximum value.
- `min(Stack* s)` → Return the minimum value.
- `size(Stack* s)` → Return the current number of elements.

**Example:**
```c
printf("Size: %d\n", size(&s1));
printf("Sum: %d\n", sum(&s1));
printf("Average: %.2f\n", average(&s1));
printf("Max: %d\n", max(&s1));
printf("Min: %d\n", min(&s1));
```
---

### 🧹 Utilities
- `removeDuplicates(Stack* s)` → Remove duplicate values.
- `reverse(Stack* s)` → Reverse the stack in-place.
- `sort(Stack* s)` → Sort the stack in ascending order.
- `randomize(Stack* s)` → Randomize the stack elements.
- `swapData(Stack* s, int data1, int data2)` → Swap two values.
- `swapIndex(Stack* s, int index1, int index2)` → Swap two indices.

**Example:**
```c
removeDuplicates(&s1);
reverse(&s1);
randomize(&s1);
sort(&s1);
swapData(&s1, 10, 30);
swapIndex(&s1, 1, 3);
```
---

### 🔁 Conversion
- `toArray(Stack* s, int arr[])` → Copy stack elements into an array.
- `toStack(int arr[], int size)` → Create a new stack from an array.

**Example:**
```c
int arr[10];
toArray(&s1, arr);

Stack s2 = toStack(arr, size(&s1));
printStack(&s2);
```
---

### 🧪 Extras
- `clone(Stack* src)` → Return a copy of a stack.
- `equals(Stack* s1, Stack* s2)` → Check if two stacks are equal.
- `concat(Stack* s1, Stack* s2)` → Concatenate another stack to this one.
- `clear(Stack* s)` → Remove all elements.

**Example:**
```c
Stack cloneS = clone(&s1);
printf("s1 equals s2? %d\n", equals(&s1, &s2));

Stack concatS = concat(&s1, &s2);
printStack(&concatS);

clear(&s1);
printf("Is s1 empty? %d\n", isEmpty(&s1));
```
---

## 🧱 Algorithm Steps
1. Create an array to hold elements.
2. Track the top index.
3. Implement operations using simple array logic.
4. Handle edge cases (empty/full stack).
5. Add utilities (sort, reverse, remove duplicates, etc.).

---

## 📂 Requirements
- C Compiler (GCC/Clang).
- Basic knowledge of C and stack logic.

---

## 🧾 Notes
- Fixed size integer stack (not generic).
- Operations are iterative (not recursive).
- Good for learning stack logic in C.

---

## 📬 Contact
For feedback or contributions:

- GitHub: [abdelhalim-yasser](https://github.com/abdelhalim-yasser)
- LinkedIn: [abdelhalim-yasser](https://www.linkedin.com/in/abdelhalim-yasser)

---

# Happy Coding! 🚀
