package thread;


class Counter
{
	int count=0;
	public synchronized void increment(){
		count++;
	}
	public void decrement(){
		count--;
	}
}

public class ThreadSafeDemo {

	public static void main(String[] args) {
		Counter  c=new Counter();
         Thread T1=new Thread(()->{
        	 for(int i=0;i<1000;i++)
        	 {
        		 c.increment();
        	 }
         });
         
         Thread T2=new Thread(()->{
        	 for(int i=0;i<1000;i++)
        	 {
        		 c.increment();
        	 }
         });
         T1.start();
         T2.start();
         try {
			T1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
         try {
			T2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println(c.count);
	}
	
	

}
