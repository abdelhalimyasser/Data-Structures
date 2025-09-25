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
