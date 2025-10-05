package mypackage.MinHeap;

public class Main
{
	public static void main(String[] args) {
		MinHeap minHeap = new MinHeap(100);

		// Insert elements
		minHeap.insert(10);
		minHeap.insert(5);
		minHeap.insert(20);
		minHeap.insert(2);
		minHeap.insert(15);

		System.out.println("Min-Heap after insertions:");
		minHeap.printHeap();

		System.out.println("Minimum: " + minHeap.getMin());
		System.out.println("Maximum: " + minHeap.getMax());

		System.out.println("Extracted Min: " + minHeap.extractMin());
		System.out.println("Min-Heap after extracting min:");
		minHeap.printHeap();

		System.out.println("Extracted Max: " + minHeap.extractMax());
		System.out.println("Min-Heap after extracting max:");
		minHeap.printHeap();
	}
}
