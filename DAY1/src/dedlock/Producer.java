package dedlock;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {
	List<Integer> list=new ArrayList<Integer>();
	int i=1;

	public Producer(List<Integer> list) {
		this.list = list;
	}

	void produce() 
	{
		if(list.size()==5)
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
			list.add((int)Math.ceil(Math.random()*1000));
			System.out.println("item produced");
			synchronized (list) {
				list.notify();
			}
		}
		
	}

	@Override
	public void run() {
		
			while(true) {
				produce();
			}
	}
}
