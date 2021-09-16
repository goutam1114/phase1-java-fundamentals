package thread;

public class ThreadWithLamdaExpression {

	public static void main(String[] args) {
		Thread T1=new Thread(() -> {
			System.out.println("Thread is running");
			
		});
		T1.start();
	}

}
