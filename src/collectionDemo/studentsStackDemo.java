package collectionDemo;

public class studentsStackDemo {


	//properties
	public int id;
	public String name;
	public int rank;
	public String college;

	//constructor
	public studentsStackDemo(int id, String name, int rank, String college) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.college = college;
	}

	public studentsStackDemo() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", college=" + college + "]";
	}

	

}
