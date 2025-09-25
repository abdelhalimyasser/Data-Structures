package mypackage;

public class Main {
	public static void main(String[] args) {
		BST bst = new BST();
		Node root = null;

		// Test inserting nodes: 10, 5, 15, 3, 7
		root = bst.insert(root, 10);
		root = bst.insert(root, 5);
		root = bst.insert(root, 15);
		root = bst.insert(root, 3);
		root = bst.insert(root, 7);
		root = bst.insert(root, 7); // To check how it will deal with duplicates
		
		System.out.print("BST Preorder: ");
		bst.printPreOrder(root);
		System.out.println();

		// Test searching
		System.out.println("\n=== Search Tests ===");
		System.out.println("BST Search 7: " + bst.search(root, 7)); 
		System.out.println("BST Search 8: " + bst.search(root, 8));
		System.out.println();

		// Test deletions
		System.out.println("=== Deleting 3 ===");
		root = bst.delete(root, 3);
		System.out.print("BST Preorder after deleting 3: ");
		bst.printPreOrder(root);
		System.out.println();

		System.out.println("=== Deleting 5 ===");
		root = bst.delete(root, 5);
		System.out.print("BST Preorder after deleting 5: ");
		bst.printPreOrder(root); 
		System.out.println();

		System.out.println("=== Deleting 10 ===");
		root = bst.delete(root, 10);
		System.out.print("BST Preorder after deleting 10: ");
		bst.printPreOrder(root); 
		System.out.println();

		System.out.println("=== Deleting 8 ===");
		root = bst.delete(root, 8);
		System.out.print("BST Preorder after deleting 8 (not found): ");
		bst.printPreOrder(root); 
		System.out.println();
	}
}
