package Dayy;



public class Manager {
	public void findbonus(Employee emp)
	{
		if(emp.getDept().getName().equals("IT"))
		{
			double bonus=0.5*emp.getSal();
			System.out.println(bonus);
		}
	}

}
