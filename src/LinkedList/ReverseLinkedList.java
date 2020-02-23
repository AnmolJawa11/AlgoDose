package LinkedList;


public class ReverseLinkedList {

	public static void main(String[] args) {
	ReverseLinkedList list=new ReverseLinkedList();
	//preparing custom linkedlist
	list.head=new Node(10);
	list.head.next=new Node(12);
	list.head.next.next=new Node(5);
	list.head.next.next.next=new Node(11);
	
	//printing given linkedlist
	list.printList(head);
	
	//reversing list
	head=list.reverse(head);
	
	System.out.println("\n reversed linked list : " );
	list.printList(head);
	}

	
	static Node head;
	
	
	// The node class
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	
	//printing nodes from linked list
	void printList(Node node) {
		while(node!=null) {
			System.out.println(node.data + " ");
			node=node.next;
		}
	}
	
	
	
	// the meat of the program , reversing logic
	Node reverse(Node n) {
		
		Node prev = null;
		Node curr= n;
		Node next = null;
		
		
		while(curr!=null) {
			
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		n=prev;
		return n;
	}
	
}

