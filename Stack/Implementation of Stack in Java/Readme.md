# 📦 Integer Stack in Java

This project implements a **stack** data structure using a fixed-size integer array in Java. It supports core stack operations as well as advanced utilities like sorting, reversing, duplication removal, conversion, and more.

---

## 📂 Project Structure

- `Stack`: Main class implementing all stack operations.
- `Main`: Example usage and testing.

---

## ✅ Features

### 🧱 Stack Basics
- `push(int data)` - Add an element on top of the stack.
- `pop()` - Remove and return the top element.
- `peek()` - Return the top element without removing it.
- `isEmpty()` - Check if the stack is empty.

## 🚀 Example Usage
```java
Stack stack = new Stack(5);

stack.push(10);
stack.push(20);
stack.push(30);
stack.push(40);

System.out.println(stack.pop());  // 20
System.out.println(stack.peek()); // 10
System.out.println("Is stack empty? " + stack.isEmpty());  // false

```
--- 

### 🔍 Search
- `isFound(int data)` - Check if a value exists.
- `getIndex(int data)` - Return the index of a given value.
- `getElement(int index)` - Get the value at a specific index.
## 🚀 Example Usage

```java
System.out.println("Index of 20: " + stack.getIndex(20));            
System.out.println("Element at index 2: " + stack.getElement(2));     
System.out.println("Middle element: " + stack.getMiddle());           
System.out.println("Last element: " + stack.getLast());               
System.out.println("Is 30 found? " + stack.isFound(30));              
```
---

### 📊 Statistics
- `sum()` - Return the sum of all elements.
- `average()` - Return the average value.
- `repeated(int data)`  - Return the number of repetion of num in the stack
- `max()` - Return the maximum value.
- `min()` - Return the minimum value.
- `size()` - Return the current number of elements.
```java
System.out.println(stack.countList());   
System.out.println(stack.sumNums());     
System.out.println(stack.averageNums());
System.out.println(stack.repeated(2));
System.out.println(stack.maxList());     
System.out.println(stack.minList());     
```
---

### 🧹 Utilities
- `removeDuplicates()` - Remove duplicate values.
- `reverse()` - Reverse the stack in-place.
- `sort()` - Sort the stack in ascending order.
- `randomize` -Randomize the stack elements.
- `swap(int data1, int data2)` - Swap two values in the stack (if both exist).
- `swap(int index1, int index2)` - Swap two indices in the stack (if both exist).

## 🚀 Example Usage
```java
stack.removeDuplicates(); 
stack.reverse();          
stack.randmomize()        
stack.sort();             
stack.swap(10, 30);       
stack.swapIndex(1, 3)     
```

---

### 🔁 Conversion
- `toArray()` - Return a copy of the stack as an array.
- `toStack(int[] array)` - Create a new stack from an array.
``` java
int[] arr = stack.toArray();
System.out.println("Converted to array:");
for (int val : arr) System.out.print(val + " ");
System.out.println();

Stack stack2 = stack.toStack(new int[] {1, 2, 3});
System.out.println("s2 stack:");
```
---

### 🧪 Extras
- `clone()` - Return a deep copy of the stack.
- `equals(Stack stack)` - Check if two stacks are equal.
- `concat(Stack stack)` - Concatenate another stack to this one.

```java
Stack stack1 = new Stack(5);
Stack stack2 = new Stack(5);

stack1.push(10);
stack1.push(20);
stack1.push(30);
stack1.push(30);

stack2.push(40);
stack2.push(40);
stack2.push(50);
stack2.push(60);

Stack clone = stack.clone(s1);
clone.printStack();

System.out.println("stack1 equals stack2? " + stack1.equals(stack2));  // false
System.out.println("s1 equals clone? " + s1.equals(clone));            // true

Stack concatStack = s1.concat(s2);
concatStack.printStack();
```
---

## 🧱 Algorithm Steps

1. Create an array to hold elements.
2. Track the top index.
3. Implement operations using simple array logic.
4. Handle edge cases (e.g. empty/full stack).
5. Add utility methods (sort, reverse, remove duplicates).

---

## 📂 Requirements

- Java 8 or higher
- Basic understanding of arrays and stack logic

---

## 🧾 Notes

- This stack uses fixed size arrays.
- It is limited to `INTEGER` values only (not generic).
- For simplicity, all operations are iterative (not recursive).
- Useful for educational purposes and basic stack applications.

---

## 📬 Contact

For feedback or contributions:

- GitHub: [abdelhalim-yasser](https://github.com/abdelhalimyasser)
- LinkedIn: [abdelhalim-yasser](https://www.linkedin.com/in/abdelhalimyasser)

---

# Happy Coding! 🚀
