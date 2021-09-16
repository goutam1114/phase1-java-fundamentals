package thread;

public class threadClassDemo {

	public static void main(String[] args) {
		john t1 = new john();
		t1.start();
		james t2 = new james();
		t2.start();
		arya t3 = new arya();
		t3.start();

	}

}

class john extends Thread {
	@Override
	public void run() {
		System.out.println("John is running");
	}

}

class james extends Thread {
	@Override
	public void run() {
		System.out.println("James is running");
	}
}

class arya extends Thread {
	@Override
	public void run() {
		System.out.println("arya is running");
	}
}
