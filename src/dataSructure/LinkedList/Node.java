package dataSructure.LinkedList;

public class Node {
	private employee data;
	private Node next;
	 public Node(employee data)
	 {
		 this.data=data;
	 }
	@Override
	public String toString() {
		return "Node [data=" + data + ", node=" + next + "]";
	}
	public employee getData() {
		return data;
	}
	public void setData(employee data) {
		this.data = data;
	}
	public Node getnext() {
		return next;
	}
	public void setnext(Node next) {
		this.next = next;
	}

}
