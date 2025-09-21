package mypackage;
import java.util.*;

// Node class to create Nodes for the Tree
class Node {
	int data;
	Node left;
	Node right;

	// Node Constractor to asign values
	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

// Binary Search Tree class to create the tree
class BST {
	// insert Function to insert elements in the tree
	public Node insert(Node node, int element) {
		Node temp = new Node(element);   // make temp node to store the new element
		// check if the tree is null or not
		if(node == null)
			return temp;
		// use current to traverse in the tree safely instead of using node
		Node current = node;
		// loop in all the tree
		while(true) {
			// condtion if the element is more than the current one or not
			if(element > current.data) {
				if(current.right == null) {
					current.right = temp;   // make the new element node in the right path to be the right child
					return node;
				}
				current = current.right;  // change the current to be in the right path
			}

			// condtion if the element is less than the current one or not
			else if(element < current.data) {
				if(current.left == null) {
					current.left = temp;    // make the new element node in the left path to be the left child
					return node;
				}
				current = current.left; // change the current to be in the left path
			}

			// if the element already exists exit the loop
			else
				return node;
		}
	}

	// delete Function to delete element in the tree
	public Node delete(Node node, int element) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return null;

		Node prev = null;
		Node current = node;

		// Check if the key is actually present
		while(current != null && current.data != element) {
			prev = current;
			if(current.data > element)
				current = current.left;
			else
				current = current.right;
		}

		// Check if current is empty or not
		if(current == null)
			return node;

		// // Case 1: 0 or 1 child, Check if the node to be deleted has at most one child
		if(current.left == null || current.right == null) {
			Node replacement = (current.left != null) ? current.left : current.right;
			// Check if the node to be deleted is the root
			if(prev == null)
				return replacement;
			// Check if the left child is not exist
			if(prev.left == current)
				prev.left = replacement;
			else
				prev.right = replacement;
		}
		// Case 2: 2 children, Check if the node to be deleted is prev's left or right child and then replace this with newCurr
		else {
			Node succParent = current;
			Node succ = current.right;

			while (succ.left != null) {
				succParent = succ;
				succ = succ.left;
			}
			// Copy successor's data
			current.data = succ.data;
			// Delete successor has at most 1 child: right
			if (succParent == current)
				succParent.right = succ.right;
			else
				succParent.left = succ.right;
		}
		return node;
	}

	// search Function to search about specific element in the tree
	public boolean search(Node node, int element) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return false;
		// use current to traverse in the tree safely instead of using node
		Node current = node;

		// loop in all the tree
		while(current != null) {
			if(current.data == element)       // check if the element is equal to the root
				return true;
			else if(current.data < element) // if the element is more than root then shift to the right path
				current = current.right;
			else                         // else the element is less than root then shift to the left path
				current = current.left;
		}

		return false;     // if not found return false
	}
}
