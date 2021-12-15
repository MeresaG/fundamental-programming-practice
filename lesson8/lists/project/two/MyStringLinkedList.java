package lesson8.lists.project.two;

public class MyStringLinkedList {
	
	Node header, tail;

	MyStringLinkedList() {
		header = null;
		tail = null;
	}
	
	void insert(String data, int pos) {
		
		Node newNode = new Node(null, null, data);
		
		if(pos < 0) {
			return;
		}
		
		else if(pos == 0) {
			
			newNode.next = header;
			header.previous = newNode;
			header = newNode;
			
		}
		
		else {
			
			Node temp = new Node(null, null, null);
			temp = header;
			
			for(int i = 1; i< pos -1; i++) {
				
				if(temp != null) {
					temp = temp.next;
				}
				
			}
			
			if(temp != null) {
				
				newNode.next = temp.next;
				newNode.previous = temp;
				temp.next = newNode;
				
				if(newNode.next != null)
					newNode.next.previous = newNode;
				
			}
			
		}
		
		
	}
	
	void add(String data) {
		
		Node newNode = new Node(null, null, data);
		
		if(header == null) {
			
			header = tail = newNode;
			
		}
		
		else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
		
	}
	
	boolean remove(String data) {
		
		if(data == null) return false;
		
		if(header.value.equals(data)) {
			
			header = header.next;
			header.previous = null;
			
			return true;
			
		}
		
		Node temp = header;
		
		while(temp != null) {
			
			if(data.equals(temp.value)) {
				
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				return true;
			
			}
			temp = temp.next;
			
			
		}
		
		return false;
		
	}
	
	void sort() {
		
		if (header.next == null)
			return;
		
		Node temp = header;

		while(temp.next != null) {

			Node nextMinNode = minNode(temp);
			swap(temp, nextMinNode);
			temp = temp.next;
		}
		
	}
	
	public void swap(Node n1, Node n2){
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
		
	}
	
	
	public Node minNode(Node n){		
		
		Node m = n;
		
		for(Node index = n.next; index != null; index = index.next){
		
			if(index.value.compareTo(m.value) < 1){ 
				
				m = index;
			
			}
		}
		return m;
	}
	
	
	
	// print all the nodes of doubly linked list
	public void printNodes() {
		// Node current will point to head
		Node current = header;
		if (header == null) {
			System.out.println("Doubly linked list is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while (current != null) {
			// Print each node and then go to next.
			System.out.print(current.value + " ");
			current = current.next;
		}
	}

	
	public static void main(String[] args) {
		
		MyStringLinkedList l = new MyStringLinkedList();
		
		String[] input = {"big", "small", "tall", "short", "round", "square",
						"enormous", "tiny","gargantuan", "lilliputian",
						"numberless", "none", "vast", "miniscule"};
		
		for(String t : input) {
			l.add(t);
		}
		
		l.insert("Meresa", 3);
		l.insert("Mei Li", 0);
		l.insert("Berihu", 13);
		System.out.println(l.remove("Meresa"));
		System.out.println(l.remove("Mei Li"));
		System.out.println(l.remove("Berihu"));
		l.sort();
		l.printNodes();

		
	}

	class Node {
		
		String value;
		Node next;
		Node previous;

		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
	}
}