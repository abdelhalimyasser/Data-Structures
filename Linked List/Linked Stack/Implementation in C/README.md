# 🌟 Linked Stack
This project provides a C implementation of a Linked Stack, a dynamic data structure that follows the `Last-In-First-Out (LIFO)` principle, implemented using a singly linked list. Each node in the list represents an element in the stack, with operations performed at the top (head) for efficiency. The implementation is iterative, supporting key operations like push, pop, peek, size, isEmpty, isFull, print, and freeing the stack to prevent memory leaks. The project is designed for educational purposes, demonstrating efficient stack operations in C.
This project is part of a larger `"Data Structures"` repository that includes other data structures like `Linked List`, `Queue`, `etc.`

---

## 📌 About Linked Stack
A `Linked Stack` is a stack data structure implemented using a `linked list`, where elements are added and removed from the top. This allows for dynamic sizing without the need for a fixed array, making it efficient for scenarios with unknown or varying stack sizes. Linked stacks are commonly used in applications like function call stacks, expression evaluation, and backtracking algorithms.

### Main Operations:
- `createNode(data)` → Creates a new node with the given data.
- `push(&top, &size, element)` → Adds an element to the top of the stack.
- `pop(&top, &size)` → Removes and returns the top element from the stack.
- `peek(top)` → Returns the top element without removing it.
- `print(top)` → Prints the stack elements with indices.
- `isEmpty(top)` → Checks if the stack is empty.
- `isFull(top)` → Checks if the stack is full (based on memory availability).
- `freeLinkedStack(&top, &size)` → Frees all nodes in the stack to prevent memory leaks.

*💡 This implementation handles integer values for simplicity. If you want more functions, you can go to the [Linked List](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Linked%20List/Linked%20List/Implementation%20of%20Linked%20List%20in%20C) and [Stack](https://github.com/abdelhalimyasser/Data-Structures/tree/main/Stack/Implementation%20of%20Stack%20in%20C) implementations.*

---

## 📂 Project Structure

```
Linked Stack
│   ├── Implementation in C
│   │   ├── stack.c
│   │   ├── stack.h
│   │   ├── main.c
│   |   └── README.md
```

### Implementation in C:
- `stack.c`: Contains the Linked Stack operations (`createNode`, `push`, `pop`, `peek`, `print`, `isEmpty`, `isFull`, `freeLinkedStack`).
- `stack.h`: Contains the header file with structure definitions and function prototypes.
- `main.c`: Test program demonstrating the Linked Stack operations.
- `README.md`: This file, providing an overview of the Linked Stack project in C.

---

# 🧱 Example Usage
## 🌲 Sample Stack
### The implementation is tested with the following Linked Stack:

``` c
Node* stack = createNode(1);
int size = 1;
    
// pushing elements
push(&stack, &size, 2);
push(&stack, &size, 3);
push(&stack, &size, 4);

printf("Stack after pushes: \n");
print(stack);

printf("\nTop element: %d\n", peek(stack));

// popping one element
printf("Popped element: %d\n", pop(&stack, &size));

printf("\nStack after pop: \n");
print(stack);
	
// checking current size
printf("\nCurrent size: %d\n" , size);
	
// Checking if stack is empty
printf("Is stack empty: %s\n", isEmpty(stack) ? "Yes" : "No");

// Checking if stack is full
printf("Is stack full: %s\n", isFull(stack) ? "Yes" : "No");
    
freeLinkedStack(&stack, &size);
printf("\nAfter Free:");
    
// checking current size
printf("\nCurrent size: %d\n" , size);
	
// Checking if stack is empty
printf("Is stack empty: %s\n", isEmpty(stack) ? "Yes" : "No");
```

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
Is stack full: Yes

After Free:
Current size: 0
Is stack empty: Yes
```
---

# 🛠️ Setup Instructions
## Run the C Implementation
### Clone the Repository
```bash
git clone https://github.com/abdelhalimyasser/data-structures.git
cd Linked List/Linked Stack
```

### Compile and Run the Implementation
```bash
cd Implementation in C
gcc main.c -o main
./main
```

*Note: Ensure all code is in main.c or adjust to include a separate stack.h if split. The main.c file tests the implementation.*

---

# 🧾 Notes

- The implementation uses `integers` only for simplicity (not generic).
- The iterative implementation uses loops and pointers, with O(1) time and space complexity for `push`, `pop`, `peek`, `isEmpty`, and `isFull`.
- The pop function handles underflow by returning -1 and printing a message.
- Memory leaks are prevented with freeLinkedStack and proper node deallocation in pop.
- The print function provides an indexed representation for debugging.
- The isFull checks for memory exhaustion, as linked stacks have no fixed size limit.
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
