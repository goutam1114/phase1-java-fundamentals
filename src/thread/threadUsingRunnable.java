package thread;

public class threadUsingRunnable {

	public static void main(String[] args) {
		gitam g=new gitam();
		Thread t1=new Thread(g);
		t1.start();
		daru d=new daru();
		Thread t2=new Thread(d);
		t2.start();

		
		
		

       
	}

}
class gitam implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread gitam is running");		
	}
	
	
}
class daru implements Runnable{

	@Override
	public void run() {
      System.out.println("Thread daru is running");		
	}
	
}