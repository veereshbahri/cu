package dedlock;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		Thread pr=new Thread(new Producer(list));
		Thread co=new Thread(new Consumer(list));
		pr.start();
		co.start();
	}

}
