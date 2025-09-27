# 🌟 Linked Stack

This project provides a Java implementation of a Linked Stack, a dynamic data structure that follows the Last-In-First-Out (LIFO) principle, implemented using a singly linked list. Each node in the list represents an element in the stack, with operations performed at the top (head) for efficiency. The implementation is iterative, supporting key operations like push, pop, peek, size, isEmpty, isFull, print, and clearing the stack to manage memory. The project is designed for educational purposes, demonstrating efficient stack operations in Java.

This project is part of a larger "Data Structures" repository that includes other data structures like Linked List, Queue, etc.

---

## 📌 About Linked Stack

A Linked Stack is a stack data structure implemented using a linked list, where elements are added and removed from the top. This allows for dynamic sizing without the need for a fixed array, making it efficient for scenarios with unknown or varying stack sizes. Linked stacks are commonly used in applications like function call stacks, expression evaluation, and backtracking algorithms.

### Main Operations:
- `new Node(data)` → Creates a new node with the given data.
- `push(element)` → Adds an element to the top of the stack.
- `pop()` → Removes and returns the top element from the stack.
- `peek()` → Returns the top element without removing it.
- `size()` → Returns the current number of elements in the stack.
- `print()` → Prints the stack elements with indices.
- `isEmpty()` → Checks if the stack is empty.
- `isFull()` → Checks if the stack is full (based on memory availability, though rare in linked structures).
- `clear()` → Clears all nodes in the stack to manage memory.

💡 *This implementation handles integer values for simplicity. Duplicates are allowed. If you want more functions (e.g., reverse stack, duplicate check), you can go to the [Linked List](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Linked%20List/Linked%20List/Implementation%20of%20Linked%20List%20in%20Java) or [Stack](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Stack/Implementation%20of%20Stack%20in%20Java) implementations.*

---

## 📂 Project Structure
```
├── Implementation in Java
│   ├── LinkedStack.java
│   ├── Main.java
│   ├── Node.java
│   └── README.md
```
---

### Implementation in Java:
- `LinkedStack.java`: Contains the Linked Stack class with operations (`push`, `pop`, `peek`, `size`, `print`, `isEmpty`, `isFull`, `clear`).
- `Node.java`: Contains the Node class with structure definitions.
- `Main.java`: Test program demonstrating the Linked Stack operations.
- `README.md`: This file, providing an overview of the Linked Stack project in Java.

---

## 🧱 Example Usage

### 🌲 Sample Stack

The implementation is tested with the following Linked Stack:

```java
public class Main {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        
        // pushing elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack after pushes: ");
        stack.print();

        System.out.println("\nTop element: " + stack.peek());

        // popping one element
        System.out.println("Popped element: " + stack.pop());

        System.out.println("\nStack after pop: ");
        stack.print();
        
        // checking current size
        System.out.println("\nCurrent size: " + stack.size());
        
        // checking if stack is empty
        System.out.println("Is stack empty: " + (stack.isEmpty() ? "Yes" : "No"));

        // checking if stack is full
        System.out.println("Is stack full: " + (stack.isFull() ? "Yes" : "No"));
        
        stack.clear();
        System.out.println("\nAfter Clear:");
        
        // checking current size
        System.out.println("\nCurrent size: " + stack.size());
        
        // checking if stack is empty
        System.out.println("Is stack empty: " + (stack.isEmpty() ? "Yes" : "No"));
    }
}
```
---
## 🔁 Operations Output

```
Stack after pushes: 
[0] -> 4
[1] -> 3
[2] -> 2
[3] -> 1

Top element: 4
Popped element: 4

Stack after pop: 
[0] -> 3
[1] -> 2
[2] -> 1

Current size: 3
Is stack empty: No
Is stack full: No

After Clear:
Current size: 0
Is stack empty: Yes
```
---

# 🛠️ Setup Instructions
## Run the Java Implementation
### Clone the Repository
```bash
git clone https://github.com/abdelhalimyasser/data-structures.git
cd Stack/Linked Stack
```

### Compile and Run the Implementation
```bash
cd Implementation in Java
javac Main.java
java Main
```

*Note: Ensure all code is in Main.java or adjust to include separate files if split. The Main.java file tests the implementation.*

---

# 🧾 Notes

- The implementation uses `integers` for simplicity (not generic).
- The iterative implementation uses loops and references, with `O(1)` time and space complexity for `push`, `pop`, `peek`, `size`, `isEmpty`, and `isFull`.
- The pop function handles underflow by throwing an exception or returning a special value and printing a message.
- Memory management is handled by Java's garbage collector, but clear is provided to explicitly reset the stack.
- The print function provides an indexed representation for debugging.
- Part of a larger Data Structures repository with implementations of `Linked List`, `Queue`, and `etc.`


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
