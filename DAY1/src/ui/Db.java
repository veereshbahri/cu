package ui;

public class Db {

	String name="Happy";
	String pass="123";
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}
	//BusinessLogic b=new BusinessLogic();
	
	public boolean isValid(User u)
	{
		if(name.equals(u.getId()))
				{
					if(pass.equals(u.getPwd()))
					{
						return true;
					}
				}
		return false;
	}
}
