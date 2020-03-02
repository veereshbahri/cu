package ui;


public class BusinessLogic {
	Db d1=new Db();
	public void valids(User u)
	{
		boolean con=false;
		if(u.getId().length()==0)
		{
			System.out.println("Enter correct id ");
		}
		else if(u.getId().length()>0)
		{
			if(u.getPwd().length()==0)
			{
				System.out.println("Enter pwd");
			}
			else
			{
				con=true;
			}
		}
		if(con)
		{
			boolean x=d1.isValid(u);
			if(x)
			{
				System.out.println("VALID");
			}
			else {
				System.out.println("INVALID");
			}
		}
	}
	
	
}
