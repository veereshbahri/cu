
public class Tenth {
	public static void main(String[] args) {
		int yr=2020;
		boolean c=false;
		if(yr%4==0)
		{
			if(yr%100==0)
			{
				if(yr%400==0)
					c=true;
				else
					c=false;
				
			}
			else
				c=true;
		}
		else
		{
			c=false;
		}
		if(c)
			System.out.println("LEAP YEAR");
		else
			System.out.println("NOT LEAP YEAR");
	}

}
