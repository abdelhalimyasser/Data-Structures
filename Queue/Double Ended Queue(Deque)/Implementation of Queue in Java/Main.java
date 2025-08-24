package mypackage;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		Deque deque = new Deque(5);

		deque.insertRear(10);
		deque.insertRear(20);
		deque.insertFront(30);
		deque.insertFront(40);

		deque.printDeque();  
		System.out.println("Size: " + deque.getSize());  
		System.out.println("Is empty? " + deque.isEmpty()); 
		System.out.println("Is full? " + deque.isFull());  
		System.out.println("Delete front: " + deque.deleteFront());
		System.out.println("Delete rear: " + deque.deleteRear());  
		deque.printDeque();  
		System.out.println("Size: " + deque.getSize());  
		deque.clear();
		System.out.println("Is empty? " + deque.isEmpty());  

		deque.insertRear(10);
		deque.insertRear(20);
		deque.insertRear(10);

		deque.printDeque();  
		System.out.println("Front: " + deque.getFront());     
		System.out.println("Rear: " + deque.getRear());       
		System.out.println("Middle: " + deque.getMiddle());   
		System.out.println("Is 20 found? " + deque.isFound(20));  
		System.out.println("Is 50 found? " + deque.isFound(50));  
		System.out.println("Index of 20: " + deque.getIndex(20)); 
		System.out.println("Element at index 1: " + deque.getElement(1)); 
		System.out.println("Sum: " + deque.sum());             
		System.out.println("Average: " + deque.average());     
		System.out.println("Repeated 10: " + deque.repeated(10)); 
		System.out.println("Max: " + deque.max());           
		System.out.println("Min: " + deque.min());             
        
        System.out.println("Removing Duplictaes");
		deque.removeDuplicates();
		deque.printDeque();  

        System.out.println("Reversing");
		deque.reverse();
		deque.printDeque();  

        System.out.println("Sorting");
		deque.sort();
		deque.printDeque();  

        System.out.println("Swapping(10, 20)");
		deque.swapData(10, 20);
		deque.printDeque();  

        System.out.println("SwappingIndex(0, 1)");
		deque.swapIndex(0, 1);
		deque.printDeque();  

		deque.randomize();
		System.out.println("After randomize:");
		deque.printDeque();  

		Deque deque2 = deque.clone();
		System.out.println("Cloned deque:");
		deque2.printDeque();  

		System.out.println("Are deques equal? " + deque.equals(deque2)); 
		Deque deque3 = new Deque(5);
		deque3.insertRear(30);
		System.out.println("Are deques equal? " + deque.equals(deque3)); 

		Deque concatDeque = deque.concat(deque3);
		System.out.println("Concatenated deque:");
		concatDeque.printDeque(); 

		int[] arr = deque.toArray();
		System.out.println("Array: " + java.util.Arrays.toString(arr)); 

		Deque newDeque = deque.toDeque(new int[] {50, 60});
		System.out.println("Converted deque:");
		newDeque.printDeque(); 

		Deque emptyDeque = new Deque(3);
		emptyDeque.printDeque();  
		emptyDeque.deleteFront(); 
	}
}
