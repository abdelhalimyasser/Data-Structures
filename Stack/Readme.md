# 📦 Stack
## 📌 About Stack

A **Stack** is a linear data structure that follows the **LIFO** (Last In, First Out) principle.  
The last element inserted is the first one to be removed.

**Main Operations:**
- `push()` → Add an element to the top of the stack  
- `pop()` → Remove the element from the top of the stack  
- `peek()` → View the top element without removing it  
- `isEmpty()` → Check if the stack is empty  

💡 *Each implementation folder contains common functions and some different ones, but the core logic is the same.*

---

## 🚀 Implementations

- **[Stack in C](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Stack/Implementation%20of%20Stack%20in%20C)**
- **[Stack in Java](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Stack/Implementation%20of%20Stack%20in%20Java)**

---

## 🌐 Try it Online

You can try the **interactive stack visualization** here:  
👉 **[Live Demo](https://abdelhalimyasser.github.io/Data-Structure-Visualizers/Stack%20Visualizer.html)**

---

## 📈 Performance

| Operation          | C Time Complexity | Java Time Complexity |
|--------------------|-------------------|----------------------|
| `createStack`      | O(1)             | O(1)                |
| `push`             | O(1)             | O(1)                |
| `pop`              | O(1)             | O(1)                |
| `clear`            | O(n)             | O(n)                |
| `peek`             | O(1)             | O(1)                |
| `getIndex`         | O(n)             | O(n)                |
| `getElement`       | O(1)             | O(1)                |
| `getMiddle`        | O(1)             | O(1)                |
| `getLast`          | O(1)             | O(1)                |
| `isFound`          | O(n)             | O(n)                |
| `size`             | O(1)             | O(1)                |
| `sum`              | O(n)             | O(n)                |
| `average`          | O(n)             | O(n)                |
| `repeated`         | O(n)             | O(n)                |
| `max`              | O(n)             | O(n)                |
| `min`              | O(n)             | O(n)                |
| `printStack`       | O(n)             | O(n)                |
| `sort`             | O(n²)            | O(n²)               |
| `removeDuplicates` | O(n²)            | O(n²)               |
| `reverse`          | O(n)             | O(n)                |
| `randomize`        | O(n)             | O(n)                |
| `swapData`         | O(n)             | O(n)                |
| `swapIndex`        | O(1)             | O(1)                |
| `clone`            | O(n)             | O(n)                |
| `equals`           | O(n)             | O(n)                |
| `concat`           | N/A              | O(n + m)            |
| `isEmpty`          | O(1)             | O(1)                |
| `toArray`          | N/A              | O(n)                |
| `toStack`          | N/A              | O(n)                |

**Space Complexity**: O(1) for all operations (excluding the stack array, which is O(MAX) in C and O(size) in Java). The `clone`, `concat`, and `toStack` operations in Java require O(n) or O(n + m) additional space for new stack instances, and `toArray` requires O(n) for the output array.

---

## 📂 Project Structure

```
├── Implentation of Stack in C
    ├── Readme.md
    ├── Stack.c
    ├── Stack.h
    └── main.c
├── Implentation of Stack in java
    ├── Main.java
    ├── Readme.md
    └── Stack.java
```

---


💡 *This project is made for learning purposes and to demonstrate stack operations visually.*
