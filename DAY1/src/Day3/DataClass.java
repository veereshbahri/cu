package Day3;

public class DataClass {
	public static void main(String[] args) {
		Employee e1=new Employee("Raj", 21, new Address("Tokyo"), 20000);
		Employee e2=new Employee("NaV", 21, new Address("India"), 20000);
		Employee e3=new Employee("Rajesh", 21, new Address("Tokyo"), 10000);
		Employee e4=new Employee("Maj", 21, new Address("Tokyo"), 50000);
		Employee e[]={e1,e2,e3,e4};
		Department d1=new Department("HR", e);
		d1.getE()[2].getAdr().setName("usa");
		System.out.println(d1.getE()[2].getAdr().getName());
		
	}

}
