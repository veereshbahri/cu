package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 List<Item> list=new ArrayList<Item>();
		 for(int i=0;i<list.size();i++)
		 {
			 System.out.println(list.get(i-1));
		 }
		 
		 System.out.println("enter item you want");
		 int i=sc.nextInt();
		 switch (i) {
		case 1:
			
			break;

		default:
			break;
		}
	}
}
