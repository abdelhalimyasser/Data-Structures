# 🌳 Binary Heap

## 📌 About Binary Heaps

A **Binary Heap** is a complete binary tree that satisfies the heap property, used primarily as a priority queue. It comes in two variants: **Max-Heap**, where each node's value is greater than or equal to its children's values, and **Min-Heap**, where each node's value is less than or equal to its children's values. Heaps are efficient for priority-based operations, such as extracting the maximum or minimum element, and are widely used in algorithms like Heap Sort and Dijkstra’s algorithm.

This folder contains implementations of **Max-Heap** and **Min-Heap** in both `C` and `Java`, designed for educational purposes to demonstrate heap operations and their applications.

**Main Operations (Common Across Implementations):**
- `insert` → Add an element to the heap, maintaining the heap property (O(log n)).
- `delete` → Remove an element at a given index, maintaining the heap property (O(log n)).
- `extractMax` (Max-Heap) → Remove and return the maximum element (O(log n)).
- `extractMin` (Min-Heap) → Remove and return the minimum element (O(log n)).
- `getMax` (Max-Heap) → Retrieve the maximum element without removing it (O(1)).
- `getMin` (Min-Heap) → Retrieve the minimum element without removing it (O(1)).
- `extractMin` (Max-Heap) / `getMin` (Max-Heap) → Find and remove/retrieve the minimum element (O(n)).
- `extractMax` (Min-Heap) / `getMax` (Min-Heap) → Find and remove/retrieve the maximum element (O(n)).
- `buildHeap` → Construct a heap from an array (O(n)).
- `printHeap` → Display the heap’s elements (O(n)).

💡 *Each implementation includes these core operations, with slight variations in error handling and language-specific conventions. The code is optimized for clarity and learning purposes.*

---

## 🚀 Implementations

- **[Max-Heap](Binary%20Heap/Max%20Heap)**: A binary heap where the parent node’s value is greater than or equal to its children’s values, ensuring the maximum element is at the root.
- **[Min-Heap](Binary%20Heap/Min%20Heap)**: A binary heap where the parent node’s value is less than or equal to its children’s values, ensuring the minimum element is at the root.

---

## 📂 Project Structure

```
├── Binary Heap
    ├── Max Heap
    │   ├── Implementation in C
    │   │   ├── README.md
    │   │   ├── main.c
    │   │   ├── maxHeap.c
    │   │   └── maxHeap.h
    │   ├── Implementation in Java
    │   │   ├── Main.java
    │   │   ├── README.md
    │   │   └── MaxHeap.java
    │   └── README.md
    ├── Min Heap
    │   ├── Implementation in C
    │   │   ├── README.md
    │   │   ├── main.c
    │   │   ├── minHeap.c
    │   │   └── minHeap.h
    │   ├── Implementation in Java
    │   │   ├── Main.java
    │   │   ├── MinHeap.java
    │   │   └── README.md
    │   └── README.md
    └── README.md
```

---

## 🛠️ How to Run

### **C Implementations**
1. **Navigate to the directory**:
   - For Max-Heap: `cd Binary Heap/Max Heap/Implementation in C`
   - For Min-Heap: `cd Binary Heap/Min Heap/Implementation in C`
2. **Compile the code**:
    #### For Max-Heap
   ```bash
   gcc -o heap main.c maxHeap.c
   ```
   #### For Min-Heap
   ```bash
   gcc -o heap main.c minHeap.c  
   ```
4. **Run the executable**:
   ```bash
   ./heap
   ```
5. **Expected Output**: The `main.c` files include test cases that insert elements (e.g., 10, 5, 20, 2, 15), print the heap, retrieve the max/min values, and extract the max/min elements, demonstrating the heap’s functionality.

### **Java Implementations**
1. **Navigate to the directory**:
   - For Max-Heap: `cd Binary Heap/Max Heap/Implementation in Java`
   - For Min-Heap: `cd Binary Heap/Min Heap/Implementation in Java`
2. **Compile the code**:
    #### For Max-Heap
    ```bash
       javac Main.java MaxHeap.java
    ```
  
    #### For Min-Heap
    ```bash
       javac Main.java MinHeap.java  
    ```
3. **Run the program**:
   ```bash
   java Main
   ```
4. **Expected Output**: The `Main.java` files include test cases that insert elements (e.g., 10, 5, 20, 2, 15), print the heap, retrieve the max/min values, and extract the max/min elements, demonstrating the heap’s functionality.

---

## 📚 Implementation Details

### **Max-Heap**
- **C Implementation**:
  - Files: `maxHeap.h` (header with function declarations), `maxHeap.c` (function definitions), `main.c` (test program).
  - Uses a fixed-size array (`MAX_SIZE = 100`) to store the heap.
  - Error handling via return codes (e.g., `-1` for empty heap) and printed messages.
- **Java Implementation**:
  - Files: `MaxHeap.java` (class definition), `Main.java` (test program).
  - Uses an encapsulated array with exception-based error handling for empty heap cases.
  - Supports the same operations as the C version but with Java’s object-oriented conventions.

### **Min-Heap**
- **C Implementation**:
  - Files: `minHeap.h` (header with function declarations), `minHeap.c` (function definitions), `main.c` (test program).
  - Uses a fixed-size array (`MAX_SIZE = 100`) to store the heap.
  - Error handling via return codes (e.g., `-1` for empty heap) and printed messages.
- **Java Implementation**:
  - Files: `MinHeap.java` (class definition), `Main.java` (test program).
  - Uses an encapsulated array with exception-based error handling for empty heap cases.
  - Supports the same operations as the C version but with Java’s object-oriented conventions.

---

## 🌟 Features

- **Educational Focus**: The implementations are designed for clarity, with detailed comments explaining each operation.
- **Cross-Language Consistency**: Both C and Java versions implement the same core operations, making it easy to compare language-specific approaches.
- **Robust Testing**: The `main.c` and `Main.java` files include test cases that demonstrate insertion, deletion, and max/min operations.
- **Error Handling**:
  - C: Uses return codes and printed messages for overflow, underflow, and invalid indices.
  - Java: Uses exceptions for empty heap cases and boolean returns for insertion/deletion to enable programmatic error checking.

---

## 📈 Performance

| Operation       | Max-Heap Time Complexity | Min-Heap Time Complexity |
|-----------------|--------------------------|--------------------------|
| `insert`        | O(log n)                | O(log n)                |
| `delete`        | O(log n)                | O(log n)                |
| `extractMax`    | O(log n)                | O(n)                    |
| `extractMin`    | O(n)                    | O(log n)                |
| `getMax`        | O(1)                    | O(n)                    |
| `getMin`        | O(n)                    | O(1)                    |
| `buildHeap`     | O(n)                    | O(n)                    |
| `printHeap`     | O(n)                    | O(n)                    |

**Space Complexity**: O(1) for all operations (excluding the heap array, which is O(MAX_SIZE)).

---

## 💡 Notes

- **Max-Heap vs. Min-Heap**: Max-Heap is optimized for quick access to the maximum element, while Min-Heap is optimized for the minimum. Operations on the opposite extreme (e.g., `extractMin` in Max-Heap) require scanning leaf nodes (O(n)).
- **Scalability**: The fixed `MAX_SIZE` limits the heap size.
- **Applications**: Heaps are used in priority queues, Heap Sort, graph algorithms (e.g., Dijkstra’s, Prim’s), and scheduling tasks.
- **Improvements**: For frequent min/max operations, consider a double-ended priority queue combining both heaps.

---

## 🤝 Contributing

Feel free to fork this project, submit pull requests, or open issues for bugs or feature suggestions. Contributions to improve the code, add new operations, or enhance documentation are welcome!

---

💡 *This project is made for learning purposes and to demonstrate binary heap operations in C and Java.*
