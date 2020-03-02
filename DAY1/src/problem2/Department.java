package problem2;

public class Department extends Employee {
	private String dname;

	public String getDname() {
		return dname;
	}

	public Department(String name, int age, String gender, long salary, Address address, int year, String dname) {
		super(name, age, gender, salary, address, year);
		this.dname = dname;
	}


	
	

}
