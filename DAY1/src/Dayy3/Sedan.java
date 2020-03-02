package Dayy3;

public class Sedan extends Car {
	private String name;
	final int bro=12;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sedan [name=" + name + ", getPower()=" + getPower() + ", getFuel()=" + getFuel() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	static public void display1()
	{
		System.out.println("child class bro");
	}
	public void cantparent()
	{
		System.out.println("unavailable");
	}

	

}
