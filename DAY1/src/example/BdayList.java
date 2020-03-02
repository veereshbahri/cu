package example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;



public class BdayList {
	public void display(ArrayList list)
	{
		Collections.sort(list);
		Iterator it= list.iterator();
		System.out.println("SORTED ARRAYLIST-");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
	
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 if wanna add");
		int choice=sc.nextInt();
		while(choice==1) {
		System.out.println("enter name");
		String s=sc.next();
		if(s.isEmpty())
		{
			break;
		}
		else {
			list.add(s);
			
		}
		System.out.println("wanna continue? press 1");
		choice=sc.nextInt();
		}
		
		
		BdayList b=new BdayList();
		b.display(list);
	}

}
