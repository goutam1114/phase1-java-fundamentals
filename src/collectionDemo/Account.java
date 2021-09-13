package collectionDemo;

public class Account {
	//properties
	public long accNo;
	public String name;
	public double balance;
	public String email;
	
	public Account(long accNo, String name, double balance, String email) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.email = email;
	}

	public Account() {
		super();
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", email=" + email + "]";
	}
	

}
