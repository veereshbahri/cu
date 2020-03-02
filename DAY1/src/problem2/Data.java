package problem2;

public class Data {
	public void display(Department d) {
		Bonus bonus=new Bonus();
		
		System.out.println("name is "+d.getName()+"\ngender is "+d.getGender()+"\nsalary is "+d.getSalary()+"\ndepartment is "+d.getDname()+"\nbonus is "+bonus.distributebonus(d));
		System.out.println("\n\n");
	}

	public void getData() {
		Department dp1=new Department("Ram", 31, "Male", 1200000,new Address("Delhi", "Delhi", "India"), 2013,"it");
		Department dp2=new Department("Mark", 25,"Male", 800000, new Address("Tokyo", "Tokyo", "Japan"), 2015,"it");
		Department dp3=new Department("Miley", 31, "Female", 1300000, new Address("Bangalore","Karnataka", "India"), 2014,"security");
		Department dp4=new Department("Eva", 35, "Female", 900000, new Address("Bangalore","Karnataka", "India"), 2011,"hr");
		
		Data data=new Data();
		data.display(dp1);
		data.display(dp2);
		data.display(dp3);
		data.display(dp4);
		
	}
}
