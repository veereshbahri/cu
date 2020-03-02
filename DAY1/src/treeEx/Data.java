package treeEx;

import java.util.Set;
import java.util.TreeSet;

public class Data implements Comparable {

	public static void main(String[] args) {
		Set set=new TreeSet(new SortName());
		Student s1=new Student("veer", 21);
		Student s2=new Student("heer", 22);
		Student s3=new Student("meer", 23);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set);
		
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
