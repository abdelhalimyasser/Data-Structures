package mypackage;
import java.util.Random;

public class Stack {
	private int top;
	private int size;
	private int[] array;

	public Stack(int size) {
		this.top = -1;
		this.size =size;
		this.array = new int[size];
	}

	// Insertion function
	// Stack push function to insert at first
	public void push(int data) {
		if(top == size - 1)
			return;

		array[++top] = data;
	}


	// Deletion function
	// Stack pop function to delete the first
	public int pop() {
		if (top == -1) {
			System.out.println("Stack underflow");
			System.exit(0);
		}

		int popped = array[top];
		array[top] = 0;
		top--;
		return popped;
	}

	// Stack function to clear all the stack
	public void clear() {
		if (top == -1) {
			System.out.println("Stack underflow");
			System.exit(0);
		}

		for(int i = 0; i <= top; i++)
			array[i] = 0;

		top = -1;
	}


	// Search function
	// Stack peek function to get the first element without deleting it
	public int peek() {
		if (top == -1) {
			System.out.println("Stack underflow");
			System.exit(0);
		}

		return array[top];
	}

	// Stack getIndex function to get the index of specific element in stack
	public int getIndex(int data) {
		if (top == -1) {
			System.out.println("Stack underflow");
			System.exit(0);
		}

		for(int i = 0; i <= top; i++) {
			if(array[i] == data)
				return i;
		}

		System.out.println("Not found");
		return -1;
	}

	// Stack getElement function to get the element of specific index in stack
	public int getElement(int index) {
		if (top == -1) {
			System.out.println("Stack underflow");
			System.exit(0);
		}

		if(index <= top)
			return array[index];

		System.out.println("Out of index");
		return -1;
	}

	// Stack getMiddle function to get the middle element
	public int getMiddle() {
		if (top == -1) {
			System.out.println("Stack underflow");
			System.exit(0);
		}

		return array[(int)(top/2)];
	}

	// Stack getLast function to get the last element
	public int getLast() {
		if (top == -1) {
			System.out.println("Stack underflow");
			System.exit(0);
		}

		return array[top];
	}

	// Stack isFound function to check if the specific element is found or not
	public boolean isFound(int data) {
		if (top == -1) {
			System.out.println("Stack is empty");
			System.exit(0);
		}

		for(int i = 0; i <= top; i++) {
			if(array[i] == data)
				return true;
		}

		return false;
	}


	// Stats functions
	// Stack size function to get the size of the stack
	public int size() {
		if (top == -1) {
			System.out.println("Stack is empty");
			System.exit(0);
		}

		return top + 1;
	}

	// Stack sum function to get the sum of the stack
	public int sum() {
		if (top == -1) {
			System.out.println("Stack is empty");
			System.exit(0);
		}

		int sum = 0 ;

		for(int i = 0; i <= top; i++)
	        sum += array[i];

		return sum;
	}

	// Stack average function to get the average of the stack
	public double average() {
		if (top == -1) {
			System.out.println("Stack is empty");
			System.exit(0);
		}

		double sum = 0 ;

		for(int i = 0; i <= top; i++)
	        sum += array[i];

		return sum / (double)(top+1);
	}

	// Stack repeated function to get the number of repeation of element in the stack
	public int repeated(int data) {
		if (top == -1) {
			System.out.println("Stack is empty");
			System.exit(0);
		}

		int repeation = 0 ;

		for(int element : array)
			if(element == data)
				repeation++;

		return repeation;
	}

	// Stack max function to get the max num in the stack
	public int max() {
		if (top == -1) {
			System.out.println("Stack is empty");
			System.exit(0);
		}

		int max = array[0] ;
				
		for(int i = 0; i <= top; i++)
	        if(array[i] > max)
				max = array[i];		

		return max;
	}

	// Stack min function to get the min elemet in the stack
	public int min() {
		if (top == -1) {
			System.out.println("Stack is empty");
			System.exit(0);
		}

		int min = array[0] ;

		for(int i = 0; i <= top; i++)
	        if(array[i] < min)
				min = array[i];	

		return min;
	}


	//Utility functions
	// Stack printStack function to print all the stack element
	public void printStack() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}

		for(int i = 0; i <= top; i++)
			System.out.println("["+ i + "]" + " -> " + array[i]);
	}

	// Stack sort function to sort the stack using bubble sort algrothim
	public void sort() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}

		boolean swapped;

		for(int i = 0; i <= top; i++) {
			swapped = false;
			for(int j = 0; j < top - i; j++)
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}

			if(!swapped)
				break;
		}
	}

	// Stack removeDuplicates function to remove all duplicates and works only when the list is "SORTED"
	public void removeDuplicates() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}

		this.sort();

		int j = 0;

		for(int i = 0; i < top; i++)
			if(array[i] != array[i + 1])
				array[j++] = array[i];

		array[j++] = array[top];

		for (int i = j; i <= top; i++)
			array[i] = 0;

		top = j - 1;
	}

	// Stack reverse function to reverse the Stack
	public void reverse() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}

		for(int i = 0; i < (top/2) + 1; i++) {
			int temp = array[i];
			array[i] = array[top - i];
			array[top - i] = temp;
		}
	}
	
    // Stack randmomize function to randmomize the stack
    public void randomize() {
        if (top <= 0) 
		    return; 

        Random rand = new Random();
        for (int i = 0; i <= top; i++) {
             int randomIndex = rand.nextInt(top + 1); 
             int temp = array[i];
             array[i] = array[randomIndex];
             array[randomIndex] = temp;
         }
    }
	
	// Stack swap function to swap data1 with data2
	public void swapData(int data1, int data2) {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}

		int index1 = -1;
		int index2 = -1;

		for(int i = 0; i <= top; i++) {
			if(array[i] == data1) index1 = i;
			if(array[i] == data2) index2 = i;
		}

		if(index1 != -1 && index2 != -1) {
			int temp = array[index2];
			array[index2] = array[index1];
			array[index1] = temp;
		}
		else
			System.out.println("One or both values not found in the stack");

	}

	// Stack swap function to swap index1 with index2
	public void swapIndex(int index1, int index2) {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}

		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}


	// Extra Operations
	// Stack clone function to return clone of the stack
	public Stack clone(Stack stack) {
		if (top == -1) {
			System.out.println("Stack is empty");
			System.exit(0);
		}

		Stack copy = new Stack(size);

		for(int i = 0; i < size; i++)
			copy.push(array[i]);

		return copy;
	}

	// Stack equals function to check if the stacks are equal or not
	public boolean equals(Stack stack) {
		if (this.top == -1 && stack.top == -1) {
			System.out.println("One or both of two stacks is empty");
			System.exit(0);
		}

		if (this.top != stack.top)
			return false;

		for(int i = 0; i <= top; i++)
			if(this.array[i] != stack.array[i])
				return false;

		return true;
	}

	// Stack concat function to append another stack to the current one
	public Stack concat(Stack stack) {
		if (this.top == -1 && stack.top == -1) {
			System.out.println("One or both of two stacks is empty");
			System.exit(0);
		}

		Stack copy = new Stack((this.size + stack.size));

		for(int i = 0; i <= top; i++)
			copy.push(this.array[i]);

		for(int i = 0; i <= stack.top; i++)
			copy.push(stack.array[i]);

		return copy;
	}

	// Stack isEmpty function to get if the stack is empty of full
	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}


	// Conversion functions
	// Stack toArray function to convert the stack into array
	public int[] toArray() {
		int[] result = new int[top + 1];

		for (int i = 0; i <= top; i++)
			result[i] = array[i];

		return result;
	}

	// Stack toStack function to convert array into stack
	public Stack toStack(int[] array) {
		Stack stack = new Stack(array.length);

		for(int i = 0; i < array.length; i++)
			stack.push(array[i]);

		return stack;
	}
}
