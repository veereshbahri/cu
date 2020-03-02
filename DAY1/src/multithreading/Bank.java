package multithreading;

public class Bank implements Runnable {
	static int count=0;
	public void run() {
		for(int i=0;i<100;i++)
		{
			count++;
		}
		//System.out.println(Thread.currentThread().getName()+"   "+count);
	}
} 


