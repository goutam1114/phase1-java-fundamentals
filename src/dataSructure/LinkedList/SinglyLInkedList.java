package dataSructure.LinkedList;

public class SinglyLInkedList {
	private int size;
	private Node head;

	public int getsize() {
		return size;
	}

	public boolean isEmpty() {
		return (head == null);

	}

	// add
	public void addFirst(employee data) {
		Node node = new Node(data);
		node.setnext(head);
		head = node;
		size++;

	}

	public Node deleteFirst() {
		if (isEmpty()) {
			return null;
		}

		Node removednode = head;
		head = head.getnext();
		removednode.setnext(null);
		size--;
		return removednode;
	}

	public void show() {
		Node current = head;
		while (current != null) {
			System.out.print(current.getData() + "->");
			current = current.getnext();

		}
	}
	public void append(employee data) {
		Node node=new Node(data);
		if(isEmpty()) {
			head=node;
			node.setnext(null);
			
		}
		else {
			Node current=head;
			Node lastnode = null;
			while(current!=null)
			{
		       lastnode=current;
			current=current.getnext();
			}
			 lastnode.setnext(node);
			 node.setnext(null);
			 size++;
			 
			
			
		}
	}

}
