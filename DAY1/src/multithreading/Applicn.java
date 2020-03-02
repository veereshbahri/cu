package multithreading;

public class Applicn {
	public static void main(String[] args) throws InterruptedException {
		Bank b1=new Bank();
		Bank b2=new Bank();
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b2);
		
		t1.start();
		t2.start();
		t1.join();
		//t2.join();
		System.out.println(Bank.count);
	}

}
