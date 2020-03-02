package problem2;

public class Employee {

	private String name;
	private int age;
	private String gender;
	private long salary;
	private Address address;
	private int year;
	public Employee(String name, int age, String gender, long salary, Address address, int year) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public long getSalary() {
		return salary;
	}
	public Address getAddress() {
		return address;
	}
	public int getYear() {
		return year;
	}
	
}
