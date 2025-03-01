package linkedlist;

public class LinkedList
{
	Node head;
	public void add(int data) {
		Node node = new Node();
		node.data = data;
		
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	

	public int get(int index) {
		Node n = head;
		for(int i = 0; i < index; i++) {
			n = n.next;
		}
		return n.data;
	}
	
	public int getFirst() {
		return head.data;
	}
	
	public int getLast() {
		return get(size() - 1);
	}
	
	public int size() {
		Node n = head;
		int size = 0;
		if(head != null) {
		while(n.next != null) {
			size++;
			n = n.next;
		}
		size++;
		}
		return size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void clear() {
		head = null;
	}
	
	public void show() {
		Node n = head;
		while(n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
