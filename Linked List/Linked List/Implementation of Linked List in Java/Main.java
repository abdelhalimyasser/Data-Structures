import mypackage.LinkedList;

public class Main
{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		System.out.println("====== Adding Elements ======");
		list.add(10);
		list.add(20);
		list.add(30);
		list.addFirst(5);          
		list.addIndex(15, 2); 
		list.printList();

		System.out.println("\n====== Count Elements ======");
		System.out.println("Count: " + list.countList());

		System.out.println("\n====== Delete Elements ======");
		list.deleteFirst();
		list.delete();
		list.deleteIndex(1);
		list.printList();

		System.out.println("\n====== Check isFound ======");
		System.out.println("Found 20? " + list.isFound(20));
		System.out.println("Found 99? " + list.isFound(99));

		System.out.println("\n====== Get Index/Element ======");
		System.out.println("Index of 20: " + list.getIndex(20));
		System.out.println("Element at index 0: " + list.getElement(0));

		System.out.println("\n====== Max & Min ======");
		System.out.println("Max: " + list.maxList());
		System.out.println("Min: " + list.minList());

		System.out.println("\n====== Sum & Average ======");
		System.out.println("Sum: " + list.sumNums());
		System.out.println("Avg: " + list.averageNums());

		System.out.println("\n====== Sorting ======");
		list.add(3);
		list.add(7);
		list.sort();
		list.printList();

		System.out.println("\n====== Reversing ======");
		list.reverse();
		list.printList();

		System.out.println("\n====== Removing Duplicates ======");
		list.add(7);
		list.add(7);
		list.add(3);
		list.removeDuplicates();
		list.printList();

		System.out.println("\n====== Swapping 7 and 20 ======");
		list.swap(7, 20);
		list.printList();

		System.out.println("\n====== Cloning & Equality ======");
		linkedList clone = list.clone();
		System.out.println("Lists equal? " + list.equals(clone));

		System.out.println("\n====== To Array / From Array ======");
		int[] arr = list.toArray();
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();

		linkedList listFromArray = list.fromArray(new int[] {100, 200, 300});
		System.out.println("List from array:");
		listFromArray.printList();

		System.out.println("\n====== Concatenating Lists ======");
		list.concat(listFromArray);
		list.printList();

		System.out.println("\n====== Delete Data (20) ======");
		list.deleteData(20);
		list.printList();

		System.out.println("\n====== Deleting Entire List ======");
		list.deleteList();
		list.printList();
	}
}
