package lesson10.bst.project.three.sortroutines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 * This implementation of a BST makes the following assumptions: 1) Data stored
 * in nodes are of type Integer 2) No duplicate values are inserted.
 */
public class MyBST {
	private Node root;
	
	private static int[] sortedArray;
	private int length;
	private static int counter;
	

	// start with an empty tree
	public MyBST() {
		root = null;
	}

	
	public void insertAll(int[] array) {
	
		length = array.length;
		for(int i = 0; i < array.length; i++) {
			insert(array[i]);
		}
		
	}
	
	public int[] readIntoArray() {
		
		sortedArray = new int[length];
		traverseTree();
		
		return sortedArray;
		
	}
	
	
	private void traverseTree() {
		
		if (root == null)
			return;
		else {
			counter = 0;
			traverseTree(root);
		}
			
		
	}

	private void traverseTree(Node t) {
		if (t != null) {
			traverseTree(t.left);
			MyBST.sortedArray[counter] = t.data;
			counter++;
			traverseTree(t.right);
		
		}
		
		
	}
	
	public boolean find(Integer x) {
		if (x == null)
			return false;
		return find(x, root);
	}

	// return true if x in the substree starting with root n
	private boolean find(Integer x, Node n) {
		if (n == null)
			return false;
		if (n.data.equals(x))
			return true;
		return (x.compareTo(n.data) < 0) ? find(x, n.left) : find(x, n.right);
	}

	private Node findNode(Integer val, Node n) {
		if (n == null)
			return null;
		if (n != null && n.data.equals(val))
			return n;
		if (val.compareTo(n.data) < 0) {
			return findNode(val, n.left);
		} else {
			return findNode(val, n.right);
		}
	}

	public boolean remove(Integer val) {
		Node node = findNode(val, root);
		return removeNode(node);
	}

	public void insert(Integer x) {
		if (root == null) {
			root = new Node(x, null, null);
		} else {
			Node n = root; // currentNode
			boolean inserted = false;
			while (!inserted) {
				if (x.compareTo(n.data) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new Node(x, null, null);
						inserted = true;
					} else {
						n = n.left;
					}
				} else if (x.compareTo(n.data) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new Node(x, null, null);
						inserted = true;
					} else {
						n = n.right;
					}
				} else { // duplicate value
					throw new IllegalArgumentException("Duplicate value passed in!");
				}
			}
		}
	}

	public Integer findMin() {
		return findMin(root);
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(Node t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.data + " ");
			printTree(t.right);
		}
	}

	public void printAsDiagram() {
		BTreePrinter printer = new BTreePrinter();
		printer.printNode(root);
	}

	public List asList() {
		return asList(new LinkedList(), root);
	}

	private List asList(List theList, Node t) {
		if (theList == null)
			return theList;
		if (t == null)
			return theList;
		if (t != null) {
			asList(theList, t.left);
			theList.add(t.data);
			asList(theList, t.right);
		}
		return theList;
	}

	private boolean removeNode(Node node) {
		if (node == null)
			return false;
		// in this case, we can just break the link
		// from node to its parent
		if (node.left == null && node.right == null) {
			Node parent = parent(node);
			if (parent != null) {
				if (parent.left == node)
					parent.left = null;
				if (parent.right == node)
					parent.right = null;
			}
			node = null;
			return true;
		}
		// in these cases, add a link from parent to
		// child of node
		if (node.left != null && node.right == null) {
			Node parent = parent(node);
			if (parent.left == node)
				parent.left = node.left;
			if (parent.right == node)
				parent.right = node.left;
			node = null;
			return true;
		}
		if (node.left == null && node.right != null) {
			Node parent = parent(node);
			if (parent.left == node)
				parent.left = node.right;
			if (parent.right == node)
				parent.right = node.right;
			node = null;
			return true;
		}

		// in this case, find min to the right of node and
		// insert this value into the node; link up parent of this min with right child
		// of this min
		if (node.left != null && node.right != null) {
			Node min = findMinNode(node.right);
			Node parentOfMin = parent(min);
			node.data = min.data;
			parentOfMin.right = min.right;
			return true;
		}
		return false;
	}

	private Node parent(Node t) {
		return parent(t, root, null);
	}

	private Node parent(Node t, Node n, Node parent) {

		if (n == null)
			return null;
		Integer val = t.data;
		if (n.data.equals(val))
			return parent;
		if (val.compareTo(n.data) < 0) {
			return parent(t, n.left, n);
		} else {
			return parent(t, n.right, n);
		}
	}

	private Node findNode(Integer val) {
		return findNode(val, root);
	}

	private Integer findMin(Node t) {
		Node s = findMinNode(t);
		return s.data;
	}

	private Node findMinNode(Node t) {
		if (t == null)
			return null;
		while (t.left != null) {
			t = t.left;
		}
		return t;
	}

	public static void main(String[] args) {
		MyBST bst = new MyBST();
		/*bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.insert(12);
		bst.insert(26);
		bst.insert(13);
		System.out.println(bst.asList());
		bst.printTree();
		System.out.println("\n-----print as a tree structure----");
		bst.printAsDiagram();

		System.out.println("\n-----remove 26----");
		bst.remove(26);
		bst.printTree();
		System.out.println("\n-----print as a tree structure----");
		bst.printAsDiagram();*/
		bst.insertAll(new int[]{9,1, 5, 3,11, 7,6});
		bst.readIntoArray();

	}

}
