package problem1;

public class Dao {
	String email[]= {"abc@gmail.com","happy1@gmail.com","veeresh123@gmail.com","vrb-123@gmail.com","98@yahoo.com"};
	String password[]= {"Qwerty88888","Qwerty88888","Qwerty88888","Qwerty88888","Qwerty88888"};
	BusinessLogic b1=new BusinessLogic();
	public void validation(UserBean u) throws InvalidException
	{
		boolean con=b1.valids(u);
		if(con)
		{
			for(int i=0;i<5;i++)
			{
				if(u.getEmail().equals(email[i]))
				{
					if(u.getPassword().equals(password[i]))
					{
						
						System.out.println("user with email-"+u.getEmail()+"  is valid");
					}
					else {
						throw new InvalidException("Password incorrect");
					}
				}
				//else {
				//	throw new InvalidException("Invalid email");
				//}
			}
			//throw new InvalidException("Invalid email");
			
		}
		else {
			throw new InvalidException("Invalid email");
		}
		
	}

}
