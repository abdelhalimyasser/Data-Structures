import mypackage;

public class Node {       //define the node
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}


public class LinkedList {
	Node head;

	public void addFirst(int data) {                      // add the object in the first index
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void add(int data) {                 // add the object in the last index
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
			return;
		}

		Node temp = head;

		while(temp.next != null)
			temp = temp.next;

		temp.next = newNode;
	}

	public void addIndex(int data, int index) {         // add the object in specific index
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
			return;
		}

		if (index == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}

		Node temp = head;

		for(int i = 0; i < index -1 && temp.next != null; i++)
			temp = temp.next;

		newNode.next = temp.next;
		temp.next = newNode;
	}

	public int deleteFirst() {                  // delete the first object
		if(head == null) {
			System.out.println("The list is empty.");
			return -1;
		}

		int element = head.data;
		head = head.next;
		return element;
	}

	public int delete() {               // delete the last object
		if(head == null) {
			System.out.println("The list is empty.");
			return -1;
		}

		if (head.next == null) {
			int element = head.data;
			head = null;
			return element;
		}

		Node temp = head;

		while(temp.next.next != null)
			temp = temp.next;

		int element = temp.next.data;
		temp.next = null;

		return element;
	}

	public int deleteIndex(int index) {           // delete object in specific index
		if(head == null) {
			System.out.println("The list is empty.");
			return -1;
		}

		if(index == 0) {
			int element = head.data;
			head = head.next;
			return element;
		}

		Node temp = head;

		for(int i = 0; i < index - 1 && temp.next.next != null; i++)
			temp = temp.next;

		if (temp.next == null) {
			System.out.println("Index out of bounds.");
			return -1;
		}

		int element = temp.next.data;
		temp.next = temp.next.next;

		return element;
	}

	public int deleteData(int data) {            // delete specific object
		if (head == null) {
			System.out.println("List is empty.");
			return -1;
		}

		if (head.data == data) {
			int element = head.data;
			head = head.next;
			return element;
		}

		Node temp = head;

		while(temp.next != null && temp.next.data != data)
			temp = temp.next;

		if (temp.next == null) {
			System.out.println("Data not found.");
			return -1;
		}

		int element = temp.next.data;
		temp.next = temp.next.next;
		return element;
	}

	public void deleteList() {  // delete all the list
		head = null;
	}

	public void removeDuplicates() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node current = head;

		while(current != null) {
			Node temp = current;
			while(temp.next != null) {
				if(temp.next.data == current.data)
					temp.next = temp.next.next;
				else
					temp = temp.next;
			}
			current = current.next;
		}
	}

	public void printList() {              // print all the list
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node temp = head;

		int i = 0;
		while(temp != null) {
			System.out.println((i++) + "->" + temp.data);
			temp = temp.next;
		}
	}

	public int countList() {            // count all the list element
		if (head == null) {
			System.out.println("List is empty.");
			return -1;
		}

		Node temp = head;

		int i = 0;
		while(temp != null) {
			i++;
			temp = temp.next;
		}

		return i;
	}

	public int getIndex(int data) {        // get the index of specific data
		if (head == null) {
			System.out.println("List is empty.");
			return -1;
		}

		Node temp = head;
		int i = 0;
		while (temp != null) {
			if (temp.data == data)
				return i;
			i++;
			temp = temp.next;
		}
		System.out.println("Data not found.");
		return -1;
	}

	public int getElement(int index) {            // get the element in specific index
		if (head == null) {
			System.out.println("List is empty.");
			return -1;
		}

		Node temp = head;

		for(int i = 0; i < index  && temp != null; i++)
			temp = temp.next;

		if (temp == null) {
			System.out.println("Index out of bounds.");
			return -1;
		}

		return temp.data;
	}

	public int maxList() {                // get the maximum num in the list
		if (head == null) {
			System.out.println("List is empty.");
			return -1;
		}

		int max = head.data;

		Node temp = head.next;

		while(temp != null) {
			if(max < temp.data)
				max = temp.data;
			temp = temp.next;
		}

		return max;
	}

	public int minList() {          // get the minimum num in the list
		if (head == null) {
			System.out.println("List is empty.");
			return -1;
		}

		int min = head.data;

		Node temp = head.next;

		while(temp != null) {
			if(min > temp.data)
				min = temp.data;
			temp = temp.next;
		}

		return min;
	}

	public boolean isFound(int data) {     // boolean to check th element is found or not
		if (head == null) {
			System.out.println("List is empty.");
			return false;
		}

		Node temp = head;

		while(temp != null) {
			if(temp.data == data)
				return true;
			temp = temp.next;
		}

		return false;
	}

	public int sumNums() {          // get the total sum of the list
		if (head == null) {
			System.out.println("List is empty.");
			return -1;
		}

		int sum = 0;
		Node temp = head;

		while(temp != null) {
			sum += temp.data;
			temp = temp.next;
		}

		return sum;
	}

	public double averageNums() {     // get the average of the list
		if (head == null) {
			System.out.println("List is empty.");
			return -1;
		}

		//return (double) sumNums() / countList();    //the easiest way and cancel the code below as they are the same logic

		int sum = 0;
		int count = 0;

		Node temp = head;

		while(temp != null) {
			sum += temp.data;
			count ++;
			temp = temp.next;
		}

		return (double) sum / count;
	}

	public void reverse() {        // reverse the list
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node prev = null;
		Node current = head;
		Node next = null;

		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
	}

	public void sort() {             // sort the list
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		boolean swapped;

		do {
			swapped = false;
			Node temp = head;

			while(temp.next != null) {
				if(temp.data > temp.next.data) {
					int tempNum = temp.next.data;
					temp.next.data = temp.data;
					temp.data = tempNum;
					swapped = true;
				}
				temp = temp.next;
			}
		} while(swapped);
	}

	public void swap(int data1, int data2) {          // swap the second element with the first one
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		if(data1 == data2)
			return;

		Node temp = head;
		Node node1 = null;
		Node node2 = null;

		while(temp != null && (node1 == null || node2 == null)) {
			if(temp.data == data1)
				node1 = temp;
			else if(temp.data == data2)
				node2 = temp;
			temp = temp.next;
		}

		if(node1 != null && node2 != null) {
			int tmp = node1.data;
			node1.data = node2.data;
			node2.data = tmp;
			return;
		}
		else {
			System.out.println("One of the elements not found.");
			return;
		}

	}

	public linkedList clone() {           // return copy of the list
		if (head == null) {
			System.out.println("List is empty.");
			return null;
		}

		linkedList copy = new linkedList();
		Node temp = head;

		while(temp != null) {
			copy.add(temp.data);
			temp = temp.next;
		}

		return copy;
	}

	public void concat(linkedList list) {            //concatenate the second list into the first list
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node temp = list.head;

		while(temp != null) {
			this.add(temp.data);
			temp = temp.next;
		}
	}

	public boolean equals(linkedList list) {         //check if the two lists are equal or not
		if (head == null) {
			System.out.println("List is empty.");
			return false;
		}

		Node temp1 = head;
		Node temp2 = list.head;

		if(this.countList() == list.countList()) {
			while(temp1 != null && temp2 != null) {
				if(temp1.data != temp2.data)
					return false;

				temp1 = temp1.next;
				temp2 = temp2.next;
			}

			return true;
		}

		return false;
	}

	public int[] toArray() {             // return list into the form of array
		if (head == null) {
			System.out.println("List is empty.");
			return null;
		}

		Node temp = head;
		int[] array = new int[this.countList()];
		int i = 0;

		while(temp.next != null) {
			array[i++] = temp.data;
			temp = temp.next;
		}

		return array;
	}

	public linkedList fromArray(int[] array) {        // return new list from an array
		linkedList newList = new linkedList();

		for(int obj : array)
			newList.add(obj);

		return newList;
	}
}
