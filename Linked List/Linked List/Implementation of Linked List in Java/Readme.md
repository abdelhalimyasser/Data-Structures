# 📊 Integer Linked List in Java

This project implements a **singly linked list** in Java that stores integers only. It includes a wide range of operations such as insertion, deletion, searching, sorting, cloning, and more.

---

## 📂 Project Structure

- Node: A simple class that holds an integer and a reference to the next node.
- linkedList: The main class that handles all list operations.

---

## ✅ Features

### 🔁 Insertion
- `addFirst(int data)` - Add a node at the beginning.
- `add(int data)` - Add a node at the end.
- `addIndex(int data, int index)` - Add a node at a specific index.
## 🚀 Example Usage

```java
linkedList list = new linkedList();

list.addFirst(10);
list.add(30);
list.addIndex(20, 1);
list.printList(); // Output: [0] 10 -> [1] 20 -> [2] 30
```

--- 

### ❌ Deletion
- `deleteFirst()` - Remove and return the first element.
- `delete()` - Remove and return the last element.
- `deleteIndex(int index)` - Remove an element at a specific index.
- `deleteData(int data)` - Remove the first node with the given value.
- `deleteList()` - Delete the entire list.
## 🚀 Example Usage

```java
linkedList list = new linkedList();

list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);

list.deleteIndex(2);    // Removes element at index 2 (30)
list.deleteData(40);    // Removes the node with value 40
list.delete();          // Removes last element (50)
list.deleteFirst();     // Removes first element (10)

list.deleteList();     // Deletes the entire list (now it's empty)
list.printList();     // Output: The list is empty.
```

--- 

### 🔍 Search
- `isFound(int data)` - Check if a value exists.
- `getIndex(int data)` - Return the index of a given value.
- `getElement(int index)` - Get the value at a specific index.
## 🚀 Example Usage

```java
linkedList list = new linkedList();

list.add(100);
list.add(200);
list.add(300);

System.out.println(list.isFound(200));  // true
System.out.println(list.getIndex(300)); // 2
System.out.println(list.getElement(0)); // 100
```

--- 

### 📊 Stats
- `countList()` - Return the number of elements.
- `sumNums()` - Return the sum of all elements.
- `averageNums()` - Return the average of all elements.
- `maxList()`  - Return the Max.
- `minList()` - Return the Min.
## 🚀 Example Usage

```java
linkedList list = new linkedList();

list.add(5);
list.add(15);
list.add(25);

System.out.println(list.countList());   // 3
System.out.println(list.sumNums());     // 45
System.out.println(list.averageNums()); // 15.0
System.out.println(list.maxList());     // 25
System.out.println(list.minList());     // 5
```

--- 

### 📚 Utility
- `printList()` - Print all elements with their index.
- `removeDuplicates()` - Remove duplicate elements.
- `reverse()` - Reverse the list.
- `sort()` - Sort the list in ascending order.
- `swap(int data1, int data2)` - Swap two nodes by value.
## 🚀 Example Usage

```java
linkedList list = new linkedList();

list.add(3);
list.add(1);
list.add(2);
list.add(1);
list.printList();         // [0] 3 -> [1] 1 -> [2] 2 -> [3] 1

list.removeDuplicates();  // removes one of the 1s
list.printList();         // [0] 3 -> [1] 1 -> [2] 2

list.reverse();           // reverses the list
list.printList();         // [0] 2 -> [1] 1 -> [2] 3

list.sort();              // sorts the list
list.printList();         // [0] 1 -> [1] 2 -> [2] 3

list.swap(1, 3);
list.printList();         // [0] 3 -> [1] 2 -> [2] 1
```

---

### 🧪 Extra Operations
- `clone()` - Return a deep copy of the list.
- `equals(linkedList list)` - Compare this list with another.
- `concat(linkedList list)` - Append another list to the current one.
## 🚀 Example Usage

```java
linkedList list = new linkedList();
list1.add(1);
list1.add(2);

linkedList list2 = list1.clone();               // deep copy
System.out.println(list1.equals(list2));        // true

linkedList list3 = new linkedList();
list3.add(3);
list3.add(4);

list1.concat(list3);                            // join list3 to list1
list1.printList(); // [0] 1 -> [1] 2 -> [2] 3 -> [3] 4
```

---

### 🔁 Conversion
- `toArray()` - Convert the list to an integer array.
- `fromArray(int[] array)` - Create a new list from an integer array.
## 🚀 Example Usage

```java
linkedList list = new linkedList();

int[] nums = {10, 20, 30, 40};

list.fromArray(nums);        // fill from array
list.printList();            // [0] 10 -> [1] 20 -> [2] 30 -> [3] 40

int[] arr = list.toArray();  // convert to array
System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40]
```

---

## 🧱 Algorithm Steps

1. Create a `Node` class.
2. Define `LinkedList` with a `Node head` and `int size`.
3. Implement the required operations using `basic linked list` logic.
4. Handle edge cases (empty list, invalid positions, etc..`).
5. Add extra methods like `clone()`, `equals()`, `concat()`, `etc..`

---

## 📂 Requirements

- Java 8 or higher
- Basic understanding of OOP and linked list data structures

---

## 🧾 Notes

- This implementation uses a **singly linked list**.
- It just deals with `INTEGERS` not `GENERICS`.  *It will be updated soon.*
- You can copy this into any `Java project` and start using it.
- It's well suited for learning and educational demos.

---

## 🔐 License

This project is licensed under the `MIT` License. You are free to use, modify, and distribute it.

---

## 📬 Contact Me

For questions, improvements, or collaborations:

- GitHub: [abdelhalim-yasser](https://github.com/abdelhalim-yasser)
- LinkedIn: [abdelhalim-yasser](https://www.linkedin.com/in/abdelhalim-yasser)

---

# Happy Coding! 🚀
