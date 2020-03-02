package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	static void show(List l)
	{
		l.add("vrb");
		l.add(new Float(90.89));
		System.out.println(l);
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(12);
		show(al);
		
	}
}
