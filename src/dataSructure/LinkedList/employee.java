package dataSructure.LinkedList;

public class employee {
	public int id;
	public String name;
	public double salary;
	public employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public employee() {
		super();
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
