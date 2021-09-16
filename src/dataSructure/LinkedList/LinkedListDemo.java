package dataSructure.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		employee e1=new employee(101, null, 0);
		employee e2=new employee(102, null, 0);
		employee e3=new employee(103, null, 0);
		employee e4=new employee(104, null, 0);
		SinglyLInkedList s=new SinglyLInkedList();
		boolean x=s.isEmpty();
		System.out.println(x);
		int y=s.getsize();
		System.out.println(y);
		s.addFirst(e1);
		s.addFirst(e2);
		s.addFirst(e3);
		System.out.println(s.isEmpty());
		System.out.println(s.getsize());
		s.show();
		System.out.println("----------------------------------");
		s.append(e4);
		s.show();
		
		
		
		

	}

}
