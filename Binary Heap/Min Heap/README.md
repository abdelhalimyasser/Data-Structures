# 🌳 Min-Heap

This project provides implementations of a **Min-Heap** data structure in C and Java, focusing on priority queue operations optimized for retrieving the minimum element. A Min-Heap is a complete binary tree where each node's value is less than or equal to its children's values, ensuring the smallest element is at the root. The implementations include core operations like insertion, deletion, extraction of minimum/maximum elements, and heap construction from an array, designed for educational purposes to demonstrate heap functionality.

This project is part of a larger **Binary Heap** repository that also includes Max-Heap implementations.

---

## 🚀 Implementations

- **[Min-Heap in C](Implementation%20in%20C)**: Implemented using a fixed-size array with pointer-based operations and error handling via return codes.
- **[Min-Heap in Java](Implementation%20in%20Java)**: Implemented using an encapsulated array with object-oriented design.

---

## 📌 About Min-Heap

A **Min-Heap** is a complete binary tree used as a priority queue, where the parent node’s value is less than or equal to its children’s values. It is widely used in algorithms like Heap Sort, Dijkstra’s algorithm, and task scheduling, where quick access to the minimum element is critical.

**Main Operations:**
- `insert(element)` → Add an element to the heap, maintaining the min-heap property (O(log n)).
- `delete(index)` → Remove an element at a given index, maintaining the min-heap property (O(log n)).
- `extractMin()` → Remove and return the minimum element (root) (O(log n)).
- `extractMax()` → Remove and return the maximum element (from leaf nodes) (O(n)).
- `getMin()` → Retrieve the minimum element without removing it (O(1)).
- `getMax()` → Retrieve the maximum element from leaf nodes without removing it (O(n)).
- `buildHeap(array)` → Construct a min-heap from an array (O(n)).
- `printHeap()` → Display the heap’s elements (O(n)).

💡 *Each implementation provides the same core functionality, with language-specific optimizations and error handling.*

---

## 📂 Project Structure

```
Min Heap
├── Implementation in C
│   ├── main.c
│   ├── minHeap.c
│   └── minHeap.h
├── Implementation in Java
│   ├── Main.java
│   ├── MinHeap.java
└── README.md
```

- **Implementation in C**:
  - `minHeap.h`: Header file defining function prototypes and data structures.
  - `minHeap.c`: Implementation of min-heap operations.
  - `main.c`: Test program demonstrating min-heap operations.
- **Implementation in Java**:
  - `MinHeap.java`: Defines the `MinHeap` class with all operations.
  - `Main.java`: Test program demonstrating min-heap operations.
- **README.md**: This file, providing an overview of the min-heap project.

---

## 🧱 Example Usage

### 🌲 Sample Min-Heap

Both implementations use the following test case in `main.c` and `Main.java`, inserting elements `[10, 5, 20, 2, 15]`:

```
       2
      / \
     5   20
    / \
   10  15
```

### 🔁 Operation Output

- **Heap after insertions**:
  ```
  [0] -> 2
  [1] -> 5
  [2] -> 20
  [3] -> 10
  [4] -> 15
  ```
- **getMin()**: `2`
- **getMax()**: `20`
- **extractMin()**: `2`
- **Heap after extracting min**:
  ```
  [0] -> 5
  [1] -> 10
  [2] -> 20
  [3] -> 15
  ```
- **extractMax()**: `20`
- **Heap after extracting max**:
  ```
  [0] -> 5
  [1] -> 10
  [2] -> 15
  ```

---

## 🛠️ Setup Instructions

### Run the C Implementation
#### Navigate to the Directory
```bash
cd Binary Heap/Min Heap/Implementation in C
```

#### Compile the Code
```bash
gcc -o minHeap main.c minHeap.c
```

#### Run the Program
```bash
./minHeap
```

### Run the Java Implementation
#### Navigate to the Directory
```bash
cd Binary Heap/Min Heap/Implementation in Java
```

#### Compile the Code
```bash
javac Main.java MinHeap.java
```

#### Run the Program
```bash
java Main
```

---

## 🧾 Notes

- Both implementations use **integer values** for simplicity (not generic).
- The C implementation uses a **fixed-size array** (`MAX_SIZE = 100`) for memory efficiency.
- The Java implementation uses an **encapsulated array** with exception-based error handling for robustness.
- **Performance**:
  - `insert`, `delete`, `extractMin`: O(log n)
  - `extractMax`, `getMax`: O(n) (due to scanning leaf nodes)
  - `getMin`: O(1)
  - `buildHeap`, `printHeap`: O(n)
- **Space Complexity**: O(1) for operations (excluding the heap array, which is O(MAX_SIZE)).
- Part of a larger **Binary Heap repository** with Max-Heap implementations.

---

## 📬 Contact

For questions, suggestions, or collaboration, reach out via:  
<p align="left">
  <a href="https://linkedin.com/in/abdelhalimyasser"><img src="https://skillicons.dev/icons?i=linkedin" alt="LinkedIn" /></a>&nbsp;
  <a href="mailto:abdelhalimyasser88@gmail.com?subject=Collaboration&body=hi%2C%20abdelhalim%20-%20I%20want%20to%20collaborate%20with%20you%20in..."><img src="https://skillicons.dev/icons?i=gmail" alt="Gmail" /></a>&nbsp;
  <a href="https://instagram.com/abdelhalim__yasser"><img src="https://skillicons.dev/icons?i=instagram" alt="Instagram" /></a>&nbsp;
  <a href="https://x.com/abdelhalimyass"><img width="48" height="48" src="https://github.com/user-attachments/assets/e21830c6-ccff-4860-a839-02b817a519b8" alt="X" /></a>&nbsp;
  <a href="https://discord.com/abdelhalimyasser"><img src="https://skillicons.dev/icons?i=discord" alt="Discord" /></a>&nbsp;
  <a href="https://wechat.com/abdelhalimyasser"><img width="48" height="48" src="https://github.com/user-attachments/assets/ac94c75c-1efe-4aff-aefc-e62a806f86e6" alt="Wechat" /></a>&nbsp;
  <a href="https://vk.com/abdelhalimyasser"><img width="48" height="48" src="https://github.com/user-attachments/assets/c22a431c-b8b3-43de-a8a1-d2f20d55ad9c" alt="Vk" /></a>
</p>

---

# Happy Coding! 🚀
