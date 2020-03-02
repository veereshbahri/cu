package Dayy;

public class EmpData {
	public static void main(String[] args) {
		//System.out.println("Name   year   sal   address");
		Employee e1=new Employee("Robert", 2009, 20000,new Department("IT"));
		//Employee e2=new Employee("sam", 1919, 20000,"it");
		//Employee e3=new Employee("Jont", 2020, 7000.70, " Tokyo","IT");
		System.out.println(e1);
		Manager m=new Manager();
		m.findbonus(e1);
;		//System.out.println(e2);
		//System.out.println(e3);
	}

}
