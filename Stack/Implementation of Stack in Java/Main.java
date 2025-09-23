import mypackage.Stack;

public class Main
{
	public static void main(String[] args) {
		Stack s1 = new Stack(10);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(20);
		s1.push(10);
		s1.push(40);
		s1.printStack();

		System.out.println("Peek: " + s1.peek());
		System.out.println("Index of 20: " + s1.getIndex(20));
		System.out.println("Element at index 2: " + s1.getElement(2));
		System.out.println("Middle element: " + s1.getMiddle());
		System.out.println("Last element: " + s1.getLast());
		System.out.println("Is 30 found? " + s1.isFound(30));

		System.out.println("Size: " + s1.size());
		System.out.println("Sum: " + s1.sum());
		System.out.println("Average: " + s1.average());
		System.out.println("Repeated 20: " + s1.repeated(20));
		System.out.println("Max: " + s1.max());
		System.out.println("Min: " + s1.min());

		s1.sort();
		System.out.println("After sorting:");
		s1.printStack();

		s1.removeDuplicates();
		System.out.println("After removing duplicates:");
		s1.printStack();

		s1.reverse();
		System.out.println("After reversing:");
		s1.printStack();

        s1.randomize();
        System.out.println("After randomize:");
        s1.printStack();
		
		s1.swapData(10, 40);
		System.out.println("After swapping 10 and 40:");
		s1.printStack();

		s1.swapIndex(0, 1);
		System.out.println("After swapping index 0 and 1:");
		s1.printStack();

		int[] arr = s1.toArray();
		System.out.println("Converted to array:");
		for (int val : arr) System.out.print(val + " ");
		System.out.println();

		Stack s2 = s1.toStack(new int[] {1, 2, 3});
		System.out.println("s2 stack:");
		s2.printStack();

		Stack clone = s1.clone(s1);
		System.out.println("Clone of s1:");
		clone.printStack();

		System.out.println("s1 equals s2? " + s1.equals(s2));
		System.out.println("s1 equals clone? " + s1.equals(clone));

		Stack concatStack = s1.concat(s2);
		System.out.println("Concatenated stack:");
		concatStack.printStack();

		System.out.println("Is s1 empty? " + s1.isEmpty());

		s1.clear();
		System.out.println("After clear, is s1 empty? " + s1.isEmpty());
	}
}
