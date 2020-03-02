package Day3;

public class Department {
	private String name;
	private Employee[] e;
	public Department(String name, Employee[] e) {
		this.name=name;
		this.e=e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee[] getE() {
		return e;
	}
	public void setE(Employee[] e) {
		this.e = e;
	}

	

}
