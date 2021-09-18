package Serialization;

import java.io.Serializable;

public class employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public String name;
	public double salary;
	public String password;
	public employee(int id, String name, double salary, String password) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.password = password;
	}
	public employee() {
		super();
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + ", password=" + password + "]";
	}
	
	
	

}
