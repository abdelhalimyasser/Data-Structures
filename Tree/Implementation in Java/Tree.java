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

// Tree class to make Trees
class Tree {
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

	// printInOrder Function to print inorder traversal (left -> root -> right)
	public void printInOrder(Node node) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return;

		// Accessing the lest first
		printInOrder(node.left);
		// Accessing the root
		System.out.print(node.data + " ");
		// Accessing the right
		printInOrder(node.right);
	}

	// printPostOrder Function to print inorder traversal (left -> right -> root)
	public void printPostOrder(Node node) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return;

		// Accessing the left first
		printPostOrder(node.left);
		// Accessing the right
		printPostOrder(node.right);
		// Accessing the root
		System.out.print(node.data + " ");
	}

	// printLevelOrder Function to print Level-order traversal
	public void printLevelOrder(Node node) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return;
        
        // Create Queue with ArrayDeque behavior to achieve fast & smooth operations for small (e.g. nodes < 10,000)
        Queue<Node> queue = new ArrayDeque<>();
		
		// Create Queue with Linkedlist behavior to achieve dynamic operations for large nodes (e.g. nodes > 5,000)
		// Queue<Node> queue = new LinkedList<>();

		// add the root node to the Queue
		queue.add(node);

		// Loop until the queue is empty
		while (!queue.isEmpty()) {
			// Remove the front node from the queue
			Node current = queue.poll();

			// Print the current node's data
			System.out.print(current.data + " ");

			// If the current node has a left child, add it to the queue
			if (current.left != null)
				queue.add(current.left);

			// If the current node has a right child, add it to the queue
			if (current.right != null)
				queue.add(current.right);
		}
	}

	// height Function to get the height of the Tree
	public int height(Node node) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return 0;

		// Count the left path
		int leftHeight = height(node.left);
		// Count the right path
		int rightHeight = height(node.right);
		// Compare & Get the maximum path
		return Math.max(leftHeight, rightHeight) + 1;  // +1 is for the root
	}

	// size Function to get the size of the Tree
	public int size(Node node) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return 0;

		// Iterating over right and left Nodes
		return size(node.left) + size(node.right) + 1;  // +1 is for the root
	}

	//countLeaves Function counts the number of leaf nodes (nodes with no children)
	public int countLeaves(Node node) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return 0;

		// Condition if the Tree doesn't have any left & right paths
		if(node.left == null && node.right == null)
			return 1;

		// Count the number of the left & right paths
		return countLeaves(node.left) + countLeaves(node.right) + 1;  // +1 is for the root
	}

	// search Function to search for element in the Tree Nodes
	public boolean search(Node node, int element) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return false;

		// Condition if the element is the Root
		if(node.data == element)
			return true;

		// Iterating over right and left Nodes
		return search(node.left, element) || search(node.right, element);
	}
}
