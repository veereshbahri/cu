package problem1;

import java.util.Scanner;

public class UI {
	Scanner sc=new Scanner(System.in);
	String password,email;
	
	public void display()
	{
		System.out.println("Enter Details-\n ");
		
		System.out.println("Enter email");
		email=sc.next();
		System.out.println("Enter password");
		password=sc.next();
		UserBean u=new UserBean(email, password);
		Dao d=new Dao();
		try {
			d.validation(u);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
