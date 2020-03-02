package problem2;

public class Bonus {
	double bon;
	public double distributebonus(Department dp)
	{
		if(dp.getDname().equalsIgnoreCase("it"))
		{
			if(dp.getAddress().getCountry().equalsIgnoreCase("india"))
			{
				if(dp.getGender().equalsIgnoreCase("male") && (2020-dp.getYear()>5))
				{
					bon=dp.getSalary()*0.02 + dp.getSalary()*0.1;
				}
				if(dp.getGender().equalsIgnoreCase("female") && (2020-dp.getYear()>5))
				{
					bon=dp.getSalary()*0.02 + dp.getSalary()*0.12;
				}
				else if(2020-dp.getYear()<5)
				{
					bon=dp.getSalary()*0.02+ dp.getSalary()*0.05;
				}
				
			}
		}

		if(dp.getDname().equalsIgnoreCase("hr"))
		{
			if(dp.getAddress().getCountry().equalsIgnoreCase("india"))
			{
				if(dp.getGender().equalsIgnoreCase("male") && (2020-dp.getYear()>5))
				{
					bon=dp.getSalary()*0.02 + dp.getSalary()*0.1;
				}
				if(dp.getGender().equalsIgnoreCase("female") && (2020-dp.getYear()>5))
				{
					bon=dp.getSalary()*0.02 + dp.getSalary()*0.12;
				}
				else if(2020-dp.getYear()<5)
				{
					bon=dp.getSalary()*0.02+ dp.getSalary()*0.05;
				}
				
			}
		}
		return bon;
	}

}
