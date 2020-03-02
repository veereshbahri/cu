package dedlock;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable {

	List<Integer> list=new ArrayList<Integer>();
	int i=1;

	public Consumer(List<Integer> list) {
		this.list = list;
	}

	void consume() 
	{
		if(list.size()==0)
		{
			 {
				
				try {
					synchronized (list) {
						list.wait();}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		else {
			Integer a=list.remove(0);
			System.out.println("item consumed  "+a);
			synchronized (list) {
				list.notify();
			}
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			while(true) {
				consume();}
		
	}
}
