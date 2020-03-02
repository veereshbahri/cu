package problem1;

public class BusinessLogic {
	boolean cdn=false;
	String check="([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})";
	public boolean valids(UserBean u) throws InvalidException
	{
			if(u.getEmail().length()>0 && u.getPassword().length()>0)
				{
					if(u.getEmail().matches(check))
					{
						if(u.getPassword().matches("[a-zA-Z0-9]{8,15}"))
						{
							cdn=true;
						}
						else {
							cdn=false;
						}
							
					}
					else
					{
						cdn=false;
					}
				}
			else
				cdn=false;
			if(!cdn)
				throw new InvalidException("delegation is improper");
			return cdn;
			
		
		
	}

}
