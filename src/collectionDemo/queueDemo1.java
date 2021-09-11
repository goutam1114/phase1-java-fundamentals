package collectionDemo;

import java.util.ArrayDeque;
import java.util.Queue;

public class queueDemo1 {

	public static void main(String[] args) {            
		employee e1=new employee(1,"Goutam",33333.33);
		employee e2=new employee(2,"Sannidhi",33333.33);
		employee e3=new employee(3,"Praveen",33333.33);
		employee e4=new employee(4,"Niru",33333.33);
		employee e5=new employee(5,"Dyanu",33333.33);
		Queue<employee>employeeQueue = new ArrayDeque<employee>();
		employeeQueue.add(e1);
		employeeQueue.add(e2);
		employeeQueue.add(e3);
		employeeQueue.add(e4);
		employeeQueue.add(e5);

		for(employee emp : employeeQueue) {
			System.out.println("--------------");
			System.out.println(emp .id);

			System.out.println(emp .name);

			System.out.println(emp .salary);
			
		}
		
		

	}

}
