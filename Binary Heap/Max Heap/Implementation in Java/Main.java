package mypackage.MaxHeap;


public class Main
{
	public static void main(String[] args) {
	    MaxHeap maxHeap = new MaxHeap(100);

        // Insert elements
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(20);
        maxHeap.insert(2);
        maxHeap.insert(15);

        System.out.println("Max-Heap after insertions:");
        maxHeap.printHeap();

        System.out.println("Maximum: " + maxHeap.getMax());
        System.out.println("Minimum: " + maxHeap.getMin());

        System.out.println("Extracted Max: " + maxHeap.extractMax());
        System.out.println("Max-Heap after extracting max:");
        maxHeap.printHeap();

        System.out.println("Extracted Min: " + maxHeap.extractMin());
        System.out.println("Max-Heap after extracting min:");
        maxHeap.printHeap();
	}
}
