package collectionDemo;

import java.util.Stack;

public class studentsTestDemo {

	public static void main(String[] args) {
		Stack<studentsStackDemo> s=new Stack<studentsStackDemo>();
		studentsStackDemo s1=new studentsStackDemo(10001, "Sam Kim", 1, "ABC College");
		studentsStackDemo s2=new studentsStackDemo(10002, "xboi", 3, "ABC College");
		studentsStackDemo s3=new studentsStackDemo(10003, "vatapi", 2, "ABC College");
		s.add(s1);
		s.add(s3);
		s.add(s2);
		/*for(studentsStackDemo st:s)
		{
			System.out.println(st);
		}
		s.pop();
		for(studentsStackDemo st:s)
		{
			System.out.println(st);
		}*/
		
		studentsStackDemo x	=s.peek();
		System.out.println("Top is "+x.id);
		


	}

}
