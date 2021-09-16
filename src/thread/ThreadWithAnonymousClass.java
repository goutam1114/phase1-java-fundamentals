package thread;

public class ThreadWithAnonymousClass {

	public static void main(String[] args) {
		Runnable obj1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread is running");
			}

		};
		Runnable obj2 = new Runnable() {

			@Override
			public void run() {
				int x = 0;
				System.out.println("Number of Ipl Trophies we won " + x);

			}
		};
		Thread T1 = new Thread(obj1);
		T1.start();
		Thread T2 = new Thread(obj2);
		T2.start();
		Thread T3 = new Thread(new Runnable() {

			@Override
			public void run() {
				int x = 1;
				System.out.println("Number of Ipl Trophies we won " + x);
			}

		});
		T3.start();

	}

}
