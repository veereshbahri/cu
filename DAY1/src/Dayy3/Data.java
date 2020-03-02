package Dayy3;

public class Data {
	public static void main(String[] args) {
		Sedan s1=new Sedan();
		s1.setName("Esteem");
		s1.setFuel("petrol");
		s1.setPower(1300);
		System.out.println(s1);
		Car c=new Sedan();
		c.display1();
		//c.bro+=1;
		System.out.println(c.bro);
		
		
	}

}
