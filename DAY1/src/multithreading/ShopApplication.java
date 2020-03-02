package multithreading;

public class ShopApplication {
	public static void main(String[] args) throws InterruptedException {
		Shopping s1=new Shopping();
		Shopping s2=new Shopping();
		
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		t2.start();
		//t1.join();
		//t2.join();
	}
}
