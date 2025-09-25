package mypackage;
import java.util.*;

// Binary Search Tree class to create the tree
class BST {
	// Insert Function to insert elements in the tree
	public Node insert(Node node, int element) {
		if (node == null)             // if the tree node is empty
			return new Node(element);
		else if (element < node.data)  // else if the element is less than the tree root
			node.left = insert(node.left, element);
		else if (element > node.data)   // else if the the element is more than the tree root
			node.right = insert(node.right, element);
		return node;
	}

	// Delete Function to delete element in the tree
	public Node delete(Node node, int element) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return null;
		if (element < node.data)  // Delete the left as it is less than the tree root
			node.left = delete(node.left, element);
		else if (element > node.data) // Delete the right as it is more than the tree root
			node.right = delete(node.right, element);
		else {        // The node which have the wanted element
			// Case 1: 0 or 1 child
			if (node.left == null)
				return node.right;
			else if (node.right == null)
				return node.left;

			// Case 2: 2 children
			Node succParent = node;
			Node succ = node.right;
			while (succ.left != null) {
				succParent = succ;
				succ = succ.left;
			}
			// Copy minimum value to the node to delete it
			node.data = succ.data;
			// Delete the successor
			if (succParent == node)
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
		// Check if the element is the root or not
		if (node.data == element)
			return true;
		// Check if the element is less that the root then check the left path
		if (element < node.data)
			return search(node.left, element);
		// Then if it not one of the other Conditions then check the right path
		return search(node.right, element);
	}

	// Traversals Function
	// printPreOrder Function to print preorder traversal (root -> left -> right)
	public void printPreOrder(Node node) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return;

		// Accessing the root first
		System.out.print(node.data + " ");
		// Accessing the lest
		printPreOrder(node.left);
		// Accessing the right
		printPreOrder(node.right);
	}
}

