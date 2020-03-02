package Dayy;



public class Employee {
	private String name;
	private int year;
	private double sal;
	private String address;
	private Department dept;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employee(String name, int year, double sal, Department dept)
	{
		this(name,year,sal," ",dept);
	}
	public Employee(String name, int year, double sal,String address,Department dept)
	{
		this.address=address;
		this.name=name;
		this.sal=sal;
		this.year=year;
		this.dept=dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", year=" + year + ", sal=" + sal + ", address=" + address + ", dept=" + dept
				+ "]";
	}

	
}
