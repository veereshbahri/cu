package multithreading;

import java.util.Scanner;

public class Shopping implements Runnable{

	static int qty=40;
	Scanner sc=new Scanner(System.in);
	public void placeOrder(int q) throws Exception
	{
		synchronized (this) {
			
		
		if(qty<q)
		{
			throw new Exception();
		}
		else {
			 {
				Thread.sleep(1000);
				qty-=q;
			
			System.out.println("got" + q);}
	
		}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("enter quantity for " +Thread.currentThread().getName());
		int q=sc.nextInt();
		try {
			placeOrder(q);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
