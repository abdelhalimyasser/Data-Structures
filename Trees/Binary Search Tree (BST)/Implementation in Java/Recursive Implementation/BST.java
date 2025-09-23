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

	// Traversals Functions
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

	// Statistical Functions
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
		return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;  // +1 is for the root
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

	// max Function to find the maximum value in the tree.
	public int max(Node node) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return 0;

		int maxVal = node.data;
		if(node.left != null) {
			int leftMax = max(node.left);
			maxVal = (leftMax > maxVal) ? leftMax : maxVal;
		}

		if(node.right != null) {
			int rightMax = max(node.right);
			maxVal = (rightMax > maxVal) ? rightMax : maxVal;
		}

		return maxVal;
	}

// min Function to find the minimum value in the tree
	public int min(Node node) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return 0;

		int minVal = node.data;
		if(node.left != null) {
			int leftMin = min(node.left);
			minVal = (leftMin < minVal) ? leftMin : minVal;
		}

		if (node.right != null) {
			int rightMin = min(node.right);
			minVal = (rightMin < minVal) ? rightMin : minVal;
		}

		return minVal;
	}

// sum Function to compute the sum of all node values
	public int sum(Node node) {
		// Condition to check if the Tree Node is empty or not
		if (node == null)
			return 0;

		return node.data + sum(node.left) + sum(node.right);
	}
}
