package Employee;

public class Emp {

	private int id;
	private String name;
	private double sal;
	
	public void set(int id, String name, double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

		
}
