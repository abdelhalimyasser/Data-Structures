package mypackage;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		// The Tree Shape
		//        1
		//      /  \
		//     2    3
		//    /\    /\
		//   4 5   6 7

		// Create a Tree
		Tree tree = new Tree();

		// Create the Nodes
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);


		// Test PreOrder traversal
		System.out.println("PreOrder Traversal:");
		tree.printPreOrder(root);
		System.out.println();

		// Test InOrder traversal
		System.out.println("InOrder Traversal:");
		tree.printInOrder(root);
		System.out.println();

		// Test PostOrder traversal
		System.out.println("PostOrder Traversal:");
		tree.printPostOrder(root);
		System.out.println();

		// Test LevelOrder traversal
		System.out.println("LevelOrder Traversal:");
		tree.printLevelOrder(root);
		System.out.println();

		// Test height
		System.out.println("Height of the tree: " + tree.height(root));

		// Test size
		System.out.println("Size of the tree: " + tree.size(root));

		// Test leaf count
		System.out.println("Number of leaf nodes: " + tree.countLeaves(root));

		// Test search
		int searchValue = 4;
		System.out.println("Is " + searchValue + " found? " + tree.search(root, searchValue));
	}
}
