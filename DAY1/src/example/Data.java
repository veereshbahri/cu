package example;

public class Data {
public static void main(String[] args) {
	

	Employee e1=new Employee("mark", 12);
	Employee e2=new Employee("mark", 21);
	Employee e3=new Employee("mark", 12);
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
}	
}
