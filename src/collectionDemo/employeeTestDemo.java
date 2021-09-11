package collectionDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class employeeTestDemo {

	public static void main(String[] args) {
		employee e1=new employee(1,"Goutam",33333.33);
		employee e2=new employee(2,"Sannidhi",33333.33);
		employee e3=new employee(3,"Praveen",33333.33);
		employee e4=new employee(4,"Niru",33333.33);
		employee e5=new employee(5,"Dyanu",33333.33);
		
		Set<employee> setOfEmployee = new LinkedHashSet<employee>();
		setOfEmployee.add(e1);
		setOfEmployee.add(e2);
		setOfEmployee.add(e3);
		setOfEmployee.add(e4);
		setOfEmployee.add(e5);
		for(employee emp:setOfEmployee)
		{
			System.out.println(emp);
			
		}
		for(employee emp:setOfEmployee)
		{
			System.out.println("------------------");
			System.out.println(emp.id);
			System.out.println(emp.name);
			
			System.out.println(emp.salary);
		}
		


	}

}
